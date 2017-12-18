package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EST_PROJECT_MASTER")
public class EstProjectMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6406062920436672188L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ProjectID", unique = true)
	private String projectId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ClientID", nullable = false)
	private EstClientMaster estClientMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CountryID", nullable = false)
	private EstCountryMaster estCountryMaster;	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PracticeID", nullable = false)
	private EstPracticeMaster estPracticeMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RegionID", nullable = false)
	private EstRegionMaster estRegionMaster;
	
	@Column(name = "ProjectName", nullable = false, length = 60)
	private String projectName;	

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estProjectMaster")
	private Set<EstUserTxn> estUserTxns = new HashSet<EstUserTxn>(0);

	public EstProjectMaster() {
	}

	public EstProjectMaster(String projectId, EstClientMaster estClientMaster, EstPracticeMaster estPracticeMaster,
			String projectName) {
		this.projectId = projectId;
		this.estClientMaster = estClientMaster;
		this.estPracticeMaster = estPracticeMaster;
		this.projectName = projectName;
	}

	public EstProjectMaster(String projectId, EstClientMaster estClientMaster, EstPracticeMaster estPracticeMaster,
			String projectName, Set<EstUserTxn> estUserTxns) {
		this.projectId = projectId;
		this.estClientMaster = estClientMaster;
		this.estPracticeMaster = estPracticeMaster;
		this.projectName = projectName;
		this.estUserTxns = estUserTxns;
	}


	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public EstClientMaster getEstClientMaster() {
		return this.estClientMaster;
	}

	public void setEstClientMaster(EstClientMaster estClientMaster) {
		this.estClientMaster = estClientMaster;
	}

	public EstPracticeMaster getEstPracticeMaster() {
		return this.estPracticeMaster;
	}

	public void setEstPracticeMaster(EstPracticeMaster estPracticeMaster) {
		this.estPracticeMaster = estPracticeMaster;
	}
	
	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Set<EstUserTxn> getEstUserTxns() {
		return this.estUserTxns;
	}

	public void setEstUserTxns(Set<EstUserTxn> estUserTxns) {
		this.estUserTxns = estUserTxns;
	}

	public EstCountryMaster getEstCountryMaster() {
		return estCountryMaster;
	}

	public void setEstCountryMaster(EstCountryMaster estCountryMaster) {
		this.estCountryMaster = estCountryMaster;
	}

	public EstRegionMaster getEstRegionMaster() {
		return estRegionMaster;
	}

	public void setEstRegionMaster(EstRegionMaster estRegionMaster) {
		this.estRegionMaster = estRegionMaster;
	}

}
