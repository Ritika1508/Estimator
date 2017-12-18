package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EST_REGION_MASTER")
public class EstRegionMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4878894720221172739L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "RegionID", unique = true)
	private String regionId;

	@Column(name = "RegionName",nullable = false, length = 60)
	private String regionName;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "estRegionMaster", cascade = CascadeType.ALL)
	private Set<EstCountryMaster> estCountryMasters = new HashSet<EstCountryMaster>(0);

	public EstRegionMaster() {
	}

	public EstRegionMaster(String regionId) {
		this.regionId = regionId;
	}

	public EstRegionMaster(String regionId, String regionName, Set<EstCountryMaster> estCountryMasters) {
		this.regionId = regionId;
		this.regionName = regionName;
		this.estCountryMasters = estCountryMasters;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}
	
	public Set<EstCountryMaster> getEstCountryMasters() {
		return this.estCountryMasters;
	}

	public void setEstCountryMasters(Set<EstCountryMaster> estCountryMasters) {
		this.estCountryMasters = estCountryMasters;
	}

}
