package com.ey.estimator.rest.modal;

public class ProductModal {

	private String productName;
	private String productID;
	//Dynamic searchcriteria page - LoadModules
	private String practiceID;
	private String productCode;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	//Dynamic searchcriteria page - LoadModules - Start
	public String getPracticeID() {
		return practiceID;
	}
	public void setPracticeID(String practiceID) {
		this.practiceID = practiceID;
	}
	
	public String getproductCode() {
		return productCode;
	}
	public void setproductCode(String productCode) {
		this.productCode = productCode;
	}
	//Dynamic searchcriteria page - LoadModules - END
}
