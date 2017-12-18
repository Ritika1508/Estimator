package com.ey.estimator.rest.modal;

import java.util.List;

public class PraticeStatusModal {

	private int status;
	private String message;
	private List<PraticeModal> pratices;

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

	public List<PraticeModal> getPratices() {
		return pratices;
	}

	public void setPratices(List<PraticeModal> pratices) {
		this.pratices = pratices;
	}

}
