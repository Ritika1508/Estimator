package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EstUserTxnId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1681415668621344147L;
	private int userId;
	private String clientId;
	private String projectId;
	private String roleId;
	private String read;
	private String update;
	private String delete;

	public EstUserTxnId() {
	}

	public EstUserTxnId(int userId, String clientId, String projectId, String roleId) {
		this.userId = userId;
		this.clientId = clientId;
		this.projectId = projectId;
		this.roleId = roleId;
	}

	public EstUserTxnId(int userId, String clientId, String projectId, String roleId, String read, String update,
			String delete) {
		this.userId = userId;
		this.clientId = clientId;
		this.projectId = projectId;
		this.roleId = roleId;
		this.read = read;
		this.update = update;
		this.delete = delete;
	}

	@Column(name = "UserId", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "ClientID", nullable = false, length = 30)
	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Column(name = "ProjectID", nullable = false, length = 30)
	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	@Column(name = "RoleID", nullable = false, length = 30)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "Read", length = 30)
	public String getRead() {
		return this.read;
	}

	public void setRead(String read) {
		this.read = read;
	}

	@Column(name = "Update", length = 30)
	public String getUpdate() {
		return this.update;
	}

	public void setUpdate(String update) {
		this.update = update;
	}

	@Column(name = "Delete", length = 30)
	public String getDelete() {
		return this.delete;
	}

	public void setDelete(String delete) {
		this.delete = delete;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstUserTxnId))
			return false;
		EstUserTxnId castOther = (EstUserTxnId) other;

		return (this.getUserId() == castOther.getUserId())
				&& ((this.getClientId() == castOther.getClientId()) || (this.getClientId() != null
						&& castOther.getClientId() != null && this.getClientId().equals(castOther.getClientId())))
				&& ((this.getProjectId() == castOther.getProjectId()) || (this.getProjectId() != null
						&& castOther.getProjectId() != null && this.getProjectId().equals(castOther.getProjectId())))
				&& ((this.getRoleId() == castOther.getRoleId()) || (this.getRoleId() != null
						&& castOther.getRoleId() != null && this.getRoleId().equals(castOther.getRoleId())))
				&& ((this.getRead() == castOther.getRead()) || (this.getRead() != null && castOther.getRead() != null
						&& this.getRead().equals(castOther.getRead())))
				&& ((this.getUpdate() == castOther.getUpdate()) || (this.getUpdate() != null
						&& castOther.getUpdate() != null && this.getUpdate().equals(castOther.getUpdate())))
				&& ((this.getDelete() == castOther.getDelete()) || (this.getDelete() != null
						&& castOther.getDelete() != null && this.getDelete().equals(castOther.getDelete())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + (getClientId() == null ? 0 : this.getClientId().hashCode());
		result = 37 * result + (getProjectId() == null ? 0 : this.getProjectId().hashCode());
		result = 37 * result + (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result + (getRead() == null ? 0 : this.getRead().hashCode());
		result = 37 * result + (getUpdate() == null ? 0 : this.getUpdate().hashCode());
		result = 37 * result + (getDelete() == null ? 0 : this.getDelete().hashCode());
		return result;
	}

}
