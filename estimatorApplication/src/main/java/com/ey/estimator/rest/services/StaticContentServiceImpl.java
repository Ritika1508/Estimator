package com.ey.estimator.rest.services;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ey.estimator.rest.dao.StaticContentDAO;
import com.ey.estimator.rest.entity.EstClientMaster;
import com.ey.estimator.rest.entity.EstCountryMaster;
import com.ey.estimator.rest.entity.EstEstimationTbl;
import com.ey.estimator.rest.entity.EstLobMaster;
import com.ey.estimator.rest.entity.EstModuleMaster;
import com.ey.estimator.rest.entity.EstPracticeMaster;
import com.ey.estimator.rest.entity.EstProductMaster;
import com.ey.estimator.rest.entity.EstProjectMaster;
import com.ey.estimator.rest.entity.EstRegionMaster;
import com.ey.estimator.rest.modal.EstimationModal;
import com.ey.estimator.rest.modal.ModuleModal;
import com.ey.estimator.rest.modal.PraticeModal;
import com.ey.estimator.rest.modal.ProductModal;


@Service("staticService")
@Transactional(propagation=Propagation.REQUIRED)
public class StaticContentServiceImpl implements StaticContentService{

	@Autowired(required=true)
	private StaticContentDAO staticContentDao;

	public List<EstRegionMaster> loadRegions() {
		return staticContentDao.loadRegions();
	}

	public List<EstPracticeMaster> loadPratices() {
		return staticContentDao.loadPratices();
	}
	
	public List<EstClientMaster> loadClients() {
		return staticContentDao.loadClients();
	}	 
	
	public List<EstCountryMaster> loadCountries() {
		return staticContentDao.loadCountries();
	}

	public List<EstEstimationTbl> searchEstimate(EstimationModal estimate) {
		
		return staticContentDao.searchEstimate(estimate);
	}

	public List<EstProjectMaster> loadProjects() {
		
		return staticContentDao.loadProjects();
	}

	public boolean insertEstimate(EstimationModal estimationModal) {
		
		return staticContentDao.insertEstimate(estimationModal);
	}

	public HashMap<String,Object> getBaseline(List<ModuleModal> moduleList) 
	{		
		return staticContentDao.getBaseline(moduleList);
	}	

	//Dynamic searchcriteria page - LoadModules
	public List<EstModuleMaster> loadModules(ProductModal productData) {
		 
		return staticContentDao.loadModules(productData);
	}

	public List<EstProductMaster> loadProducts(PraticeModal practiceData) {

		return staticContentDao.loadProducts(practiceData);
	}	
	
	public List<EstLobMaster> loadLOB() {

		return staticContentDao.loadLOB();
	}

	public void addClients(EstimationModal estimate){
		staticContentDao.addClients(estimate);
	}
}
