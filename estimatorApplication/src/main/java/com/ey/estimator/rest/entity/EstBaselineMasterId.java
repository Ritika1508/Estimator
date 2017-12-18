package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EstBaselineMasterId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6490922230209733205L;
	private int useCaseId;
	private String featureType;
	private String complexity;
	private String customization;
	private int total;

	public EstBaselineMasterId() {
	}

	public EstBaselineMasterId(int useCaseId, String featureType, String complexity, String customization, int total) {
		this.useCaseId = useCaseId;
		this.featureType = featureType;
		this.complexity = complexity;
		this.customization = customization;
		this.total = total;
	}

	@Column(name = "UseCaseID", nullable = false)
	public int getUseCaseId() {
		return this.useCaseId;
	}

	public void setUseCaseId(int useCaseId) {
		this.useCaseId = useCaseId;
	}

	@Column(name = "FeatureType", nullable = false, length = 30)
	public String getFeatureType() {
		return this.featureType;
	}

	public void setFeatureType(String featureType) {
		this.featureType = featureType;
	}

	@Column(name = "Complexity", nullable = false, length = 30)
	public String getComplexity() {
		return this.complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	@Column(name = "Customization", nullable = false, length = 30)
	public String getCustomization() {
		return this.customization;
	}

	public void setCustomization(String customization) {
		this.customization = customization;
	}

	@Column(name = "Total", nullable = false)
	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstBaselineMasterId))
			return false;
		EstBaselineMasterId castOther = (EstBaselineMasterId) other;

		return (this.getUseCaseId() == castOther.getUseCaseId())
				&& ((this.getFeatureType() == castOther.getFeatureType())
						|| (this.getFeatureType() != null && castOther.getFeatureType() != null
								&& this.getFeatureType().equals(castOther.getFeatureType())))
				&& ((this.getComplexity() == castOther.getComplexity()) || (this.getComplexity() != null
						&& castOther.getComplexity() != null && this.getComplexity().equals(castOther.getComplexity())))
				&& ((this.getCustomization() == castOther.getCustomization())
						|| (this.getCustomization() != null && castOther.getCustomization() != null
								&& this.getCustomization().equals(castOther.getCustomization())))
				&& (this.getTotal() == castOther.getTotal());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUseCaseId();
		result = 37 * result + (getFeatureType() == null ? 0 : this.getFeatureType().hashCode());
		result = 37 * result + (getComplexity() == null ? 0 : this.getComplexity().hashCode());
		result = 37 * result + (getCustomization() == null ? 0 : this.getCustomization().hashCode());
		result = 37 * result + this.getTotal();
		return result;
	}

}
