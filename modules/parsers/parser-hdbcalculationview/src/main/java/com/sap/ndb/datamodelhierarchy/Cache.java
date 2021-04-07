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
 * Java class for Cache.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <p>
 *
 * <pre>
 * &lt;simpleType name="Cache"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *     &lt;enumeration value="CACHE"/&gt;
 *     &lt;enumeration value="NO_CACHE"/&gt;
 *     &lt;enumeration value="CACHE_FORCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "Cache")
@XmlEnum
public enum Cache {

  /**
   * The generated hierarchy is cached if the system assesses the source to be reliably
   * deterministic. This is the default behavior.
   */
  CACHE,

  /** The generated hierarchy is not cached. */
  NO_CACHE,

  /**
   * The generated hierarchy is cached even if the source cannot be assessed to be reliably
   * deterministic.
   */
  CACHE_FORCE;

  public String value() {
    return name();
  }

  public static Cache fromValue(String v) {
    return valueOf(v);
  }
}
