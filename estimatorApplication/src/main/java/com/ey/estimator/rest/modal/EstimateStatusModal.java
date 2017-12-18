package com.ey.estimator.rest.modal;

import java.util.List;

public class EstimateStatusModal {
	
	private int status;
	private String message;
	private List<EstimationModal> estimateList;	
	
	public List<EstimationModal> getEstimateList() {
		return estimateList;
	}
	public void setEstimateList(List<EstimationModal> estimateList) {
		this.estimateList = estimateList;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
