package com.ey.estimator.rest.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ey.estimator.rest.entity.EstBaselineProductModule;
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


@Service("staticContentDao")
@Transactional(propagation=Propagation.REQUIRED)
public class StaticContentDAOImpl implements StaticContentDAO{

	@PersistenceContext
	public EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly=true)
	public List<EstRegionMaster> loadRegions() {
		Query query  = entityManager.createQuery("select region from EstRegionMaster region");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<EstPracticeMaster> loadPratices() {
		Query query  = entityManager.createQuery("select pratice from EstPracticeMaster pratice");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<EstClientMaster> loadClients() {
		Query query  = entityManager.createQuery("select client from EstClientMaster client");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<EstCountryMaster> loadCountries() {
		Query query  = entityManager.createQuery("select country from EstCountryMaster country");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<EstEstimationTbl> searchEstimate(EstimationModal estimate) 
	{
		EstEstimationTbl obj=new EstEstimationTbl();

		EstClientMaster clientObj=new EstClientMaster();
		clientObj.setClientId(estimate.getClientID());

		EstProjectMaster projectObj=new EstProjectMaster();
		projectObj.setProjectId(estimate.getProjectID());

		EstRegionMaster regionObj=new EstRegionMaster();
		regionObj.setRegionId(estimate.getRegionID());;

		EstCountryMaster countryObj=new EstCountryMaster();
		countryObj.setCountryId(estimate.getCountryID());

		obj.setClientID(clientObj);		
		obj.setProjectID(projectObj);		
		obj.setRegionID(regionObj);
		obj.setCountryID(countryObj);

		//Query query  = entityManager.createQuery("select e from EstEstimationTbl e where e.clientID=:clientID");


		Query query  = entityManager.createQuery("select e from EstEstimationTbl e where e.clientID=:clientID and e.projectID=:projectID and e.regionID=:regionID and "
				+ "e.countryID=:countryID and e.userID=:userID and e.createdDate BETWEEN :fromDate and :toDate");

		/*Query query  = entityManager.createQuery("select e from EstEstimationTbl e where e.clientID=:"+estimate.getClientID()+" and e.projectID=:"+estimate.getProjectID()+" and "
				+ "e.regionID=:"+estimate.getRegionID()+" and e.countryID=:"+estimate.getCountryID());*/

		query.setParameter("clientID", obj.getClientID());
		query.setParameter("projectID",obj.getProjectID());
		query.setParameter("regionID", obj.getRegionID());
		query.setParameter("countryID",obj.getCountryID());
		query.setParameter("userID",estimate.getUserID());
		query.setParameter("fromDate",estimate.getFromDate());
		query.setParameter("toDate",estimate.getToDate());

		return query.getResultList();

	}
	
	@SuppressWarnings("unchecked")
	public HashMap<String,Object> getBaseline(List<ModuleModal> moduleList) 
	{
		HashMap<String,Object> baseLineMap = new HashMap<String,Object>();
		
		
		for(ModuleModal module:moduleList)
		{
			EstBaselineProductModule obj=new EstBaselineProductModule();
			
			EstModuleMaster moduleObj=new EstModuleMaster();
			moduleObj.setModuleID(module.getModuleID());
			
			obj.setEstModuleMaster(moduleObj);
			
			Query query  = entityManager.createQuery("select baseline from EstBaselineProductModule baseline where baseline.estModuleMaster=:moduleID");

			query.setParameter("moduleID",obj.getEstModuleMaster()); 
			
			baseLineMap.put(obj.getEstModuleMaster().getModuleID(), query.getResultList());
		}
		/*EstModuleMaster moduleObj=new EstModuleMaster();
		moduleObj.setModuleID(module.getModuleID());
		
		obj.setModuleID(moduleObj);
		
		Query query  = entityManager.createQuery("select baseline from EstBaselineProductModule baseline where baseline.moduleID=:moduleID");

		query.setParameter("moduleID",obj.getModuleID()); */
		
		return baseLineMap;
		
	}
	@SuppressWarnings("unchecked")
	public List<EstProjectMaster> loadProjects() {
		Query query  = entityManager.createQuery("select project from EstProjectMaster project");
		return query.getResultList();
	}

	public boolean insertEstimate(EstimationModal estimate) 
	{
		EstEstimationTbl est = new EstEstimationTbl();
		
		EstClientMaster clientObj=new EstClientMaster();
		clientObj.setClientId(estimate.getClientID());		
		est.setClientID(clientObj);
		
		EstProjectMaster projectObj=new EstProjectMaster();
		projectObj.setProjectId(estimate.getProjectID());
		est.setProjectID(projectObj);
		
		EstRegionMaster regionObj=new EstRegionMaster();
		regionObj.setRegionId(estimate.getRegionID());;
		est.setRegionID(regionObj);
		
		EstCountryMaster countryObj=new EstCountryMaster();
		countryObj.setCountryId(estimate.getCountryID());
		est.setCountryID(countryObj);
		
		/*Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		est.setEstId("Est_"+randomInt);*/

		Date date =new Date();
		java.sql.Timestamp createDate = new Timestamp(date.getTime());
		est.setCreatedDate(createDate);
		
		est.setVersion(estimate.getVersion());
		est.setUserID(estimate.getUserID());
		est.setFilePath(estimate.getFilePath());
		
		Query query  = entityManager.createQuery("select max(e.estId) FROM EstEstimationTbl e");
		int lastEstID=(Integer) query.getSingleResult();
		lastEstID=lastEstID+1;
		est.setEstimationCode(lastEstID+"_"+clientObj.getClientId()+"_"+projectObj.getProjectId());
		
		try
		{
			
			entityManager.persist(est);
		}
		//Query query  = entityManager.createQuery("insert into EstEstimationTbl");
		catch(Exception e)
		{
			return false;
		}
		return true;
	}

	//Dynamic searchcriteria page - LoadModules - Start
	@SuppressWarnings("unchecked")
	public List<EstModuleMaster> loadModules(ProductModal productData) {
		
		Query query  = entityManager.createQuery("select e from EstModuleMaster e where e.estProductMaster.productId=:productID");

		query.setParameter("productID", productData.getProductID());
		
		return query.getResultList();

	}
	
	@SuppressWarnings("unchecked")
	public List<EstProductMaster> loadProducts(PraticeModal practiceData) {

		Query query  = entityManager.createQuery("select e from EstProductMaster e where e.estPracticeMaster.practiceId=:practiceID");

		query.setParameter("practiceID", practiceData.getPraticeID());
		
		return query.getResultList();
	}
	
	
	@SuppressWarnings("unchecked")
	public List<EstLobMaster> loadLOB() {

		Query query  = entityManager.createQuery("select e from EstLobMaster e");

		return query.getResultList();
	}

	//Dynamic searchcriteria page - LoadModules - END

	@SuppressWarnings("unchecked")
	public void addClients(EstimationModal estimate) {
		
		EstClientMaster clientObj=new EstClientMaster();
		clientObj.setClientName(estimate.getClientName());
		clientObj.setClientId(estimate.getClientID());
		
		EstPracticeMaster prc= new EstPracticeMaster();
		prc.setPracticeId(estimate.getPracticeID());
		
		
		EstRegionMaster regionObject= new EstRegionMaster();
		regionObject.setRegionName(estimate.getRegionName());
		regionObject.setRegionId(estimate.getRegionID());
		
		EstCountryMaster countryObj= new EstCountryMaster();
		countryObj.setCountryName(estimate.getCountryName());
		countryObj.setCountryId(estimate.getCountryID());
		countryObj.setEstRegionMaster(regionObject);
		
		
		EstProjectMaster projectObj= new EstProjectMaster();
		projectObj.setProjectName(estimate.getProjectName());
		projectObj.setProjectId(estimate.getProjectID());
		projectObj.setEstClientMaster(clientObj);
		projectObj.setEstPracticeMaster(prc);
		projectObj.setEstCountryMaster(countryObj);
		projectObj.setEstRegionMaster(regionObject);

		if(clientObj.getClientId()==null)
		entityManager.persist(clientObj);
		
		if(regionObject.getRegionId()==null)
		entityManager.persist(regionObject);
		
		if(countryObj.getCountryId()==null)
		entityManager.persist(countryObj);
		
		if(projectObj.getProjectId()==null)
		entityManager.persist(projectObj);	

	}

}
