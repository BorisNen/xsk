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

import javax.xml.bind.annotation.XmlRegistry;

/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the com.sap.ndb.datamodelhierarchy package.
 *
 * <p>An ObjectFactory allows you to programatically construct new instances of the Java
 * representation for XML content. The Java representation of XML content can consist of schema
 * derived interfaces and classes representing the binding of schema type definitions, element
 * declarations and model groups. Factory methods for each of these are provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: com.sap.ndb.datamodelhierarchy
   */
  public ObjectFactory() {}

  /** Create an instance of {@link LeveledHierarchy } */
  public LeveledHierarchy createLeveledHierarchy() {
    return new LeveledHierarchy();
  }

  /** Create an instance of {@link Level } */
  public Level createLevel() {
    return new Level();
  }

  /** Create an instance of {@link ParentChildHierarchy } */
  public ParentChildHierarchy createParentChildHierarchy() {
    return new ParentChildHierarchy();
  }

  /** Create an instance of {@link ParentDefinition } */
  public ParentDefinition createParentDefinition() {
    return new ParentDefinition();
  }

  /** Create an instance of {@link HierarchyTimeProperties } */
  public HierarchyTimeProperties createHierarchyTimeProperties() {
    return new HierarchyTimeProperties();
  }

  /** Create an instance of {@link EdgeAttribute } */
  public EdgeAttribute createEdgeAttribute() {
    return new EdgeAttribute();
  }

  /** Create an instance of {@link HierarchyParameterization } */
  public HierarchyParameterization createHierarchyParameterization() {
    return new HierarchyParameterization();
  }

  /** Create an instance of {@link HierarchyLeveledParameterization } */
  public HierarchyLeveledParameterization createHierarchyLeveledParameterization() {
    return new HierarchyLeveledParameterization();
  }

  /** Create an instance of {@link Levels } */
  public Levels createLevels() {
    return new Levels();
  }

  /** Create an instance of {@link HierarchyTemporalParameterization } */
  public HierarchyTemporalParameterization createHierarchyTemporalParameterization() {
    return new HierarchyTemporalParameterization();
  }

  /** Create an instance of {@link HierarchySpanTreeParameterization } */
  public HierarchySpanTreeParameterization createHierarchySpanTreeParameterization() {
    return new HierarchySpanTreeParameterization();
  }

  /** Create an instance of {@link HierarchyDescendantsParameterization } */
  public HierarchyDescendantsParameterization createHierarchyDescendantsParameterization() {
    return new HierarchyDescendantsParameterization();
  }

  /** Create an instance of {@link HierarchyAncestorsParameterization } */
  public HierarchyAncestorsParameterization createHierarchyAncestorsParameterization() {
    return new HierarchyAncestorsParameterization();
  }

  /** Create an instance of {@link HierarchySiblingsParameterization } */
  public HierarchySiblingsParameterization createHierarchySiblingsParameterization() {
    return new HierarchySiblingsParameterization();
  }

  /** Create an instance of {@link Start } */
  public Start createStart() {
    return new Start();
  }
}
