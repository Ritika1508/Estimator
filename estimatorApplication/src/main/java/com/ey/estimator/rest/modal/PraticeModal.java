package com.ey.estimator.rest.modal;

import java.util.Set;

public class PraticeModal {

	private String praticeID;
	private String praticeName;
	Set<ProductModal> products;
	private String practiceHead;
	
	public String getPraticeID() {
		return praticeID;
	}
	public void setPraticeID(String praticeID) {
		this.praticeID = praticeID;
	}
	public String getPraticeName() {
		return praticeName;
	}
	public void setPraticeName(String praticeName) {
		this.praticeName = praticeName;
	}
	public Set<ProductModal> getProducts() {
		return products;
	}
	public void setProducts(Set<ProductModal> products) {
		this.products = products;
	}
	public String getPracticeHead() {
		return practiceHead;
	}
	public void setPracticeHead(String practiceHead) {
		this.practiceHead = practiceHead;
	}
	
	
}
