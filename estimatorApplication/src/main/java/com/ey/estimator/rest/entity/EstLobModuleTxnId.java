package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class EstLobModuleTxnId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6102267787464198643L;
	private String moduleId;
	private String moduleName;
	private String lobId;
	private String lobname;

	public EstLobModuleTxnId() {
	}

	public EstLobModuleTxnId(String moduleId, String lobId) {
		this.moduleId = moduleId;
		this.lobId = lobId;
	}

	public EstLobModuleTxnId(String moduleId, String moduleName, String lobId, String lobname) {
		this.moduleId = moduleId;
		this.moduleName = moduleName;
		this.lobId = lobId;
		this.lobname = lobname;
	}

	@Column(name = "ModuleID", nullable = false, length = 30)
	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	@Column(name = "ModuleName", length = 60)
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	@Column(name = "LobID", nullable = false, length = 30)
	public String getLobId() {
		return this.lobId;
	}

	public void setLobId(String lobId) {
		this.lobId = lobId;
	}

	@Column(name = "LOBName", length = 60)
	public String getLobname() {
		return this.lobname;
	}

	public void setLobname(String lobname) {
		this.lobname = lobname;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EstLobModuleTxnId))
			return false;
		EstLobModuleTxnId castOther = (EstLobModuleTxnId) other;

		return ((this.getModuleId() == castOther.getModuleId()) || (this.getModuleId() != null
				&& castOther.getModuleId() != null && this.getModuleId().equals(castOther.getModuleId())))
				&& ((this.getModuleName() == castOther.getModuleName()) || (this.getModuleName() != null
						&& castOther.getModuleName() != null && this.getModuleName().equals(castOther.getModuleName())))
				&& ((this.getLobId() == castOther.getLobId()) || (this.getLobId() != null
						&& castOther.getLobId() != null && this.getLobId().equals(castOther.getLobId())))
				&& ((this.getLobname() == castOther.getLobname()) || (this.getLobname() != null
						&& castOther.getLobname() != null && this.getLobname().equals(castOther.getLobname())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getModuleId() == null ? 0 : this.getModuleId().hashCode());
		result = 37 * result + (getModuleName() == null ? 0 : this.getModuleName().hashCode());
		result = 37 * result + (getLobId() == null ? 0 : this.getLobId().hashCode());
		result = 37 * result + (getLobname() == null ? 0 : this.getLobname().hashCode());
		return result;
	}

}
