package com.hand.entity;

import java.sql.Timestamp;

public class Language implements java.io.Serializable {

	// Fields

	private Short languageId;
	private String name;
	private Timestamp lastUpdate;

	// Constructors

	/** default constructor */
	public Language() {
	}

	/** minimal constructor */
	public Language(String name, Timestamp lastUpdate) {
		this.name = name;
		this.lastUpdate = lastUpdate;
	}

	// Property accessors

	public Short getLanguageId() {
		return this.languageId;
	}

	public void setLanguageId(Short languageId) {
		this.languageId = languageId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}