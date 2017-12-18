package com.ey.estimator.rest.modal;

import java.util.List;

public class UseCaseModalStatus 
{

	private int status;
	private String message;
	private List<UseCaseModal> useCaseList;	


	public List<UseCaseModal> getUseCaseList() {
		return useCaseList;
	}
	public void setUseCaseList(List<UseCaseModal> useCaseList) {
		this.useCaseList = useCaseList;
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



