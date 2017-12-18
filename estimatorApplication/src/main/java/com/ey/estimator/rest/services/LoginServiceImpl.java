package com.ey.estimator.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ey.estimator.rest.dao.LoginDAO;
import com.ey.estimator.rest.entity.EstUserMaster;
import com.ey.estimator.rest.modal.UserModal;

@Service("loginService")
@Transactional(propagation=Propagation.REQUIRED)
public class LoginServiceImpl implements LoginService {
	
	@Autowired(required=true)
	private LoginDAO loginDAO;

	public EstUserMaster authenticateUser(UserModal user) {
		return loginDAO.authenticateUser(user);
	}

}
