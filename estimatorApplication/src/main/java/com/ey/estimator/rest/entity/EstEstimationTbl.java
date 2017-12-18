package com.ey.estimator.rest.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "EST_ESTIMATION_TBL")
//@SequenceGenerator(name = "EstID_Seq",  initialValue = 1)*/
public class EstEstimationTbl implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6406062920456672188L;
	private int estId;
	private Date createdDate;
	private EstClientMaster clientID;
	private EstProjectMaster projectID;
	private EstRegionMaster regionID;
	private EstCountryMaster countryID;	
	private String estimationCode;
	private String version;
	private String userID;
	private String filePath;


	public EstEstimationTbl() {
	}

	public EstEstimationTbl(int estId, Date createdDate, EstClientMaster clientID, EstProjectMaster projectID,
			EstRegionMaster regionID, EstCountryMaster countryID) {
		this.estId = estId;
		this.createdDate = createdDate;
		this.clientID=clientID;
		this.projectID = projectID;
		this.regionID = regionID;
		this.countryID = countryID;
	}


	@Id
	@Column(name = "EstID", unique = true, nullable = false, length = 30)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getEstId() {
		return this.estId;
	}

	public void setEstId(int estId) {
		this.estId = estId;
	}



	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ProjectID", nullable = false)
	public EstProjectMaster getProjectID() {
		return projectID;
	}

	public void setProjectID(EstProjectMaster projectID) {
		this.projectID = projectID;
	}	

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ClientID", nullable = false)
	public EstClientMaster getClientID() {
		return clientID;
	}
	public void setClientID(EstClientMaster clientID) {
		this.clientID = clientID;
	}	

	@Column(name = "CreateDate", nullable = false, length = 60)
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "RegionID", nullable = false)
	public EstRegionMaster getRegionID() {
		return regionID;
	}

	public void setRegionID(EstRegionMaster regionID) {
		this.regionID = regionID;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CountryID", nullable = false)
	public EstCountryMaster getCountryID() {
		return countryID;
	}	

	public void setCountryID(EstCountryMaster countryID) {
		this.countryID = countryID;
	}
	@Column(name = "EstimationCode", nullable = false, length = 60)
	public String getEstimationCode() {
		return estimationCode;
	}

	public void setEstimationCode(String estimationCode) {
		this.estimationCode = estimationCode;
	}

	@Column(name = "Version", nullable = false, length = 60)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	@Column(name = "UserID", nullable = false, length = 60)
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
	@Column(name = "FilePath", nullable = false, length = 60)
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

}
