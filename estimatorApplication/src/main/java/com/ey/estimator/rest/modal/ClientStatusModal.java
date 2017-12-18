package com.ey.estimator.rest.modal;

import java.util.List;

public class ClientStatusModal {

	private int status;
	private String message;
	private List<ClientModal> clients;
	
	
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
	public List<ClientModal> getClients() {
		return clients;
	}
	public void setClients(List<ClientModal> clients) {
		this.clients = clients;
	}
	
	
}
