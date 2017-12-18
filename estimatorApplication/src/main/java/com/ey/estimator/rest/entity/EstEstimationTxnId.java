package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EstEstimationTxnId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1966702889276149584L;
	private String lobId;
	private int useCaseId;
	private String createdBy;
	private String updatedBy;
	private String inScope;
	private String complexity;
	private String customization;
	private String acceleratorAvailable;
	private String confidenceLevel;
	private String status;
	private Integer total;

	public EstEstimationTxnId() {
	}

	public EstEstimationTxnId(String lobId, int useCaseId, String acceleratorAvailable) {
		this.lobId = lobId;
		this.useCaseId = useCaseId;
		this.acceleratorAvailable = acceleratorAvailable;
	}

	public EstEstimationTxnId(String lobId, int useCaseId, String createdBy, String updatedBy, String inScope,
			String complexity, String customization, String acceleratorAvailable, String confidenceLevel, String status,
			Integer total) {
		this.lobId = lobId;
		this.useCaseId = useCaseId;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.inScope = inScope;
		this.complexity = complexity;
		this.customization = customization;
		this.acceleratorAvailable = acceleratorAvailable;
		this.confidenceLevel = confidenceLevel;
		this.status = status;
		this.total = total;
	}

	@Column(name = "LobID", nullable = false, length = 30)
	public String getLobId() {
		return this.lobId;
	}

	public void setLobId(String lobId) {
		this.lobId = lobId;
	}

	@Column(name = "UseCaseID", nullable = false)
	public int getUseCaseId() {
		return this.useCaseId;
	}

	public void setUseCaseId(int useCaseId) {
		this.useCaseId = useCaseId;
	}

	@Column(name = "CreatedBy", length = 30)
	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Column(name = "UpdatedBy", length = 30)
	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	@Column(name = "InScope", length = 30)
	public String getInScope() {
		return this.inScope;
	}

	public void setInScope(String inScope) {
		this.inScope = inScope;
	}

	@Column(name = "Complexity", length = 30)
	public String getComplexity() {
		return this.complexity;
	}

	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}

	@Column(name = "Customization", length = 30)
	public String getCustomization() {
		return this.customization;
	}

	public void setCustomization(String customization) {
		this.customization = customization;
	}

	@Column(name = "AcceleratorAvailable", nullable = false, length = 1)
	public String getAcceleratorAvailable() {
		return this.acceleratorAvailable;
	}

	public void setAcceleratorAvailable(String acceleratorAvailable) {
		this.acceleratorAvailable = acceleratorAvailable;
	}

	@Column(name = "ConfidenceLevel", length = 30)
	public String getConfidenceLevel() {
		return this.confidenceLevel;
	}

	public void setConfidenceLevel(String confidenceLevel) {
		this.confidenceLevel = confidenceLevel;
	}

	@Column(name = "Status", length = 30)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "Total")
	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstEstimationTxnId))
			return false;
		EstEstimationTxnId castOther = (EstEstimationTxnId) other;

		return ((this.getLobId() == castOther.getLobId()) || (this.getLobId() != null && castOther.getLobId() != null
				&& this.getLobId().equals(castOther.getLobId())))
				&& (this.getUseCaseId() == castOther.getUseCaseId())
				&& ((this.getCreatedBy() == castOther.getCreatedBy()) || (this.getCreatedBy() != null
						&& castOther.getCreatedBy() != null && this.getCreatedBy().equals(castOther.getCreatedBy())))
				&& ((this.getUpdatedBy() == castOther.getUpdatedBy()) || (this.getUpdatedBy() != null
						&& castOther.getUpdatedBy() != null && this.getUpdatedBy().equals(castOther.getUpdatedBy())))
				&& ((this.getInScope() == castOther.getInScope()) || (this.getInScope() != null
						&& castOther.getInScope() != null && this.getInScope().equals(castOther.getInScope())))
				&& ((this.getComplexity() == castOther.getComplexity()) || (this.getComplexity() != null
						&& castOther.getComplexity() != null && this.getComplexity().equals(castOther.getComplexity())))
				&& ((this.getCustomization() == castOther.getCustomization())
						|| (this.getCustomization() != null && castOther.getCustomization() != null
								&& this.getCustomization().equals(castOther.getCustomization())))
				&& ((this.getAcceleratorAvailable() == castOther.getAcceleratorAvailable())
						|| (this.getAcceleratorAvailable() != null && castOther.getAcceleratorAvailable() != null
								&& this.getAcceleratorAvailable().equals(castOther.getAcceleratorAvailable())))
				&& ((this.getConfidenceLevel() == castOther.getConfidenceLevel())
						|| (this.getConfidenceLevel() != null && castOther.getConfidenceLevel() != null
								&& this.getConfidenceLevel().equals(castOther.getConfidenceLevel())))
				&& ((this.getStatus() == castOther.getStatus()) || (this.getStatus() != null
						&& castOther.getStatus() != null && this.getStatus().equals(castOther.getStatus())))
				&& ((this.getTotal() == castOther.getTotal()) || (this.getTotal() != null
						&& castOther.getTotal() != null && this.getTotal().equals(castOther.getTotal())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getLobId() == null ? 0 : this.getLobId().hashCode());
		result = 37 * result + this.getUseCaseId();
		result = 37 * result + (getCreatedBy() == null ? 0 : this.getCreatedBy().hashCode());
		result = 37 * result + (getUpdatedBy() == null ? 0 : this.getUpdatedBy().hashCode());
		result = 37 * result + (getInScope() == null ? 0 : this.getInScope().hashCode());
		result = 37 * result + (getComplexity() == null ? 0 : this.getComplexity().hashCode());
		result = 37 * result + (getCustomization() == null ? 0 : this.getCustomization().hashCode());
		result = 37 * result + (getAcceleratorAvailable() == null ? 0 : this.getAcceleratorAvailable().hashCode());
		result = 37 * result + (getConfidenceLevel() == null ? 0 : this.getConfidenceLevel().hashCode());
		result = 37 * result + (getStatus() == null ? 0 : this.getStatus().hashCode());
		result = 37 * result + (getTotal() == null ? 0 : this.getTotal().hashCode());
		return result;
	}

}
