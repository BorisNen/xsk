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

package com.sap.ndb.datamodelgraph;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Operation with other operations as operands/arguments
 *
 * <p>Java class for CompoundOperation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CompoundOperation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelGraph.ecore}Operation"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operation" type="{http://www.sap.com/ndb/DataModelGraph.ecore}Operation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operator" use="required" type="{http://www.sap.com/ndb/DataModelGraph.ecore}CompoundOperator" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "CompoundOperation",
    propOrder = {"operation"})
public class CompoundOperation extends Operation {

  @XmlElement(required = true)
  protected List<Operation> operation;

  @XmlAttribute(name = "operator", required = true)
  protected CompoundOperator operator;

  /**
   * Gets the value of the operation property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the operation property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getOperation().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Operation }
   */
  public List<Operation> getOperation() {
    if (operation == null) {
      operation = new ArrayList<Operation>();
    }
    return this.operation;
  }

  /**
   * Gets the value of the operator property.
   *
   * @return possible object is {@link CompoundOperator }
   */
  public CompoundOperator getOperator() {
    return operator;
  }

  /**
   * Sets the value of the operator property.
   *
   * @param value allowed object is {@link CompoundOperator }
   */
  public void setOperator(CompoundOperator value) {
    this.operator = value;
  }
}
