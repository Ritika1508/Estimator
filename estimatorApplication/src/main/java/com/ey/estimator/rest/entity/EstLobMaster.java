package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EST_LOB_MASTER")
public class EstLobMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2165257583955542766L;
	private String lobId;
	private String lobName;
	private Set<EstEstimationTxn> estEstimationTxns = new HashSet<EstEstimationTxn>(0);

	public EstLobMaster() {
	}

	public EstLobMaster(String lobId, String lobName) {
		this.lobId = lobId;
		this.lobName = lobName;
	}

	public EstLobMaster(String lobId, String lobName, Set<EstEstimationTxn> estEstimationTxns) {
		this.lobId = lobId;
		this.lobName = lobName;
		this.estEstimationTxns = estEstimationTxns;
	}

	@Id

	@Column(name = "LobID", unique = true, nullable = false, length = 30)
	public String getLobId() {
		return this.lobId;
	}

	public void setLobId(String lobId) {
		this.lobId = lobId;
	}

	@Column(name = "LobName", nullable = false, length = 60)
	public String getLobName() {
		return this.lobName;
	}

	public void setLobName(String lobName) {
		this.lobName = lobName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estLobMaster")
	public Set<EstEstimationTxn> getEstEstimationTxns() {
		return this.estEstimationTxns;
	}

	public void setEstEstimationTxns(Set<EstEstimationTxn> estEstimationTxns) {
		this.estEstimationTxns = estEstimationTxns;
	}

}
