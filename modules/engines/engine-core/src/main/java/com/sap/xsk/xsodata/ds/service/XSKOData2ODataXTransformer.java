/*
 * Copyright (c) 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2020 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.xsodata.ds.service;

import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.apache.commons.io.FilenameUtils;
import org.eclipse.dirigible.database.persistence.model.PersistenceTableColumnModel;
import org.eclipse.dirigible.database.persistence.model.PersistenceTableModel;
import org.eclipse.dirigible.engine.odata2.transformers.DBMetadataUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sap.xsk.utils.XSKUtils;
import com.sap.xsk.xsodata.ds.model.XSKODataAssociation;
import com.sap.xsk.xsodata.ds.model.XSKODataEntity;
import com.sap.xsk.xsodata.ds.model.XSKODataModel;

@Singleton
public class XSKOData2ODataXTransformer {

  private static final Logger logger = LoggerFactory.getLogger(XSKOData2ODataXTransformer.class);

  @Inject private DBMetadataUtil dbMetadataUtil;

  public String[] transform(XSKODataModel model) throws SQLException {

    if (model.getService() == null) {
      logger.error(
          "Service element is null for xsodata file {}, so it will be skipped. Maybe the format is wrong and cannot be parsed.",
          model.getName());
    }

    String[] result = new String[2];
    StringBuilder buff = new StringBuilder();
    String namespace =
        model.getService().getNamespace() != null ? model.getService().getNamespace() : "Default";
    buff.append("<Schema Namespace=\"" + namespace + "\"\n")
        .append("    xmlns=\"http://schemas.microsoft.com/ado/2008/09/edm\">\n");

    StringBuilder associations = new StringBuilder();
    StringBuilder entitySets = new StringBuilder();
    StringBuilder associationsSets = new StringBuilder();
    for (XSKODataEntity entity : model.getService().getEntities()) {
      String tableName = XSKUtils.getTableName(entity);
      PersistenceTableModel tableMetadata = dbMetadataUtil.getTableMetadata(tableName);
      List<PersistenceTableColumnModel> idColumns =
          tableMetadata.getColumns().stream()
              .filter(PersistenceTableColumnModel::isPrimaryKey)
              .collect(Collectors.toList());

      if (idColumns == null || idColumns.isEmpty()) {
        logger.error(
            "Table {} not available for entity {}, so it will be skipped.",
            tableName,
            entity.getName());
        continue;
      }

      buff.append("    <EntityType Name=\"" + entity.getAlias() + "Type\">\n")
          .append("        <Key>\n");

      idColumns.forEach(
          column -> buff.append("            <PropertyRef Name=\"" + column.getName() + "\" />\n"));

      buff.append("        </Key>\n");
      tableMetadata
          .getColumns()
          .forEach(
              column ->
                  buff.append(
                      "        <Property Name=\""
                          + column.getName()
                          + "\""
                          + " Nullable=\""
                          + column.isNullable()
                          + "\""
                          + " Type=\""
                          + column.getType()
                          + "\"/>\n"));

      entity
          .getNavigates()
          .forEach(
              relation -> {
                XSKODataAssociation association =
                    XSKODataCoreService.getAssociation(
                        model, relation.getAssociation(), relation.getAlias());
                String fromRole = association.getPrincipal();
                String toRole = association.getDependent();
                buff.append(
                    "        <NavigationProperty Name=\""
                        + relation.getAlias()
                        + "\""
                        + " Relationship=\""
                        + model.getService().getNamespace()
                        + "."
                        + relation.getAssociation()
                        + "Type\""
                        + " FromRole=\""
                        + fromRole
                        + "Principal"
                        + "\""
                        + " ToRole=\""
                        + toRole
                        + "Dependent"
                        + "\"/>\n");
              });

      // keep associations for later use
      entity
          .getNavigates()
          .forEach(
              relation -> {
                XSKODataAssociation association =
                    XSKODataCoreService.getAssociation(
                        model, relation.getAssociation(), relation.getAlias());
                String fromRole = association.getPrincipal();
                String toRole = association.getDependent();
                String fromMultiplicity = association.getPrincipalMultiplicity();
                String toMultiplicity = association.getDependentMultiplicity();
                associations.append(
                    "    <Association Name=\""
                        + relation.getAssociation()
                        + "Type\">\n"
                        + "        <End Type=\""
                        + model.getService().getNamespace()
                        + "."
                        + fromRole
                        + "Type\""
                        + " Role=\""
                        + fromRole
                        + "Principal"
                        + "\" Multiplicity=\""
                        + fromMultiplicity
                        + "\"/>\n"
                        + "        <End Type=\""
                        + model.getService().getNamespace()
                        + "."
                        + toRole
                        + "Type\""
                        + " Role=\""
                        + toRole
                        + "Dependent"
                        + "\" Multiplicity=\""
                        + toMultiplicity
                        + "\"/>\n"
                        + "    </Association>\n");
              });

      // keep entity sets for later use
      entitySets.append(
          "        <EntitySet Name=\""
              + entity.getAlias()
              + "\" EntityType=\""
              + model.getService().getNamespace()
              + "."
              + entity.getAlias()
              + "Type\" />\n");

      // keep associations sets for later use
      entity
          .getNavigates()
          .forEach(
              relation -> {
                XSKODataAssociation association =
                    XSKODataCoreService.getAssociation(
                        model, relation.getAssociation(), relation.getAlias());
                String fromRole = association.getPrincipal();
                String toRole = association.getDependent();
                String fromSet = entity.getAlias();
                XSKODataEntity toSetEntity =
                    XSKODataCoreService.getEntity(model, toRole, relation.getAlias());
                String toSet = toSetEntity.getAlias();
                associationsSets.append(
                    "        <AssociationSet Name=\""
                        + relation.getAssociation()
                        + "\""
                        + " Association=\""
                        + model.getService().getNamespace()
                        + "."
                        + relation.getAssociation()
                        + "Type\">\n"
                        + "            <End Role=\""
                        + fromRole
                        + "Principal"
                        + "\""
                        + " EntitySet=\""
                        + fromSet
                        + "\"/>\n"
                        + "            <End Role=\""
                        + toRole
                        + "Dependent"
                        + "\""
                        + " EntitySet=\""
                        + toSet
                        + "\"/>\n"
                        + "        </AssociationSet>\n");
              });

      buff.append("    </EntityType>\n");
    }

    buff.append(associations.toString());

    StringBuilder container = new StringBuilder();
    //        buff.append("    <EntityContainer Name=\"" +
    // FilenameUtils.getBaseName(model.getName()) + "EntityContainer\"
    // m:IsDefaultEntityContainer=\"true\">\n");
    container.append(entitySets.toString());
    container.append(associationsSets.toString());
    //        buff.append("    </EntityContainer>\n");

    buff.append("</Schema>\n");

    result[0] = buff.toString();
    result[1] = container.toString();
    return result;
  }
}

/**
 * <Schema Namespace="org.apache.olingo.odata2.ODataCars"
 * xmlns="http://schemas.microsoft.com/ado/2008/09/edm"> <EntityType Name="Car"> <Key> <PropertyRef
 * Name="Id" /> </Key> <Property Name="Id" Type="Edm.Int32" Nullable="false" /> <Property
 * Name="Model" Type="Edm.String" Nullable="false" DefaultValue="Hugo" MaxLength="100"
 * m:FC_TargetPath="SyndicationTitle" /> <Property Name="ManufacturerId" Type="Edm.Int32" />
 * <Property Name="Price" Type="Edm.Decimal" /> <Property Name="Currency" Type="Edm.String"
 * MaxLength="3" /> <Property Name="ModelYear" Type="Edm.String" MaxLength="4" /> <Property
 * Name="Updated" Type="Edm.DateTime" Nullable="false" ConcurrencyMode="Fixed"
 * m:FC_TargetPath="SyndicationUpdated" /> <Property Name="ImagePath" Type="Edm.String" />
 * <NavigationProperty Name="Manufacturer"
 * Relationship="org.apache.olingo.odata2.ODataCars.Car_Manufacturer_Manufacturer_Cars"
 * FromRole="Car_Manufacturer" ToRole="Manufacturer_Cars" /> </EntityType> <EntityType
 * Name="Manufacturer"> <Key> <PropertyRef Name="Id" /> </Key> <Property Name="Id" Type="Edm.Int32"
 * Nullable="false" /> <Property Name="Name" Type="Edm.String" Nullable="false" MaxLength="100"
 * m:FC_TargetPath="SyndicationTitle" />
 * <!-- <Property Name="Address"
 * Type="org.apache.olingo.odata2.ODataCars.Address" /> -->
 * <Property Name="Updated" Type="Edm.DateTime" Nullable="false" ConcurrencyMode="Fixed"
 * m:FC_TargetPath="SyndicationUpdated" /> <NavigationProperty Name="Cars"
 * Relationship="org.apache.olingo.odata2.ODataCars.Car_Manufacturer_Manufacturer_Cars"
 * FromRole="Manufacturer_Cars" ToRole="Car_Manufacturer" /> </EntityType>
 * <!-- <ComplexType Name="Address">
 * <Property Name="Street" Type="Edm.String" />
 * <Property Name="City" Type="Edm.String" />
 * <Property Name="ZipCode" Type="Edm.String" />
 * <Property Name="Country" Type="Edm.String" />
 * </ComplexType> -->
 * <Association Name="Car_Manufacturer_Manufacturer_Cars"> <End
 * Type="org.apache.olingo.odata2.ODataCars.Car" Multiplicity="*" Role="Car_Manufacturer" /> <End
 * Type="org.apache.olingo.odata2.ODataCars.Manufacturer" Multiplicity="1" Role="Manufacturer_Cars"
 * /> </Association> <EntityContainer Name="ODataCarsEntityContainer"
 * m:IsDefaultEntityContainer="true"> <EntitySet Name="Cars"
 * EntityType="org.apache.olingo.odata2.ODataCars.Car" /> <EntitySet Name="Manufacturers"
 * EntityType="org.apache.olingo.odata2.ODataCars.Manufacturer" /> <AssociationSet
 * Name="Cars_Manufacturers"
 * Association="org.apache.olingo.odata2.ODataCars.Car_Manufacturer_Manufacturer_Cars"> <End
 * EntitySet="Manufacturers" Role="Manufacturer_Cars" /> <End EntitySet="Cars"
 * Role="Car_Manufacturer" /> </AssociationSet>
 * <!-- <FunctionImport Name="NumberOfCars"
 * ReturnType="Collection(org.apache.olingo.odata2.ODataCars.Car)"
 * m:HttpMethod="GET" /> -->
 * </EntityContainer> </Schema>
 */
