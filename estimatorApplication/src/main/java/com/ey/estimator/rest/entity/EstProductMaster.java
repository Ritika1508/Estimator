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
@Table(name = "EST_PRODUCT_MASTER")
public class EstProductMaster implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4387167279369268008L;
	private String productId;
	private EstPracticeMaster estPracticeMaster;
	private String productCode;
	private String productName;
	private Set<EstModuleMaster> estModuleMasters = new HashSet<EstModuleMaster>(0);

	public EstProductMaster() {
	}

	public EstProductMaster(String productId, EstPracticeMaster estPracticeMaster) {
		this.productId = productId;
		this.estPracticeMaster = estPracticeMaster;
	}

	public EstProductMaster(String productId, EstPracticeMaster estPracticeMaster, String productCode, String productName,
			Set<EstModuleMaster> estModuleMasters) {
		this.productId = productId;
		this.estPracticeMaster = estPracticeMaster;
		this.productCode = productCode;
		this.productName = productName;
		this.estModuleMasters = estModuleMasters;
	}

	@Id

	@Column(name = "ProductID", unique = true, nullable = false, length = 30)
	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PracticeID", nullable = false)
	public EstPracticeMaster getEstPracticeMaster() {
		return this.estPracticeMaster;
	}

	public void setEstPracticeMaster(EstPracticeMaster estPracticeMaster) {
		this.estPracticeMaster = estPracticeMaster;
	}

	@Column(name = "ProductCode", length = 30)
	public String getProductType() {
		return this.productCode;
	}

	public void setProductType(String productCode) {
		this.productCode = productCode;
	}
	
	@Column(name = "ProductName", length = 30)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estProductMaster")
	public Set<EstModuleMaster> getEstModuleMasters() {
		return this.estModuleMasters;
	}

	public void setEstModuleMasters(Set<EstModuleMaster> estModuleMasters) {
		this.estModuleMasters = estModuleMasters;
	}

}
