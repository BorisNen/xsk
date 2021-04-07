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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.3.0
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.11.26 at 10:54:28 AM EET
//

package com.sap.ndb.bimodelvariable;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.ndb.bimodeldatafoundation.ColumnFilter;

/**
 * Defines how the derived parameter is automatically filled at runtime. -Parameter might be filled
 * by reading from a table column. Then the resourceUri must point to a table and resultElementName
 * must be filled. Optionally columnFilter can be provided. -Parameter might be filled by a
 * procedure or scalar function which has exactly one scalar output parameter. Then resourceUri must
 * point to the procedure/function and (optionally) variableMapping can be filled
 *
 * <p>Java class for DerivationRule complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DerivationRule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="resourceUri" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}RepositoryUri"/&gt;
 *           &lt;element name="procedureName" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}FQName"/&gt;
 *           &lt;element name="scalarFunctionName" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}FQName"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="resultElementName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" minOccurs="0"/&gt;
 *             &lt;element name="columnFilter" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}ColumnFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="variableMapping" type="{http://www.sap.com/ndb/BiModelVariable.ecore}AbstractVariableMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="inputEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "DerivationRule",
    propOrder = {
      "resourceUri",
      "procedureName",
      "scalarFunctionName",
      "resultElementName",
      "columnFilter",
      "variableMapping"
    })
public class DerivationRule {

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String resourceUri;

  protected String procedureName;
  protected String scalarFunctionName;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String resultElementName;

  protected List<ColumnFilter> columnFilter;
  protected List<AbstractVariableMapping> variableMapping;

  @XmlAttribute(name = "inputEnabled")
  protected Boolean inputEnabled;

  /**
   * Gets the value of the resourceUri property.
   *
   * @return possible object is {@link String }
   */
  public String getResourceUri() {
    return resourceUri;
  }

  /**
   * Sets the value of the resourceUri property.
   *
   * @param value allowed object is {@link String }
   */
  public void setResourceUri(String value) {
    this.resourceUri = value;
  }

  /**
   * Gets the value of the procedureName property.
   *
   * @return possible object is {@link String }
   */
  public String getProcedureName() {
    return procedureName;
  }

  /**
   * Sets the value of the procedureName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setProcedureName(String value) {
    this.procedureName = value;
  }

  /**
   * Gets the value of the scalarFunctionName property.
   *
   * @return possible object is {@link String }
   */
  public String getScalarFunctionName() {
    return scalarFunctionName;
  }

  /**
   * Sets the value of the scalarFunctionName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setScalarFunctionName(String value) {
    this.scalarFunctionName = value;
  }

  /**
   * Gets the value of the resultElementName property.
   *
   * @return possible object is {@link String }
   */
  public String getResultElementName() {
    return resultElementName;
  }

  /**
   * Sets the value of the resultElementName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setResultElementName(String value) {
    this.resultElementName = value;
  }

  /**
   * Gets the value of the columnFilter property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the columnFilter property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getColumnFilter().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ColumnFilter }
   */
  public List<ColumnFilter> getColumnFilter() {
    if (columnFilter == null) {
      columnFilter = new ArrayList<ColumnFilter>();
    }
    return this.columnFilter;
  }

  /**
   * Gets the value of the variableMapping property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the variableMapping property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getVariableMapping().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link AbstractVariableMapping }
   */
  public List<AbstractVariableMapping> getVariableMapping() {
    if (variableMapping == null) {
      variableMapping = new ArrayList<AbstractVariableMapping>();
    }
    return this.variableMapping;
  }

  /**
   * Gets the value of the inputEnabled property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isInputEnabled() {
    return inputEnabled;
  }

  /**
   * Sets the value of the inputEnabled property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setInputEnabled(Boolean value) {
    this.inputEnabled = value;
  }
}
