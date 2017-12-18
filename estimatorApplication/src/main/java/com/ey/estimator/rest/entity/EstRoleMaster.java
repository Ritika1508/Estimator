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
@Table(name = "EST_ROLE_MASTER")
public class EstRoleMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6394898530184547820L;
	private String roleId;
	private String roleName;
	private Set<EstUserMaster> estUserMasters = new HashSet<EstUserMaster>(0);
	private Set<EstUserTxn> estUserTxns = new HashSet<EstUserTxn>(0);

	public EstRoleMaster() {
	}

	public EstRoleMaster(String roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

	public EstRoleMaster(String roleId, String roleName, Set<EstUserMaster> estUserMasters,
			Set<EstUserTxn> estUserTxns) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.estUserMasters = estUserMasters;
		this.estUserTxns = estUserTxns;
	}

	@Id

	@Column(name = "RoleId", unique = true, nullable = false, length = 30)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "RoleName", nullable = false, length = 30)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estRoleMaster")
	public Set<EstUserMaster> getEstUserMasters() {
		return this.estUserMasters;
	}

	public void setEstUserMasters(Set<EstUserMaster> estUserMasters) {
		this.estUserMasters = estUserMasters;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estRoleMaster")
	public Set<EstUserTxn> getEstUserTxns() {
		return this.estUserTxns;
	}

	public void setEstUserTxns(Set<EstUserTxn> estUserTxns) {
		this.estUserTxns = estUserTxns;
	}

}
