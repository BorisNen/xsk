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


package com.sap.ndb.datamodeltype;

import com.sap.ndb.basemodelbase.EndUserTexts;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ElementMapping complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ElementMapping"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelType.ecore}AbstractElementMapping"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="targetEndUserTexts" type="{http://www.sap.com/ndb/BaseModelBase.ecore}EndUserTexts" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sourceName" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="transparentFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementMapping", propOrder = {
    "targetEndUserTexts"
})
public class ElementMapping
    extends AbstractElementMapping {

  protected EndUserTexts targetEndUserTexts;
  @XmlAttribute(name = "sourceName", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String sourceName;
  @XmlAttribute(name = "transparentFilter")
  protected Boolean transparentFilter;

  /**
   * Gets the value of the targetEndUserTexts property.
   *
   * @return possible object is
   * {@link EndUserTexts }
   */
  public EndUserTexts getTargetEndUserTexts() {
    return targetEndUserTexts;
  }

  /**
   * Sets the value of the targetEndUserTexts property.
   *
   * @param value allowed object is
   *              {@link EndUserTexts }
   */
  public void setTargetEndUserTexts(EndUserTexts value) {
    this.targetEndUserTexts = value;
  }

  /**
   * Gets the value of the sourceName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getSourceName() {
    return sourceName;
  }

  /**
   * Sets the value of the sourceName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setSourceName(String value) {
    this.sourceName = value;
  }

  /**
   * Gets the value of the transparentFilter property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isTransparentFilter() {
    return transparentFilter;
  }

  /**
   * Sets the value of the transparentFilter property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setTransparentFilter(Boolean value) {
    this.transparentFilter = value;
  }

}
