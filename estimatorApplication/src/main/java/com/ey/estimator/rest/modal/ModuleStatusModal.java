package com.ey.estimator.rest.modal;

import java.util.List;

public class ModuleStatusModal {

	private int status;
	private String message;
	private List<ModuleModal> Modules;
	
	
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
	public List<ModuleModal> getModules() {
		return Modules;
	}
	public void setModules(List<ModuleModal> Modules) {
		this.Modules = Modules;
	}
	
	


}
