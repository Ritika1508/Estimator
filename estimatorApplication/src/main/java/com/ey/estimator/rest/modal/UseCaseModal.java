package com.ey.estimator.rest.modal;

public class UseCaseModal 
{
	private int useCaseID;
	private String useCase;
	private String featureID;
	private String moduleID;
	
	public int getUseCaseID() {
		return useCaseID;
	}
	public void setUseCaseID(int useCaseID) {
		this.useCaseID = useCaseID;
	}
	public String getUseCase() {
		return useCase;
	}
	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}
	public String getFeatureID() {
		return featureID;
	}
	public void setFeatureID(String featureID) {
		this.featureID = featureID;
	}
	public String getModuleID() {
		return moduleID;
	}
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	
}
