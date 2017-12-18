package com.ey.estimator.rest.entity;// default package
// Generated 4 Aug, 2017 11:28:41 AM by Hibernate Tools 5.2.3.Final

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "EST_PRACTICE_MASTER")
public class EstPracticeMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1274096407802062254L;
	@Id
	@Column(name = "PracticeID", unique = true, nullable = false, length = 30)
	private String practiceId;
	
	@Column(name = "PracticeName", nullable = false, length = 30)
	private String practiceName;
	
	@Column(name = "PracticeHead", nullable = false, length = 30)
	private String practiceHead;
	
/*	@OneToMany(fetch = FetchType.EAGER, mappedBy = "estPracticeMaster",cascade = CascadeType.ALL)
	private Set<EstProjectMaster> estProjectMasters = new HashSet<EstProjectMaster>(0);

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estPracticeMaster",cascade = CascadeType.ALL)
	private Set<EstProductMaster> estProductMasters = new HashSet<EstProductMaster>(0);*/

	public EstPracticeMaster() {
	}

	public EstPracticeMaster(String practiceId, String practiceName) {
		this.practiceId = practiceId;
		this.practiceName = practiceName;
	}

	public EstPracticeMaster(String practiceId, String practiceName, String practiceHead,
			Set<EstProjectMaster> estProjectMasters, Set<EstProductMaster> estProductMasters) {
		this.practiceId = practiceId;
		this.practiceName = practiceName;
		this.practiceHead = practiceHead;
/*		this.estProjectMasters = estProjectMasters;
		this.estProductMasters = estProductMasters;*/
	}


	public String getPracticeId() {
		return this.practiceId;
	}

	public void setPracticeId(String practiceId) {
		this.practiceId = practiceId;
	}

	public String getPracticeName() {
		return this.practiceName;
	}

	public void setPracticeName(String practiceName) {
		this.practiceName = practiceName;
	}

	@Column(name = "PracticeHead", length = 30)
	public String getPracticeHead() {
		return this.practiceHead;
	}

	public void setPracticeHead(String practiceHead) {
		this.practiceHead = practiceHead;
	}

/*	public Set<EstProjectMaster> getEstProjectMasters() {
		return this.estProjectMasters;
	}

	public void setEstProjectMasters(Set<EstProjectMaster> estProjectMasters) {
		this.estProjectMasters = estProjectMasters;
	}

	public Set<EstProductMaster> getEstProductMasters() {
		return this.estProductMasters;
	}

	public void setEstProductMasters(Set<EstProductMaster> estProductMasters) {
		this.estProductMasters = estProductMasters;
	}*/

}
