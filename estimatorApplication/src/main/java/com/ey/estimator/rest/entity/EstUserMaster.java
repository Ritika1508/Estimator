package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "EST_USER_MASTER")
public class EstUserMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6721272067612924826L;
	private int userId;
	private EstRoleMaster estRoleMaster;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private String oldPassword;
	private String newPassword;
	private String emailAddress;
	private Date updateDate;
	private Date createDate;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String option5;

	public EstUserMaster() {
	}

	public EstUserMaster(int userId, EstRoleMaster estRoleMaster, String firstName, String userName, String password,
			String oldPassword) {
		this.userId = userId;
		this.estRoleMaster = estRoleMaster;
		this.firstName = firstName;
		this.userName = userName;
		this.password = password;
		this.oldPassword = oldPassword;
	}

	public EstUserMaster(int userId, EstRoleMaster estRoleMaster, String firstName, String lastName, String userName,
			String password, String oldPassword, String newPassword, String emailAddress, Date updateDate,
			Date createDate, String option1, String option2, String option3, String option4, String option5) {
		this.userId = userId;
		this.estRoleMaster = estRoleMaster;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.oldPassword = oldPassword;
		this.newPassword = newPassword;
		this.emailAddress = emailAddress;
		this.updateDate = updateDate;
		this.createDate = createDate;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.option5 = option5;
	}

	@Id

	@Column(name = "UserID", unique = true, nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RoleId", nullable = false)
	public EstRoleMaster getEstRoleMaster() {
		return this.estRoleMaster;
	}

	public void setEstRoleMaster(EstRoleMaster estRoleMaster) {
		this.estRoleMaster = estRoleMaster;
	}

	@Column(name = "FirstName", nullable = false, length = 30)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", length = 30)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "UserName", nullable = false, length = 80)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "Password", nullable = false, length = 30)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "OldPassword", nullable = false, length = 30)
	public String getOldPassword() {
		return this.oldPassword;
	}

	public void setOldPassword(String oldPassword) {
		this.oldPassword = oldPassword;
	}

	@Column(name = "NewPassword", length = 30)
	public String getNewPassword() {
		return this.newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Column(name = "EmailAddress", length = 60)
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UpdateDate", length = 27)
	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CreateDate", length = 27)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Column(name = "Option1", length = 30)
	public String getOption1() {
		return this.option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	@Column(name = "Option2", length = 30)
	public String getOption2() {
		return this.option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	@Column(name = "Option3", length = 30)
	public String getOption3() {
		return this.option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	@Column(name = "Option4", length = 30)
	public String getOption4() {
		return this.option4;
	}

	public void setOption4(String option4) {
		this.option4 = option4;
	}

	@Column(name = "Option5", length = 30)
	public String getOption5() {
		return this.option5;
	}

	public void setOption5(String option5) {
		this.option5 = option5;
	}

}
