package com.ey.estimator.rest.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ey.estimator.rest.entity.EstUserMaster;
import com.ey.estimator.rest.modal.UserModal;

@Service("loginDAO")
@Transactional(propagation=Propagation.REQUIRED)
public class LoginDAOImpl implements LoginDAO{

	@PersistenceContext
	public EntityManager entityManager;
	
	@Transactional(readOnly=true)
	public EstUserMaster authenticateUser(UserModal user) {
		Query query  = entityManager.createQuery("select user from EstUserMaster user where user.userName=:userName");
		query.setParameter("userName", user.getUserName());
		return (EstUserMaster)query.getSingleResult();
	}

}
