package com.ey.estimator.rest.modal;

import java.util.HashMap;
import java.util.List;

import com.ey.estimator.rest.entity.EstBaselineProductModule;

public class BaselineStatus 
{

	private int status;
	private String message;
	//private List<BaselineModal> baselineList;
	
	private HashMap<String,Object> baseLineMap = new HashMap<String,Object>();
	

	/*public List<BaselineModal> getBaselineList() {
		return baselineList;
	}
	public void setBaselineList(List<BaselineModal> baselineList) {
		this.baselineList = baselineList;
	}*/
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
	public HashMap<String,Object> getBaseLineMap() {
		return baseLineMap;
	}
	public void setBaseLineMap(HashMap<String,Object> baseLineMap) {
		this.baseLineMap = baseLineMap;
	}
	
}



