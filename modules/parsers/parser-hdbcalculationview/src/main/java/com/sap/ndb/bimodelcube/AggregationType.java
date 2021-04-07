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

package com.sap.ndb.bimodelcube;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for AggregationType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="AggregationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="sum"/&gt;
 *     &lt;enumeration value="min"/&gt;
 *     &lt;enumeration value="max"/&gt;
 *     &lt;enumeration value="count"/&gt;
 *     &lt;enumeration value="avg"/&gt;
 *     &lt;enumeration value="var"/&gt;
 *     &lt;enumeration value="stddev"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "AggregationType")
@XmlEnum
public enum AggregationType {
  @XmlEnumValue("sum")
  SUM("sum"),
  @XmlEnumValue("min")
  MIN("min"),
  @XmlEnumValue("max")
  MAX("max"),
  @XmlEnumValue("count")
  COUNT("count"),

  /** Average defined as SUM( column ) / COUNT( column ) */
  @XmlEnumValue("avg")
  AVG("avg"),

  /**
   * Standard deviation: Sum over the squares of the differences to the average divided by (COUNT-1)
   */
  @XmlEnumValue("var")
  VAR("var"),

  /** Standard deviation: Square root of the variance */
  @XmlEnumValue("stddev")
  STDDEV("stddev");
  private final String value;

  AggregationType(String v) {
    value = v;
  }

  public String value() {
    return value;
  }

  public static AggregationType fromValue(String v) {
    for (AggregationType c : AggregationType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }
}
