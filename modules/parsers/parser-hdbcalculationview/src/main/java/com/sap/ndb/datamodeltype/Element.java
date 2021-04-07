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

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import com.sap.ndb.basemodelbase.NameValuePair;
import com.sap.ndb.searchmodelsearch.SearchableElementProperties;

/**
 * Typed component / element of a structure / table / view The description of the element is taken
 * from the type
 *
 * <p>Java class for Element complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Element"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelType.ecore}TypedObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calculationDefinition" type="{http://www.sap.com/ndb/DataModelType.ecore}Expression" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="unitCurrencyElement" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" minOccurs="0"/&gt;
 *           &lt;element name="fixedCurrency" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Currency" minOccurs="0"/&gt;
 *           &lt;element name="fixedUnit" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Unit" minOccurs="0"/&gt;
 *           &lt;element name="currencyConversion" type="{http://www.sap.com/ndb/DataModelType.ecore}CurrencyConversion" minOccurs="0"/&gt;
 *           &lt;element name="unitConversion" type="{http://www.sap.com/ndb/DataModelType.ecore}UnitConversion" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="labelElement" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="quickInfoElement" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="elementRelationship" type="{http://www.sap.com/ndb/DataModelType.ecore}ElementRelationship" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="restriction" type="{http://www.sap.com/ndb/DataModelType.ecore}ElementRefFilter" maxOccurs="unbounded"/&gt;
 *           &lt;element name="restrictionExpression" type="{http://www.sap.com/ndb/DataModelType.ecore}Expression"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="exceptionAggregationStep" type="{http://www.sap.com/ndb/DataModelType.ecore}ExceptionAggregationStep" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="searchProperties" type="{http://www.sap.com/ndb/SearchModelSearch.ecore}SearchableElementProperties" minOccurs="0"/&gt;
 *         &lt;element name="genericProperty" type="{http://www.sap.com/ndb/BaseModelBase.ecore}NameValuePair" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="runtime" type="{http://www.sap.com/ndb/DataModelType.ecore}ElementRuntime" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="transient" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="keep" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="transparentFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="nullable" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="aggregationBehavior" type="{http://www.sap.com/ndb/DataModelType.ecore}AggregationBehavior" /&gt;
 *       &lt;attribute name="engineAggregation" type="{http://www.sap.com/ndb/DataModelType.ecore}AggregationBehavior" /&gt;
 *       &lt;attribute name="drillDownEnablement" type="{http://www.sap.com/ndb/DataModelType.ecore}DrillDownEnablement" default="DRILL_DOWN" /&gt;
 *       &lt;attribute name="attributeHierarchyDefaultMember" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DefaultMember" /&gt;
 *       &lt;attribute name="calculateBeforeAggregation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="infoObjectName" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="displayFolder" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="restricted" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="sharedDimension" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}FQName" /&gt;
 *       &lt;attribute name="nameInSharedDimension" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
    name = "Element",
    propOrder = {
      "calculationDefinition",
      "unitCurrencyElement",
      "fixedCurrency",
      "fixedUnit",
      "currencyConversion",
      "unitConversion",
      "labelElement",
      "quickInfoElement",
      "elementRelationship",
      "restriction",
      "restrictionExpression",
      "exceptionAggregationStep",
      "searchProperties",
      "genericProperty",
      "runtime"
    })
public class Element extends TypedObject {

  protected Expression calculationDefinition;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String unitCurrencyElement;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NMTOKEN")
  protected String fixedCurrency;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "NMTOKEN")
  protected String fixedUnit;

  protected CurrencyConversion currencyConversion;
  protected UnitConversion unitConversion;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String labelElement;

  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String quickInfoElement;

  protected List<ElementRelationship> elementRelationship;
  protected List<ElementRefFilter> restriction;
  protected Expression restrictionExpression;
  protected List<ExceptionAggregationStep> exceptionAggregationStep;
  protected SearchableElementProperties searchProperties;
  protected List<NameValuePair> genericProperty;
  protected ElementRuntime runtime;

  @XmlAttribute(name = "transient")
  protected Boolean _transient;

  @XmlAttribute(name = "hidden")
  protected Boolean hidden;

  @XmlAttribute(name = "keep")
  protected Boolean keep;

  @XmlAttribute(name = "transparentFilter")
  protected Boolean transparentFilter;

  @XmlAttribute(name = "nullable")
  protected Boolean nullable;

  @XmlAttribute(name = "aggregationBehavior")
  protected AggregationBehavior aggregationBehavior;

  @XmlAttribute(name = "engineAggregation")
  protected AggregationBehavior engineAggregation;

  @XmlAttribute(name = "drillDownEnablement")
  protected DrillDownEnablement drillDownEnablement;

  @XmlAttribute(name = "attributeHierarchyDefaultMember")
  protected String attributeHierarchyDefaultMember;

  @XmlAttribute(name = "calculateBeforeAggregation")
  protected Boolean calculateBeforeAggregation;

  @XmlAttribute(name = "infoObjectName")
  protected String infoObjectName;

  @XmlAttribute(name = "displayFolder")
  protected String displayFolder;

  @XmlAttribute(name = "restricted")
  protected Boolean restricted;

  @XmlAttribute(name = "sharedDimension")
  protected String sharedDimension;

  @XmlAttribute(name = "nameInSharedDimension")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String nameInSharedDimension;

  /**
   * Gets the value of the calculationDefinition property.
   *
   * @return possible object is {@link Expression }
   */
  public Expression getCalculationDefinition() {
    return calculationDefinition;
  }

  /**
   * Sets the value of the calculationDefinition property.
   *
   * @param value allowed object is {@link Expression }
   */
  public void setCalculationDefinition(Expression value) {
    this.calculationDefinition = value;
  }

  /**
   * Gets the value of the unitCurrencyElement property.
   *
   * @return possible object is {@link String }
   */
  public String getUnitCurrencyElement() {
    return unitCurrencyElement;
  }

  /**
   * Sets the value of the unitCurrencyElement property.
   *
   * @param value allowed object is {@link String }
   */
  public void setUnitCurrencyElement(String value) {
    this.unitCurrencyElement = value;
  }

  /**
   * Gets the value of the fixedCurrency property.
   *
   * @return possible object is {@link String }
   */
  public String getFixedCurrency() {
    return fixedCurrency;
  }

  /**
   * Sets the value of the fixedCurrency property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFixedCurrency(String value) {
    this.fixedCurrency = value;
  }

  /**
   * Gets the value of the fixedUnit property.
   *
   * @return possible object is {@link String }
   */
  public String getFixedUnit() {
    return fixedUnit;
  }

  /**
   * Sets the value of the fixedUnit property.
   *
   * @param value allowed object is {@link String }
   */
  public void setFixedUnit(String value) {
    this.fixedUnit = value;
  }

  /**
   * Gets the value of the currencyConversion property.
   *
   * @return possible object is {@link CurrencyConversion }
   */
  public CurrencyConversion getCurrencyConversion() {
    return currencyConversion;
  }

  /**
   * Sets the value of the currencyConversion property.
   *
   * @param value allowed object is {@link CurrencyConversion }
   */
  public void setCurrencyConversion(CurrencyConversion value) {
    this.currencyConversion = value;
  }

  /**
   * Gets the value of the unitConversion property.
   *
   * @return possible object is {@link UnitConversion }
   */
  public UnitConversion getUnitConversion() {
    return unitConversion;
  }

  /**
   * Sets the value of the unitConversion property.
   *
   * @param value allowed object is {@link UnitConversion }
   */
  public void setUnitConversion(UnitConversion value) {
    this.unitConversion = value;
  }

  /**
   * Gets the value of the labelElement property.
   *
   * @return possible object is {@link String }
   */
  public String getLabelElement() {
    return labelElement;
  }

  /**
   * Sets the value of the labelElement property.
   *
   * @param value allowed object is {@link String }
   */
  public void setLabelElement(String value) {
    this.labelElement = value;
  }

  /**
   * Gets the value of the quickInfoElement property.
   *
   * @return possible object is {@link String }
   */
  public String getQuickInfoElement() {
    return quickInfoElement;
  }

  /**
   * Sets the value of the quickInfoElement property.
   *
   * @param value allowed object is {@link String }
   */
  public void setQuickInfoElement(String value) {
    this.quickInfoElement = value;
  }

  /**
   * Gets the value of the elementRelationship property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the elementRelationship property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getElementRelationship().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ElementRelationship }
   */
  public List<ElementRelationship> getElementRelationship() {
    if (elementRelationship == null) {
      elementRelationship = new ArrayList<ElementRelationship>();
    }
    return this.elementRelationship;
  }

  /**
   * Gets the value of the restriction property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the restriction property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getRestriction().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ElementRefFilter }
   */
  public List<ElementRefFilter> getRestriction() {
    if (restriction == null) {
      restriction = new ArrayList<ElementRefFilter>();
    }
    return this.restriction;
  }

  /**
   * Gets the value of the restrictionExpression property.
   *
   * @return possible object is {@link Expression }
   */
  public Expression getRestrictionExpression() {
    return restrictionExpression;
  }

  /**
   * Sets the value of the restrictionExpression property.
   *
   * @param value allowed object is {@link Expression }
   */
  public void setRestrictionExpression(Expression value) {
    this.restrictionExpression = value;
  }

  /**
   * Gets the value of the exceptionAggregationStep property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the exceptionAggregationStep property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getExceptionAggregationStep().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link ExceptionAggregationStep }
   */
  public List<ExceptionAggregationStep> getExceptionAggregationStep() {
    if (exceptionAggregationStep == null) {
      exceptionAggregationStep = new ArrayList<ExceptionAggregationStep>();
    }
    return this.exceptionAggregationStep;
  }

  /**
   * Gets the value of the searchProperties property.
   *
   * @return possible object is {@link SearchableElementProperties }
   */
  public SearchableElementProperties getSearchProperties() {
    return searchProperties;
  }

  /**
   * Sets the value of the searchProperties property.
   *
   * @param value allowed object is {@link SearchableElementProperties }
   */
  public void setSearchProperties(SearchableElementProperties value) {
    this.searchProperties = value;
  }

  /**
   * Gets the value of the genericProperty property.
   *
   * <p>This accessor method returns a reference to the live list, not a snapshot. Therefore any
   * modification you make to the returned list will be present inside the JAXB object. This is why
   * there is not a <CODE>set</CODE> method for the genericProperty property.
   *
   * <p>For example, to add a new item, do as follows:
   *
   * <pre>
   *    getGenericProperty().add(newItem);
   * </pre>
   *
   * <p>Objects of the following type(s) are allowed in the list {@link NameValuePair }
   */
  public List<NameValuePair> getGenericProperty() {
    if (genericProperty == null) {
      genericProperty = new ArrayList<NameValuePair>();
    }
    return this.genericProperty;
  }

  /**
   * Gets the value of the runtime property.
   *
   * @return possible object is {@link ElementRuntime }
   */
  public ElementRuntime getRuntime() {
    return runtime;
  }

  /**
   * Sets the value of the runtime property.
   *
   * @param value allowed object is {@link ElementRuntime }
   */
  public void setRuntime(ElementRuntime value) {
    this.runtime = value;
  }

  /**
   * Gets the value of the transient property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isTransient() {
    return _transient;
  }

  /**
   * Sets the value of the transient property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setTransient(Boolean value) {
    this._transient = value;
  }

  /**
   * Gets the value of the hidden property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isHidden() {
    return hidden;
  }

  /**
   * Sets the value of the hidden property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setHidden(Boolean value) {
    this.hidden = value;
  }

  /**
   * Gets the value of the keep property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isKeep() {
    return keep;
  }

  /**
   * Sets the value of the keep property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setKeep(Boolean value) {
    this.keep = value;
  }

  /**
   * Gets the value of the transparentFilter property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isTransparentFilter() {
    return transparentFilter;
  }

  /**
   * Sets the value of the transparentFilter property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setTransparentFilter(Boolean value) {
    this.transparentFilter = value;
  }

  /**
   * Gets the value of the nullable property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isNullable() {
    return nullable;
  }

  /**
   * Sets the value of the nullable property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setNullable(Boolean value) {
    this.nullable = value;
  }

  /**
   * Gets the value of the aggregationBehavior property.
   *
   * @return possible object is {@link AggregationBehavior }
   */
  public AggregationBehavior getAggregationBehavior() {
    return aggregationBehavior;
  }

  /**
   * Sets the value of the aggregationBehavior property.
   *
   * @param value allowed object is {@link AggregationBehavior }
   */
  public void setAggregationBehavior(AggregationBehavior value) {
    this.aggregationBehavior = value;
  }

  /**
   * Gets the value of the engineAggregation property.
   *
   * @return possible object is {@link AggregationBehavior }
   */
  public AggregationBehavior getEngineAggregation() {
    return engineAggregation;
  }

  /**
   * Sets the value of the engineAggregation property.
   *
   * @param value allowed object is {@link AggregationBehavior }
   */
  public void setEngineAggregation(AggregationBehavior value) {
    this.engineAggregation = value;
  }

  /**
   * Gets the value of the drillDownEnablement property.
   *
   * @return possible object is {@link DrillDownEnablement }
   */
  public DrillDownEnablement getDrillDownEnablement() {
    if (drillDownEnablement == null) {
      return DrillDownEnablement.DRILL_DOWN;
    } else {
      return drillDownEnablement;
    }
  }

  /**
   * Sets the value of the drillDownEnablement property.
   *
   * @param value allowed object is {@link DrillDownEnablement }
   */
  public void setDrillDownEnablement(DrillDownEnablement value) {
    this.drillDownEnablement = value;
  }

  /**
   * Gets the value of the attributeHierarchyDefaultMember property.
   *
   * @return possible object is {@link String }
   */
  public String getAttributeHierarchyDefaultMember() {
    return attributeHierarchyDefaultMember;
  }

  /**
   * Sets the value of the attributeHierarchyDefaultMember property.
   *
   * @param value allowed object is {@link String }
   */
  public void setAttributeHierarchyDefaultMember(String value) {
    this.attributeHierarchyDefaultMember = value;
  }

  /**
   * Gets the value of the calculateBeforeAggregation property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isCalculateBeforeAggregation() {
    return calculateBeforeAggregation;
  }

  /**
   * Sets the value of the calculateBeforeAggregation property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setCalculateBeforeAggregation(Boolean value) {
    this.calculateBeforeAggregation = value;
  }

  /**
   * Gets the value of the infoObjectName property.
   *
   * @return possible object is {@link String }
   */
  public String getInfoObjectName() {
    return infoObjectName;
  }

  /**
   * Sets the value of the infoObjectName property.
   *
   * @param value allowed object is {@link String }
   */
  public void setInfoObjectName(String value) {
    this.infoObjectName = value;
  }

  /**
   * Gets the value of the displayFolder property.
   *
   * @return possible object is {@link String }
   */
  public String getDisplayFolder() {
    return displayFolder;
  }

  /**
   * Sets the value of the displayFolder property.
   *
   * @param value allowed object is {@link String }
   */
  public void setDisplayFolder(String value) {
    this.displayFolder = value;
  }

  /**
   * Gets the value of the restricted property.
   *
   * @return possible object is {@link Boolean }
   */
  public Boolean isRestricted() {
    return restricted;
  }

  /**
   * Sets the value of the restricted property.
   *
   * @param value allowed object is {@link Boolean }
   */
  public void setRestricted(Boolean value) {
    this.restricted = value;
  }

  /**
   * Gets the value of the sharedDimension property.
   *
   * @return possible object is {@link String }
   */
  public String getSharedDimension() {
    return sharedDimension;
  }

  /**
   * Sets the value of the sharedDimension property.
   *
   * @param value allowed object is {@link String }
   */
  public void setSharedDimension(String value) {
    this.sharedDimension = value;
  }

  /**
   * Gets the value of the nameInSharedDimension property.
   *
   * @return possible object is {@link String }
   */
  public String getNameInSharedDimension() {
    return nameInSharedDimension;
  }

  /**
   * Sets the value of the nameInSharedDimension property.
   *
   * @param value allowed object is {@link String }
   */
  public void setNameInSharedDimension(String value) {
    this.nameInSharedDimension = value;
  }
}
