package com.ey.estimator.rest.modal;

import java.util.List;

public class LOBStatusModal {

	private int status;
	private String message;
	private List<LOBModal> lob;
	
	
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
	public List<LOBModal> getlob() {
		return lob;
	}
	public void setlob(List<LOBModal> lob) {
		this.lob = lob;
	}
	
	


}
