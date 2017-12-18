package com.ey.estimator.rest.entity;// default package
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
@Table(name = "EST_ESTIMATION_TXN")
public class EstEstimationTxn implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7071723145882374664L;
	private EstEstimationTxnId id;
	private EstLobMaster estLobMaster;
	private EstUsecaseMaster estUsecaseMaster;

	public EstEstimationTxn() {
	}

	public EstEstimationTxn(EstEstimationTxnId id, EstLobMaster estLobMaster, EstUsecaseMaster estUsecaseMaster) {
		this.id = id;
		this.estLobMaster = estLobMaster;
		this.estUsecaseMaster = estUsecaseMaster;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "lobId", column = @Column(name = "LobID", nullable = false, length = 30)),
			@AttributeOverride(name = "useCaseId", column = @Column(name = "UseCaseID", nullable = false)),
			@AttributeOverride(name = "createdBy", column = @Column(name = "CreatedBy", length = 30)),
			@AttributeOverride(name = "updatedBy", column = @Column(name = "UpdatedBy", length = 30)),
			@AttributeOverride(name = "inScope", column = @Column(name = "InScope", length = 30)),
			@AttributeOverride(name = "complexity", column = @Column(name = "Complexity", length = 30)),
			@AttributeOverride(name = "customization", column = @Column(name = "Customization", length = 30)),
			@AttributeOverride(name = "acceleratorAvailable", column = @Column(name = "AcceleratorAvailable", nullable = false, length = 1)),
			@AttributeOverride(name = "confidenceLevel", column = @Column(name = "ConfidenceLevel", length = 30)),
			@AttributeOverride(name = "status", column = @Column(name = "Status", length = 30)),
			@AttributeOverride(name = "total", column = @Column(name = "Total")) })
	public EstEstimationTxnId getId() {
		return this.id;
	}

	public void setId(EstEstimationTxnId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LobID", nullable = false, insertable = false, updatable = false)
	public EstLobMaster getEstLobMaster() {
		return this.estLobMaster;
	}

	public void setEstLobMaster(EstLobMaster estLobMaster) {
		this.estLobMaster = estLobMaster;
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
