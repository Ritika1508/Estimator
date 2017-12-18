package com.ey.estimator.rest.entity;

// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "EST_BASELINE_MASTER")
public class EstBaselineMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3347772539073460866L;
	private EstBaselineMasterId id;
	private EstUsecaseMaster estUsecaseMaster;

	public EstBaselineMaster() {
	}

	public EstBaselineMaster(EstBaselineMasterId id, EstUsecaseMaster estUsecaseMaster) {
		this.id = id;
		this.estUsecaseMaster = estUsecaseMaster;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "useCaseId", column = @Column(name = "UseCaseID", nullable = false)),
			@AttributeOverride(name = "featureType", column = @Column(name = "FeatureType", nullable = false, length = 30)),
			@AttributeOverride(name = "complexity", column = @Column(name = "Complexity", nullable = false, length = 30)),
			@AttributeOverride(name = "customization", column = @Column(name = "Customization", nullable = false, length = 30)),
			@AttributeOverride(name = "total", column = @Column(name = "Total", nullable = false)) })
	public EstBaselineMasterId getId() {
		return this.id;
	}

	public void setId(EstBaselineMasterId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UseCaseID", nullable = false, insertable = false, updatable = false)
	public EstUsecaseMaster getEstUsecaseMaster() {
		return this.estUsecaseMaster;
	}

	public void setEstUsecaseMaster(EstUsecaseMaster estUsecaseMaster) {
		this.estUsecaseMaster = estUsecaseMaster;
	}

}
