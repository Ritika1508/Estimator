package com.ey.estimator.rest.modal;

import java.util.List;

public class ProductStatusModal {

	private int status;
	private String message;
	private List<ProductModal> Product;
	
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<ProductModal> getProduct() {
		return Product;
	}
	public void setProduct(List<ProductModal> Product) {
		this.Product = Product;
	}
	
	


}
