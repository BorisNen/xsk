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

package com.sap.ndb.datamodeltype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Container for one parent element - i.e. an elements that has a n:1 relationship with the current
 * element. Example for parent elements: T1 has the fields customer (key), city and mayor T2 has the
 * fields city (key) and country. The fields T1.city and T2.city are joined by an n:1 join. Then
 * country is a system derived parent attribute for city and mayor might be a manually entered
 * parent attribute. In the latter case the cardinality cannot be derived by the system.
 *
 * <p>Java class for ElementRelationship complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ElementRelationship"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="parent" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="type" type="{http://www.sap.com/ndb/DataModelType.ecore}ElementRelationshipType" default="MANUAL" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementRelationship")
public class ElementRelationship {

  @XmlAttribute(name = "parent", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String parent;

  @XmlAttribute(name = "type")
  protected ElementRelationshipType type;

  /**
   * Gets the value of the parent property.
   *
   * @return possible object is {@link String }
   */
  public String getParent() {
    return parent;
  }

  /**
   * Sets the value of the parent property.
   *
   * @param value allowed object is {@link String }
   */
  public void setParent(String value) {
    this.parent = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is {@link ElementRelationshipType }
   */
  public ElementRelationshipType getType() {
    if (type == null) {
      return ElementRelationshipType.MANUAL;
    } else {
      return type;
    }
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is {@link ElementRelationshipType }
   */
  public void setType(ElementRelationshipType value) {
    this.type = value;
  }
}
