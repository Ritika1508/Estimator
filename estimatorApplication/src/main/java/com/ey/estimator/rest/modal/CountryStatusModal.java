package com.ey.estimator.rest.modal;

import java.util.List;

public class CountryStatusModal {

	private int status;
	private String message;
	private List<CountryModal> country;
	
	
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
	public List<CountryModal> getCountry() {
		return country;
	}
	public void setCountry(List<CountryModal> country) {
		this.country = country;
	}
	
	
	
}
