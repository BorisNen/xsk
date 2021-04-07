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

package com.sap.ndb.bimodeldatafoundation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.ndb.basemodelbase.Descriptions;

/**
 * Defines an aliasing including a description. Usually when aliasing a technical name in a BI model
 * one also needs to adjust the descriptions. These object comprises both features
 *
 * <p>Java class for AliasWithDescription complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="AliasWithDescription"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptions" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Descriptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="alias" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "AliasWithDescription",
    propOrder = {"descriptions"})
@XmlSeeAlso({FeaturedAttributeReference.class})
public class AliasWithDescription {

  protected Descriptions descriptions;

  @XmlAttribute(name = "alias")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String alias;

  /**
   * Gets the value of the descriptions property.
   *
   * @return possible object is {@link Descriptions }
   */
  public Descriptions getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the value of the descriptions property.
   *
   * @param value allowed object is {@link Descriptions }
   */
  public void setDescriptions(Descriptions value) {
    this.descriptions = value;
  }

  /**
   * Gets the value of the alias property.
   *
   * @return possible object is {@link String }
   */
  public String getAlias() {
    return alias;
  }

  /**
   * Sets the value of the alias property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAlias(String value) {
    this.alias = value;
  }
}
