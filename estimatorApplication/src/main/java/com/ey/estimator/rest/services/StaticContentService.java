package com.ey.estimator.rest.services;

import java.util.HashMap;
import java.util.List;

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

public interface StaticContentService {

	public List<EstRegionMaster> loadRegions();

	public List<EstPracticeMaster> loadPratices();

	public List<EstClientMaster> loadClients();

	public List<EstCountryMaster> loadCountries();

	public List<EstEstimationTbl> searchEstimate(EstimationModal estimationModal);

	public List<EstProjectMaster> loadProjects();

	public boolean insertEstimate(EstimationModal estimationModal);

	public HashMap<String,Object> getBaseline(List<ModuleModal> moduleList);
	
	//Dynamic searchcriteria page - LoadModules
	public List<EstModuleMaster> loadModules(ProductModal productData);
	
	public List<EstProductMaster> loadProducts(PraticeModal practiceData);
	
	public List<EstLobMaster> loadLOB();

	public void addClients(EstimationModal estimationModal);
}
