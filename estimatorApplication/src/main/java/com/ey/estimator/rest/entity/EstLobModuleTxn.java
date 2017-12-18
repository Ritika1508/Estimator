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
@Table(name = "EST_LOB_MODULE_TXN")
public class EstLobModuleTxn implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 816767894238260306L;
	private EstLobModuleTxnId id;
	private EstModuleMaster estModuleMaster;

	public EstLobModuleTxn() {
	}

	public EstLobModuleTxn(EstLobModuleTxnId id, EstModuleMaster estModuleMaster) {
		this.id = id;
		this.estModuleMaster = estModuleMaster;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "moduleId", column = @Column(name = "ModuleID", nullable = false, length = 30)),
			@AttributeOverride(name = "moduleName", column = @Column(name = "ModuleName", length = 60)),
			@AttributeOverride(name = "lobId", column = @Column(name = "LobID", nullable = false, length = 30)),
			@AttributeOverride(name = "lobname", column = @Column(name = "LOBName", length = 60)) })
	public EstLobModuleTxnId getId() {
		return this.id;
	}

	public void setId(EstLobModuleTxnId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ModuleID", nullable = false, insertable = false, updatable = false)
	public EstModuleMaster getEstModuleMaster() {
		return this.estModuleMaster;
	}

	public void setEstModuleMaster(EstModuleMaster estModuleMaster) {
		this.estModuleMaster = estModuleMaster;
	}

}
