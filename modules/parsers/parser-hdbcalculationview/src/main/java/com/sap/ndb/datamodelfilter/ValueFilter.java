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

package com.sap.ndb.datamodelfilter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for ValueFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ValueFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="operator" use="required" type="{http://www.sap.com/ndb/DataModelFilter.ecore}ValueFilterOperator" /&gt;
 *       &lt;attribute name="including" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ValueFilter")
@XmlSeeAlso({SingleValueFilter.class, ListValueFilter.class, RangeValueFilter.class})
public abstract class ValueFilter {

  @XmlAttribute(name = "operator", required = true)
  protected ValueFilterOperator operator;

  @XmlAttribute(name = "including")
  protected Boolean including;

  /**
   * Gets the value of the operator property.
   *
   * @return possible object is {@link ValueFilterOperator }
   */
  public ValueFilterOperator getOperator() {
    return operator;
  }

  /**
   * Sets the value of the operator property.
   *
   * @param value allowed object is {@link ValueFilterOperator }
   */
  public void setOperator(ValueFilterOperator value) {
    this.operator = value;
  }

  /**
   * Gets the value of the including property.
   *
   * @return possible object is {@link Boolean }
   */
  public boolean isIncluding() {
    if (including == null) {
      return true;
    } else {
      return including;
    }
  }

  /**
   * Sets the value of the including property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setIncluding(Boolean value) {
    this.including = value;
  }
}
