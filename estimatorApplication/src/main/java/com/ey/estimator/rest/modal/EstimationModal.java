package com.ey.estimator.rest.modal;

import java.util.Date;

public class EstimationModal 
{
	private int estID;
private String clientID;
private String projectID;
	
private String regionID;
private String countryID;
private String clientName;
private String projectName;
private String regionName;
private String countryName;

private String createDate;
	private Date fromDate;
	private Date toDate;

	private String version;
	private String filePath;
	private String estimationCode;
	private String UserID;
	private String PracticeID;
	public String getCreateDate() {
	return createDate;
}
public void setCreateDate(String createDate) {
	this.createDate = createDate;
	}

	public int getEstID() {
	return estID;
}
	public void setEstID(int estID) {
	this.estID = estID;
}
public String getClientID() {
	return clientID;
}
public void setClientID(String clientID) {
	this.clientID = clientID;
}
public String getProjectID() {
	return projectID;
}
public void setProjectID(String projectID) {
	this.projectID = projectID;
}
	/*public String getCreatedBy() {
	return createdBy;
}
public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
	}*/
public String getRegionID() {
	return regionID;
}
public void setRegionID(String regionID) {
	this.regionID = regionID;
}
public String getCountryID() {
	return countryID;
}
public void setCountryID(String countryID) {
	this.countryID = countryID;
}
public String getClientName() {
	return clientName;
}
public void setClientName(String clientName) {
	this.clientName = clientName;
}
public String getProjectName() {
	return projectName;
}
public void setProjectName(String projectName) {
	this.projectName = projectName;
}
public String getRegionName() {
	return regionName;
}
public void setRegionName(String regionName) {
	this.regionName = regionName;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getEstimationCode() {
		return estimationCode;
	}
	public void setEstimationCode(String estimationCode) {
		this.estimationCode = estimationCode;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public Date getToDate() {
		return toDate;
	}
	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	
	public String getPracticeID() {
		return PracticeID;
	}
	public void setPracticeID(String PracticeID) {
		this.PracticeID = PracticeID;
	}
}


