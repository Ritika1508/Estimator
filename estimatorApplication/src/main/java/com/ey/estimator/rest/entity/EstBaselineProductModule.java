package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EST_BASELINE_PRODUCT_MODULE")
public class EstBaselineProductModule implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7017885892949536294L;
	private int baselineID;	
	private EstProductMaster productID;
	private String version;
	private String feature;
	private String featureType;
	private String useCase;	
	private String otbType;	
	private EstModuleMaster estModuleMaster;
	private String complexity;
	private String customization;
	private int total;	
	
	//private HashMap<EstModuleMaster,Object> baseLineMap = new HashMap<EstModuleMaster,Object>();

	public EstBaselineProductModule() {
	}

	public EstBaselineProductModule(int baselineID, EstProductMaster productID, String version, String feature, String featureType, String useCase, 
			String otbType, EstModuleMaster estModuleMaster, String complexity, String customization, int total)
	{
		this.baselineID=baselineID;
		this.productID=productID;
		this.version=version;
		this.feature=feature;
		this.featureType=featureType;
		this.useCase=useCase;
		this.otbType=otbType;
		this.estModuleMaster=estModuleMaster;
		this.complexity=complexity;
		this.customization=customization;
		this.total=total;
	}

	/*public EstBaselineProductModule(String featureId, EstModuleMaster estModuleMaster,
			EstUsecaseMaster estUsecaseMaster, String feature, Set<EstUsecaseMaster> estUsecaseMasters) {
		this.featureId = featureId;
		this.estModuleMaster = estModuleMaster;
		this.estUsecaseMaster = estUsecaseMaster;
		this.feature = feature;
		this.estUsecaseMasters = estUsecaseMasters;
	}*/

	@Id
	@Column(name = "BaselineID", unique = true, nullable = false, length = 30)
	public int getBaselineID() {
		return baselineID;
	}

	public void setBaselineID(int baselineID) {
		this.baselineID = baselineID;
	}	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProductID", nullable = false)
	public EstProductMaster getProductID() {
		return productID;
	}

	public void setProductID(EstProductMaster productID) {
		this.productID = productID;
	}

	@Column(name = "Version")
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Column(name = "FeatureType")
	public String getFeatureType() {
		return featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	@Column(name = "UseCase")
	public String getUseCase() {
		return useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}

	@Column(name = "Feature")
	public String getFeature() {
		return feature;
	}

	public void setFeature(String feature) {
		this.feature = feature;
	}

	@Column(name = "OTBType")
	public String getOtbType() {
		return otbType;
	}

	public void setOtbType(String otbType) {
		this.otbType = otbType;
	}

	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ModuleID", nullable = false)
	public EstModuleMaster getModuleID() {
		return estModuleMaster;
	}	
	public void setModuleID(EstModuleMaster estModuleMaster) {
		this.estModuleMaster = estModuleMaster;
	}*/
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ModuleID", nullable = false)
	public EstModuleMaster getEstModuleMaster() {
		return this.estModuleMaster;
	}

	public void setEstModuleMaster(EstModuleMaster estModuleMaster) {
		this.estModuleMaster = estModuleMaster;
	}
	
	@Column(name = "Complexity")
	public String getComplexity() {
		return complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	@Column(name = "Customization")
	public String getCustomization() {
		return customization;
	}

	public void setCustomization(String customization) {
		this.customization = customization;
	}

	@Column(name = "Total")
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	/*public HashMap<EstModuleMaster,Object> getBaseLineMap() {
		return baseLineMap;
	}

	public void setBaseLineMap(HashMap<EstModuleMaster,Object> baseLineMap) {
		this.baseLineMap = baseLineMap;
	}*/
}
