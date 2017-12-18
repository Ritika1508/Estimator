package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

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
@Table(name = "EST_MODULE_MASTER")
public class EstModuleMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2152784833030791357L;
	private String moduleID;
	private EstProductMaster estProductMaster;
	private String moduleName;
	private Set<EstUsecaseMaster> estUsecaseMasters = new HashSet<EstUsecaseMaster>(0);
	private Set<EstLobModuleTxn> estLobModuleTxns = new HashSet<EstLobModuleTxn>(0);
	private Set<EstBaselineProductModule> estBaselineProductModules = new HashSet<EstBaselineProductModule>(0);

	public EstModuleMaster() {
	}

	public EstModuleMaster(String moduleID) {
		this.moduleID = moduleID;
	}

	public EstModuleMaster(String moduleID, EstProductMaster estProductMaster, String moduleName,
			Set<EstUsecaseMaster> estUsecaseMasters, Set<EstLobModuleTxn> estLobModuleTxns,
			Set<EstBaselineProductModule> estBaselineProductModules) {
		this.moduleID = moduleID;
		this.estProductMaster = estProductMaster;
		this.moduleName = moduleName;
		this.estUsecaseMasters = estUsecaseMasters;
		this.estLobModuleTxns = estLobModuleTxns;
		this.estBaselineProductModules = estBaselineProductModules;
	}

	@Id

	@Column(name = "ModuleID", unique = true, nullable = false, length = 30)
	public String getModuleID() {
		return this.moduleID;
	}

	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ProductID")
	public EstProductMaster getEstProductMaster() {
		return this.estProductMaster;
	}

	public void setEstProductMaster(EstProductMaster estProductMaster) {
		this.estProductMaster = estProductMaster;
	}

	@Column(name = "ModuleName", length = 60)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estModuleMaster")
	public Set<EstUsecaseMaster> getEstUsecaseMasters() {
		return this.estUsecaseMasters;
	}

	public void setEstUsecaseMasters(Set<EstUsecaseMaster> estUsecaseMasters) {
		this.estUsecaseMasters = estUsecaseMasters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estModuleMaster")
	public Set<EstLobModuleTxn> getEstLobModuleTxns() {
		return this.estLobModuleTxns;
	}

	public void setEstLobModuleTxns(Set<EstLobModuleTxn> estLobModuleTxns) {
		this.estLobModuleTxns = estLobModuleTxns;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estModuleMaster")
	public Set<EstBaselineProductModule> getEstBaselineProductModules() {
		return this.estBaselineProductModules;
	}

	public void setEstBaselineProductModules(Set<EstBaselineProductModule> estBaselineProductModules) {
		this.estBaselineProductModules = estBaselineProductModules;
	}

}
