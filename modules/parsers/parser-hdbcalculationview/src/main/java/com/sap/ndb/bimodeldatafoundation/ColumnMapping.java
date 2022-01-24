/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2022 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.bimodeldatafoundation;

import com.sap.ndb.basemodelbase.QualifiedColumnObjectName;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for mapping BI objects to a column of a catalog table.	A
 * ttention: When comparing to an instance of QualifiedSqlObjectName or QualifiedColumnObjectName it is considered equal
 * if the name and the schema name are equal (the column name is ignored)
 *
 *
 * <p>Java class for ColumnMapping complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ColumnMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BaseModelBase.ecore}QualifiedColumnObjectName"&gt;
 *       &lt;attribute name="columnName" use="required" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnMapping")
public class ColumnMapping
    extends QualifiedColumnObjectName {

  @XmlAttribute(name = "columnName", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String columnName;

  /**
   * Gets the value of the columnName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getColumnName() {
    return columnName;
  }

  /**
   * Sets the value of the columnName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setColumnName(String value) {
    this.columnName = value;
  }

}
