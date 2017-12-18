package com.ey.estimator.rest.controller;

import javax.persistence.NoResultException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.ey.estimator.rest.entity.EstUserMaster;
import com.ey.estimator.rest.modal.UserModal;
import com.ey.estimator.rest.modal.UserStatusModal;
import com.ey.estimator.rest.services.LoginService;


@Component
@Path("/login")
public class LoginRestResource {

	@Autowired(required = true)
	@Qualifier("loginService")
	private LoginService loginService;

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/authenticateUser")
	public UserStatusModal createUser(UserModal userModal) {
		EstUserMaster user = null;
		UserStatusModal status = new UserStatusModal();
		try {
			user = loginService.authenticateUser(userModal);
			status.setStatus(HttpStatus.SC_OK);
			status.setUser(userModal);
			status.setMessage("Successful Authentication");

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("No Record Found :: " +e.getMessage());
		}

		return status;

	}

}
