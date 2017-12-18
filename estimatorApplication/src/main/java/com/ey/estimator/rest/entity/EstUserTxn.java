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
@Table(name = "EST_USER_TXN")
public class EstUserTxn implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6675654530701983464L;
	private EstUserTxnId id;
	private EstClientMaster estClientMaster;
	private EstProjectMaster estProjectMaster;
	private EstRoleMaster estRoleMaster;

	public EstUserTxn() {
	}

	public EstUserTxn(EstUserTxnId id, EstClientMaster estClientMaster, EstProjectMaster estProjectMaster,
			EstRoleMaster estRoleMaster) {
		this.id = id;
		this.estClientMaster = estClientMaster;
		this.estProjectMaster = estProjectMaster;
		this.estRoleMaster = estRoleMaster;
	}

	@EmbeddedId

	@AttributeOverrides({ @AttributeOverride(name = "userId", column = @Column(name = "UserId", nullable = false)),
			@AttributeOverride(name = "clientId", column = @Column(name = "ClientID", nullable = false, length = 30)),
			@AttributeOverride(name = "projectId", column = @Column(name = "ProjectID", nullable = false, length = 30)),
			@AttributeOverride(name = "roleId", column = @Column(name = "RoleID", nullable = false, length = 30)),
			@AttributeOverride(name = "read", column = @Column(name = "Read", length = 30)),
			@AttributeOverride(name = "update", column = @Column(name = "Update", length = 30)),
			@AttributeOverride(name = "delete", column = @Column(name = "Delete", length = 30)) })
	public EstUserTxnId getId() {
		return this.id;
	}

	public void setId(EstUserTxnId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ClientID", nullable = false, insertable = false, updatable = false)
	public EstClientMaster getEstClientMaster() {
		return this.estClientMaster;
	}

	public void setEstClientMaster(EstClientMaster estClientMaster) {
		this.estClientMaster = estClientMaster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProjectID", nullable = false, insertable = false, updatable = false)
	public EstProjectMaster getEstProjectMaster() {
		return this.estProjectMaster;
	}

	public void setEstProjectMaster(EstProjectMaster estProjectMaster) {
		this.estProjectMaster = estProjectMaster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RoleID", nullable = false, insertable = false, updatable = false)
	public EstRoleMaster getEstRoleMaster() {
		return this.estRoleMaster;
	}

	public void setEstRoleMaster(EstRoleMaster estRoleMaster) {
		this.estRoleMaster = estRoleMaster;
	}

}
