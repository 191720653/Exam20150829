package com.hand.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Film entity. @author MyEclipse Persistence Tools
 */

public class Film implements java.io.Serializable {

	// Fields

	private Short filmId;
	private int languageId;
	private String title;
	private Short rentalDuration;
	private Double rentalRate;
	private Double replacementCost;
	private Timestamp lastUpdate;

	// Constructors

	/** default constructor */
	public Film() {
	}

	// Property accessors

	public Short getFilmId() {
		return this.filmId;
	}

	public void setFilmId(Short filmId) {
		this.filmId = filmId;
	}

	public int getLanguageId() {
		return languageId;
	}

	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Short getRentalDuration() {
		return this.rentalDuration;
	}

	public void setRentalDuration(Short rentalDuration) {
		this.rentalDuration = rentalDuration;
	}

	public Double getRentalRate() {
		return this.rentalRate;
	}

	public void setRentalRate(Double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public Double getReplacementCost() {
		return this.replacementCost;
	}

	public void setReplacementCost(Double replacementCost) {
		this.replacementCost = replacementCost;
	}

	public Timestamp getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Film [filmId=" + filmId + ", languageId=" + languageId + ", title=" + title + ", rentalDuration="
				+ rentalDuration + ", rentalRate=" + rentalRate + ", replacementCost=" + replacementCost
				+ ", lastUpdate=" + lastUpdate + "]";
	}
	
}