package com.ey.estimator.rest.services;

import com.ey.estimator.rest.entity.EstUserMaster;
import com.ey.estimator.rest.modal.UserModal;

public interface LoginService {

	public EstUserMaster authenticateUser(UserModal user);
}
