package com.ey.estimator.rest.modal;

public class BaselineModal 
{
	private int baselineID;	
	private String productID;
	private String version;
	private String feature;
	private String featureType;
	private String useCase;	
	private String otbType;	
	private String moduleID;
	private String complexity;
	private String customization;
	private int total;
	
	public int getBaselineID() {
		return baselineID;
	}
	public void setBaselineID(int baselineID) {
		this.baselineID = baselineID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getFeatureType() {
		return featureType;
	}
	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}
	public String getUseCase() {
		return useCase;
	}
	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}
	public String getOtbType() {
		return otbType;
	}
	public void setOtbType(String otbType) {
		this.otbType = otbType;
	}
	public String getModuleID() {
		return moduleID;
	}
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	public String getCustomization() {
		return customization;
	}
	public void setCustomization(String customization) {
		this.customization = customization;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}	
}
