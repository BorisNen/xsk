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

package com.sap.ndb.bimodelcalculation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.sap.ndb.bimodelconversion.Parameterization;

/**
 * Models the part of SQL windows functions that are supported by the calc engine
 *
 * <p>Java class for WindowFunction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="WindowFunction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partitionViewAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="order" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}Order" maxOccurs="unbounded"/&gt;
 *         &lt;element name="rankThreshold" type="{http://www.sap.com/ndb/BiModelConversion.ecore}Parameterization"/&gt;
 *         &lt;element name="rankViewAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="type" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}TopType" /&gt;
 *       &lt;attribute name="olympicRanking" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="dynamicPartitionAttributes" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "WindowFunction",
    propOrder = {"partitionViewAttributeName", "order", "rankThreshold", "rankViewAttributeName"})
public class WindowFunction {

  @XmlElement(required = true)
  protected List<String> partitionViewAttributeName;

  @XmlElement(required = true)
  protected List<Order> order;

  @XmlElement(required = true)
  protected Parameterization rankThreshold;

  protected String rankViewAttributeName;

  @XmlAttribute(name = "type")
  protected TopType type;

  @XmlAttribute(name = "olympicRanking")
  protected Boolean olympicRanking;

  @XmlAttribute(name = "dynamicPartitionAttributes")
  protected Boolean dynamicPartitionAttributes;

  /**
   * Gets the value of the partitionViewAttributeName property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the partitionViewAttributeName property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getPartitionViewAttributeName().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link String }
   */
  public List<String> getPartitionViewAttributeName() {
    if (partitionViewAttributeName == null) {
      partitionViewAttributeName = new ArrayList<String>();
    }
    return this.partitionViewAttributeName;
  }

  /**
   * Gets the value of the order property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the order property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getOrder().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link Order }
   */
  public List<Order> getOrder() {
    if (order == null) {
      order = new ArrayList<Order>();
    }
    return this.order;
  }

  /**
   * Gets the value of the rankThreshold property.
   *
   * @return possible object is {@link Parameterization }
   */
  public Parameterization getRankThreshold() {
    return rankThreshold;
  }

  /**
   * Sets the value of the rankThreshold property.
   *
   * @param value allowed object is {@link Parameterization }
   */
  public void setRankThreshold(Parameterization value) {
    this.rankThreshold = value;
  }

  /**
   * Gets the value of the rankViewAttributeName property.
   *
   * @return possible object is {@link String }
   */
  public String getRankViewAttributeName() {
    return rankViewAttributeName;
  }

  /**
   * Sets the value of the rankViewAttributeName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setRankViewAttributeName(String value) {
    this.rankViewAttributeName = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is {@link TopType }
   */
  public TopType getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is {@link TopType }
   */
  public void setType(TopType value) {
    this.type = value;
  }

  /**
   * Gets the value of the olympicRanking property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isOlympicRanking() {
    return olympicRanking;
  }

  /**
   * Sets the value of the olympicRanking property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setOlympicRanking(Boolean value) {
    this.olympicRanking = value;
  }

  /**
   * Gets the value of the dynamicPartitionAttributes property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isDynamicPartitionAttributes() {
    return dynamicPartitionAttributes;
  }

  /**
   * Sets the value of the dynamicPartitionAttributes property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setDynamicPartitionAttributes(Boolean value) {
    this.dynamicPartitionAttributes = value;
  }
}
