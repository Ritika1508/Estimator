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
@Table(name = "EST_USECASE_MASTER")
public class EstUsecaseMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6506229656476370286L;
	private int useCaseId;
	private EstBaselineProductModule estBaselineProductModule;
	private EstModuleMaster estModuleMaster;
	private String useCase;
	private Set<EstEstimationTxn> estEstimationTxns = new HashSet<EstEstimationTxn>(0);
	private Set<EstBaselineMaster> estBaselineMasters = new HashSet<EstBaselineMaster>(0);
	private Set<EstBaselineProductModule> estBaselineProductModules = new HashSet<EstBaselineProductModule>(0);

	public EstUsecaseMaster() {
	}

	public EstUsecaseMaster(int useCaseId, EstBaselineProductModule estBaselineProductModule,
			EstModuleMaster estModuleMaster) {
		this.useCaseId = useCaseId;
		this.estBaselineProductModule = estBaselineProductModule;
		this.estModuleMaster = estModuleMaster;
	}

	public EstUsecaseMaster(int useCaseId, EstBaselineProductModule estBaselineProductModule,
			EstModuleMaster estModuleMaster, String useCase, Set<EstEstimationTxn> estEstimationTxns,
			Set<EstBaselineMaster> estBaselineMasters, Set<EstBaselineProductModule> estBaselineProductModules) {
		this.useCaseId = useCaseId;
		this.estBaselineProductModule = estBaselineProductModule;
		this.estModuleMaster = estModuleMaster;
		this.useCase = useCase;
		this.estEstimationTxns = estEstimationTxns;
		this.estBaselineMasters = estBaselineMasters;
		this.estBaselineProductModules = estBaselineProductModules;
	}

	@Id

	@Column(name = "UseCaseID", unique = true, nullable = false)
	public int getUseCaseId() {
		return this.useCaseId;
	}

	public void setUseCaseId(int useCaseId) {
		this.useCaseId = useCaseId;
	}

	/*@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FeatureID", nullable = false)
	public EstBaselineProductModule getEstBaselineProductModule() {
		return this.estBaselineProductModule;
	}

	public void setEstBaselineProductModule(EstBaselineProductModule estBaselineProductModule) {
		this.estBaselineProductModule = estBaselineProductModule;
	}*/

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ModuleID", nullable = false)
	public EstModuleMaster getEstModuleMaster() {
		return this.estModuleMaster;
	}

	public void setEstModuleMaster(EstModuleMaster estModuleMaster) {
		this.estModuleMaster = estModuleMaster;
	}

	@Column(name = "UseCase", length = 60)
	public String getUseCase() {
		return this.useCase;
	}

	public void setUseCase(String useCase) {
		this.useCase = useCase;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estUsecaseMaster")
	public Set<EstEstimationTxn> getEstEstimationTxns() {
		return this.estEstimationTxns;
	}

	public void setEstEstimationTxns(Set<EstEstimationTxn> estEstimationTxns) {
		this.estEstimationTxns = estEstimationTxns;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estUsecaseMaster")
	public Set<EstBaselineMaster> getEstBaselineMasters() {
		return this.estBaselineMasters;
	}

	public void setEstBaselineMasters(Set<EstBaselineMaster> estBaselineMasters) {
		this.estBaselineMasters = estBaselineMasters;
	}

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "estUsecaseMaster")
	public Set<EstBaselineProductModule> getEstBaselineProductModules() {
		return this.estBaselineProductModules;
	}

	public void setEstBaselineProductModules(Set<EstBaselineProductModule> estBaselineProductModules) {
		this.estBaselineProductModules = estBaselineProductModules;
	}*/

}
