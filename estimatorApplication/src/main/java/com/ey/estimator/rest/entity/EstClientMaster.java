package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EST_CLIENT_MASTER")
public class EstClientMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 653098098092762312L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "ClientID", unique = true)
	private String clientId;
	
	@Column(name = "ClientName", nullable = false, length = 60)
	private String clientName;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estClientMaster")
	private Set<EstUserTxn> estUserTxns = new HashSet<EstUserTxn>(0);
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estClientMaster")
	private Set<EstProjectMaster> estProjectMasters = new HashSet<EstProjectMaster>(0);

	public EstClientMaster() {
	}

	public EstClientMaster(String clientId, String clientName) {
		this.clientId = clientId;
		this.clientName = clientName;
	}

	public EstClientMaster(String clientId, String clientName, Set<EstUserTxn> estUserTxns,
			Set<EstProjectMaster> estProjectMasters) {
		this.clientId = clientId;
		this.clientName = clientName;
		this.estUserTxns = estUserTxns;
		this.estProjectMasters = estProjectMasters;
	}

	
	public String getClientId() {
		return this.clientId;
	}

	
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	
	public String getClientName() {
		return this.clientName;
	}

	
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	
	public Set<EstUserTxn> getEstUserTxns() {
		return this.estUserTxns;
	}

	public void setEstUserTxns(Set<EstUserTxn> estUserTxns) {
		this.estUserTxns = estUserTxns;
	}

	public Set<EstProjectMaster> getEstProjectMasters() {
		return this.estProjectMasters;
	}

	public void setEstProjectMasters(Set<EstProjectMaster> estProjectMasters) {
		this.estProjectMasters = estProjectMasters;
	}

}
