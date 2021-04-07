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

package com.sap.ndb.datamodelhierarchy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * Java class for HierarchyFunction.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="HierarchyFunction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="HIERARCHY"/&gt;
 *     &lt;enumeration value="HIERARCHY_LEVELED"/&gt;
 *     &lt;enumeration value="HIERARCHY_TEMPORAL"/&gt;
 *     &lt;enumeration value="HIERARCHY_SPANTREE"/&gt;
 *     &lt;enumeration value="HIERARCHY_DESCENDANTS"/&gt;
 *     &lt;enumeration value="HIERARCHY_ANCESTORS"/&gt;
 *     &lt;enumeration value="HIERARCHY_SIBLINGS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "HierarchyFunction")
@XmlEnum
public enum HierarchyFunction {
  HIERARCHY,
  HIERARCHY_LEVELED,
  HIERARCHY_TEMPORAL,
  HIERARCHY_SPANTREE,
  HIERARCHY_DESCENDANTS,
  HIERARCHY_ANCESTORS,
  HIERARCHY_SIBLINGS;

  public String value() {
    return name();
  }

  public static HierarchyFunction fromValue(String v) {
    return valueOf(v);
  }
}
