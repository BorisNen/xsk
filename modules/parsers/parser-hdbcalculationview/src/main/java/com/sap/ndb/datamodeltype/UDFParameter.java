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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Fixed parameter for a UDF it can be filled with - a constant - an element - a parameter We will
 * use annotations of the concrete model element to specify what kind of parameterization should be
 * allowed
 *
 * <p>Java class for UDFParameter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UDFParameter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice minOccurs="0"&gt;
 *         &lt;element name="constantValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="element" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier"/&gt;
 *         &lt;element name="parameter" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "UDFParameter",
    propOrder = {"constantValue", "element", "parameter"})
public class UDFParameter {

  protected String constantValue;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String element;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String parameter;

  /**
   * Gets the value of the constantValue property.
   *
   * @return possible object is {@link String }
   */
  public String getConstantValue() {
    return constantValue;
  }

  /**
   * Sets the value of the constantValue property.
   *
   * @param value allowed object is {@link String }
   */
  public void setConstantValue(String value) {
    this.constantValue = value;
  }

  /**
   * Gets the value of the element property.
   *
   * @return possible object is {@link String }
   */
  public String getElement() {
    return element;
  }

  /**
   * Sets the value of the element property.
   *
   * @param value allowed object is {@link String }
   */
  public void setElement(String value) {
    this.element = value;
  }

  /**
   * Gets the value of the parameter property.
   *
   * @return possible object is {@link String }
   */
  public String getParameter() {
    return parameter;
  }

  /**
   * Sets the value of the parameter property.
   *
   * @param value allowed object is {@link String }
   */
  public void setParameter(String value) {
    this.parameter = value;
  }
}
