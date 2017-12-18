package com.ey.estimator.rest.modal;

import java.util.List;

public class RegionStatusModal {

	private int status;
	private String message;
	private List<RegionModal> regions;
	
	
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
	public List<RegionModal> getRegions() {
		return regions;
	}
	public void setRegions(List<RegionModal> regions) {
		this.regions = regions;
	}
	
	
}
