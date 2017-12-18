package com.ey.estimator.rest.modal;

import java.util.List;

public class ProjectStatusModal {

	private int status;
	private String message;
	private List<ProjectModal> projects;
	
	
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
	public List<ProjectModal> getProjects() {
		return projects;
	}
	public void setProjects(List<ProjectModal> projects) {
		this.projects = projects;
	}
	
	
}
