package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "EST_COUNTRY_MASTER")
public class EstCountryMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9158584490461452165L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CountryID", unique = true)
	private String countryId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RegionID")
	private EstRegionMaster estRegionMaster;
	
	@Column(name = "CountryName", nullable = false, length = 60)
	private String countryName;

	public EstCountryMaster() {
	}

	public EstCountryMaster(String countryId) {
		this.countryId = countryId;
	}

	public EstCountryMaster(String countryId, EstRegionMaster estRegionMaster, String countryName) {
		this.countryId = countryId;
		this.estRegionMaster = estRegionMaster;
		this.countryName = countryName;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}


	public EstRegionMaster getEstRegionMaster() {
		return this.estRegionMaster;
	}

	public void setEstRegionMaster(EstRegionMaster estRegionMaster) {
		this.estRegionMaster = estRegionMaster;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

}
