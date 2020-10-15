/**
 * Copyright (c) 2010-2018 SAP
 */
package com.sap.xsk.hdb.ds.model;

/**
 * The column element of the table model.
 */
public class XSKDataStructureTableColumnModel {

	private String name;
	
	private String type;
	
	private String length;
	
	private boolean nullable;
	
	private boolean primaryKey;
	
	private String defaultValue;
	
	private String precision;
	
	private String scale;
	
	private boolean unique;

	/**
	 * The default constructor.
	 */
	public XSKDataStructureTableColumnModel() {

	}

	/**
	 * The constructor from the fields.
	 *
	 * @param name            the name
	 * @param type            the type
	 * @param length            the length
	 * @param nullable            whether null values are allowed
	 * @param primaryKey            whether it is a primary key
	 * @param defaultValue            the default value
	 * @param precision            the precision value for floating point types
	 * @param scale            the scale value for floating point types
	 * @param unique the unique
	 */
	public XSKDataStructureTableColumnModel(String name, String type, String length, boolean nullable, boolean primaryKey, String defaultValue,
			String precision, String scale, boolean unique) {
		super();
		this.name = name;
		this.type = type;
		this.length = length;
		this.nullable = nullable;
		this.primaryKey = primaryKey;
		this.defaultValue = defaultValue;
		this.precision = precision;
		this.scale = scale;
		this.unique = unique;
	}

	/**
	 * Getter for the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name.
	 *
	 * @param name            the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter for the type.
	 *
	 * @param type            the type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter for the length.
	 *
	 * @return the length
	 */
	public String getLength() {
		return length;
	}

	/**
	 * Setter for the length.
	 *
	 * @param length            the length
	 */
	public void setLength(String length) {
		this.length = length;
	}

	/**
	 * Check for nullable.
	 *
	 * @return true if can be null
	 */
	public boolean isNullable() {
		return nullable;
	}

	/**
	 * Setter for the nullable.
	 *
	 * @param nullable            whether null values are allowed
	 */
	public void setNullable(boolean nullable) {
		this.nullable = nullable;
	}

	/**
	 * Check for primary key.
	 *
	 * @return true if primary key
	 */
	public boolean isPrimaryKey() {
		return primaryKey;
	}

	/**
	 * Setter for the primary key.
	 *
	 * @param primaryKey            whether it is a primary key
	 */
	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	/**
	 * Getter for the default value.
	 *
	 * @return the default value
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * Setter for the default value.
	 *
	 * @param defaultValue            the default value
	 */
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	/**
	 * Getter for the precision value.
	 *
	 * @return the precision value
	 */
	public String getPrecision() {
		return precision;
	}

	/**
	 * Setter for the precision value.
	 *
	 * @param precision            the precision value
	 */
	public void setPrecision(String precision) {
		this.precision = precision;
	}

	/**
	 * Getter for the scale value.
	 *
	 * @return the scale value
	 */
	public String getScale() {
		return scale;
	}

	/**
	 * Setter for the scale value.
	 *
	 * @param scale            the scale value
	 */
	public void setScale(String scale) {
		this.scale = scale;
	}

	/**
	 * Check for unique.
	 *
	 * @return true if unique
	 */
	public boolean isUnique() {
		return unique;
	}

	/**
	 * Setter for the unique.
	 *
	 * @param unique            the unique value
	 */
	public void setUnique(boolean unique) {
		this.unique = unique;
	}

}
