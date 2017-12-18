package com.ey.estimator.rest.dao;

import org.springframework.stereotype.Repository;

import com.ey.estimator.rest.entity.EstUserMaster;
import com.ey.estimator.rest.modal.UserModal;

@Repository("loginDao")
public interface LoginDAO {

	public EstUserMaster authenticateUser(UserModal user);
}
