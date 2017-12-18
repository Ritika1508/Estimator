package com.ey.estimator.rest.controller;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.persistence.NoResultException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
import com.ey.estimator.rest.modal.BaselineModal;
import com.ey.estimator.rest.modal.BaselineStatus;
import com.ey.estimator.rest.modal.ClientModal;
import com.ey.estimator.rest.modal.ClientStatusModal;
import com.ey.estimator.rest.modal.CountryModal;
import com.ey.estimator.rest.modal.CountryStatusModal;
import com.ey.estimator.rest.modal.EstimateStatusModal;
import com.ey.estimator.rest.modal.EstimationModal;
import com.ey.estimator.rest.modal.LOBModal;
import com.ey.estimator.rest.modal.LOBStatusModal;
import com.ey.estimator.rest.modal.ModuleModal;
import com.ey.estimator.rest.modal.ModuleStatusModal;
import com.ey.estimator.rest.modal.PraticeModal;
import com.ey.estimator.rest.modal.PraticeStatusModal;
import com.ey.estimator.rest.modal.ProductModal;
import com.ey.estimator.rest.modal.ProductStatusModal;
import com.ey.estimator.rest.modal.ProjectModal;
import com.ey.estimator.rest.modal.ProjectStatusModal;
import com.ey.estimator.rest.modal.RegionModal;
import com.ey.estimator.rest.modal.RegionStatusModal;
//import com.ey.estimator.rest.modal.StatusModal;
import com.ey.estimator.rest.services.StaticContentService;

@Component
@Path("/static")
public class StaticRestResource {

	@Autowired(required = true)
	@Qualifier("staticService")
	private StaticContentService staticService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/loadRegions")
	public Response loadRegions() {
		List<EstRegionMaster> regions = null;
		RegionStatusModal status = new RegionStatusModal();
		try {
			regions = staticService.loadRegions();
			List<RegionModal> regionList = new ArrayList<RegionModal>();
			for(EstRegionMaster region : regions) {
				RegionModal regionModal = new RegionModal();
				regionModal.setId(region.getRegionId());
				regionModal.setDesc(region.getRegionName());
				/*Set<CountryModal> countryModals = new HashSet<CountryModal>();
				for(EstCountryMaster countryMaster : region.getEstCountryMasters()) {
					CountryModal country = new CountryModal();
					country.setCountryID(countryMaster.getCountryId());
					country.setCountryName(countryMaster.getCountryName());
					countryModals.add(country);
				}
				regionModal.setCountries(countryModals);*/
				regionList.add(regionModal);
			}
			status.setStatus(HttpStatus.SC_OK);
			status.setRegions(regionList);
			status.setMessage("Successful Retrival");

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		return Response.ok(status).build();
	}



	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/loadPratices")
	public Response loadPratices() {
		List<EstPracticeMaster> pratices = null;
		PraticeStatusModal status = new PraticeStatusModal();
		try {
			pratices = staticService.loadPratices();
			List<PraticeModal> praticeList = new ArrayList<PraticeModal>();
			for(EstPracticeMaster pratice : pratices) {
				PraticeModal praticeModal = new PraticeModal();
				praticeModal.setPraticeID(pratice.getPracticeId());
				praticeModal.setPraticeName(pratice.getPracticeName());
				/*Set<ProductModal> productModals = new HashSet<ProductModal>();
				for(EstProductMaster productMaster : pratice.getEstProductMasters()) {
					ProductModal product = new ProductModal();
					product.setProductID(productMaster.getProductId());
					product.setProductName(productMaster.getProductType());
					productModals.add(product);
				}
				praticeModal.setProducts(productModals);*/
				praticeList.add(praticeModal);
			}
			status.setStatus(HttpStatus.SC_OK);
			status.setPratices(praticeList);
			status.setMessage("Successful Retrival");

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		return Response.ok(status).build();
	}

	//apurva

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/loadClients")
	public Response loadClients() {
		List<EstClientMaster> clients = null;
		ClientStatusModal status = new ClientStatusModal();
		try {
			clients = staticService.loadClients();
			List<ClientModal> clientList = new ArrayList<ClientModal>();
			for(EstClientMaster client : clients) {
				ClientModal clientModal = new ClientModal();
				clientModal.setId(client.getClientId());
				clientModal.setName(client.getClientName());
				clientList.add(clientModal);
			}
			status.setStatus(HttpStatus.SC_OK);
			status.setClients(clientList);
			status.setMessage("Successful Retrival");

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		return Response.ok(status).build();
	}


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/loadProjects")
	public Response loadProjects() {
		List<EstProjectMaster> projects = null;
		ProjectStatusModal status = new ProjectStatusModal();
		try {
			projects = staticService.loadProjects();
			List<ProjectModal> projectsList = new ArrayList<ProjectModal>();
			for(EstProjectMaster project : projects) {
				ProjectModal projectModal = new ProjectModal();
				projectModal.setId(project.getProjectId());
				projectModal.setName(project.getProjectName());
				projectsList.add(projectModal);
			}
			status.setStatus(HttpStatus.SC_OK);
			status.setProjects(projectsList);
			status.setMessage("Successful Retrival");

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		return Response.ok(status).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/loadCountries")
	public Response loadCountries() {
		List<EstCountryMaster> countries = null;
		CountryStatusModal status = new CountryStatusModal();
		try {
			countries = staticService.loadCountries();
			List<CountryModal> countryList = new ArrayList<CountryModal>();
			for(EstCountryMaster country : countries) {
				CountryModal countryModal = new CountryModal();
				countryModal.setCountryID(country.getCountryId());
				countryModal.setCountryName(country.getCountryName());
				countryList.add(countryModal);
			}
			status.setStatus(HttpStatus.SC_OK);
			status.setCountry(countryList);
			status.setMessage("Successful Retrival");

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		return Response.ok(status).build();
	}
	
	//Dynamic searchcriteria page - loadProducts - start
		@POST
		@Consumes(MediaType.APPLICATION_JSON)
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/loadProducts")
		public Response loadProducts(PraticeModal practiceData) {
			List<EstProductMaster> Product = null;
			ProductStatusModal status = new ProductStatusModal();
			try {
				Product = staticService.loadProducts(practiceData); // DAO CLASS CODING
				List<ProductModal> moduleList = new ArrayList<ProductModal>();
				for(EstProductMaster product : Product) {
					ProductModal productModal = new ProductModal();
					productModal.setProductID(product.getProductId());
					productModal.setProductName(product.getProductName());  // update EstProductMaster with database Design
					moduleList.add(productModal);
				}
				status.setStatus(HttpStatus.SC_OK);
				status.setProduct(moduleList);
				status.setMessage("Successful Retrival");

			} catch (NoResultException e) {
				status.setStatus(HttpStatus.SC_NOT_FOUND);
				status.setMessage("No Record Found :: " +e.getMessage());
			}
			catch (Exception e) {
				status.setStatus(205);
				status.setMessage("No Record Found :: " +e.getMessage());
			}
			return Response.ok(status).build();
		}
		//Dynamic searchcriteria page - loadProducts - END
	
	//Dynamic searchcriteria page - LoadModules - start
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/loadModules")
	public Response loadModules(ProductModal productData) {
		List<EstModuleMaster> modules = null;
		ModuleStatusModal status = new ModuleStatusModal();
		try {
			modules = staticService.loadModules(productData);
			List<ModuleModal> moduleList = new ArrayList<ModuleModal>();
			for(EstModuleMaster module : modules) {
				ModuleModal moduleModal = new ModuleModal();
				moduleModal.setModuleID(module.getModuleID());
				moduleModal.setModuleName(module.getModuleName());
				moduleList.add(moduleModal);
			}
			status.setStatus(HttpStatus.SC_OK);
			status.setModules(moduleList);
			status.setMessage("Successful Retrival");

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("No Record Found :: " +e.getMessage());
		}
		return Response.ok(status).build();
	}
	//Dynamic searchcriteria page - LoadModules - END

	//Dynamic searchcriteria page - loadLOB - start
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		@Path("/loadLOB")
		public Response loadLOB() {
			List<EstLobMaster> lobs = null;
			LOBStatusModal status = new LOBStatusModal();
			try {
				lobs = staticService.loadLOB();
				List<LOBModal> lobList = new ArrayList<LOBModal>();
				for(EstLobMaster lob : lobs) {
					LOBModal lobModal = new LOBModal();
					lobModal.setLobId(lob.getLobId());
					lobModal.setLobName(lob.getLobName());
					lobList.add(lobModal);
				}
				status.setStatus(HttpStatus.SC_OK);
				status.setlob(lobList);
				status.setMessage("Successful Retrival");

			} catch (NoResultException e) {
				status.setStatus(HttpStatus.SC_NOT_FOUND);
				status.setMessage("No Record Found :: " +e.getMessage());
			}
			catch (Exception e) {
				status.setStatus(205);
				status.setMessage("No Record Found :: " +e.getMessage());
			}
			return Response.ok(status).build();
		}
		//Dynamic searchcriteria page - loadLOB - END

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/searchEstimation")
	public EstimateStatusModal searchEstimate(EstimationModal estimationModal) {

		List<EstEstimationTbl> estimateList = null;	
		List<EstimationModal> estimateResult = new ArrayList<EstimationModal>();	

		EstimateStatusModal status = new EstimateStatusModal();
		try 
{
			estimateList = staticService.searchEstimate(estimationModal);

			for(EstEstimationTbl est:estimateList)
			{			
				EstimationModal estimateMod = new EstimationModal();
				estimateMod.setClientID(est.getClientID().getClientId());
				estimateMod.setClientName(est.getClientID().getClientName());
				estimateMod.setCountryID(est.getCountryID().getCountryId());
				estimateMod.setCountryName(est.getCountryID().getCountryName());
				estimateMod.setEstID(est.getEstId());
				estimateMod.setProjectID(est.getProjectID().getProjectId());
				estimateMod.setProjectName(est.getProjectID().getProjectName());
				estimateMod.setRegionID(est.getRegionID().getRegionId());
				estimateMod.setRegionName(est.getRegionID().getRegionName());
				estimateMod.setCreateDate(est.getCreatedDate().toString());
				estimateMod.setEstimationCode(est.getEstimationCode());
				estimateMod.setFilePath(est.getFilePath());
				estimateMod.setUserID(est.getUserID());
				estimateMod.setVersion(est.getVersion());

				estimateResult.add(estimateMod);
			}


			status.setStatus(HttpStatus.SC_OK);
			status.setEstimateList(estimateResult);
			status.setMessage("Successful Search");

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


	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/insertEstimation")
	public EstimateStatusModal insertEstimate(EstimationModal estimationModal) {

		EstimateStatusModal status = new EstimateStatusModal();

		try 
		{
			boolean success = staticService.insertEstimate(estimationModal);

			if(success)
			{
				status.setStatus(HttpStatus.SC_OK);
				status.setEstimateList(null);
				status.setMessage("Successful Insertion");
			}

		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("Error while insertion " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("Error while insertion " +e.getMessage());
		}

		return status;
	}



@SuppressWarnings("unchecked")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getBaseline")
	public BaselineStatus getBaseline(List<ModuleModal> moduleIDs) 
	{
		BaselineStatus status = new BaselineStatus();	
		
		//String modarr[]=moduleIDs.substring(13,moduleIDs.length()-2).split(",");
		
		/*List<ModuleModal> moduleList=new ArrayList<ModuleModal>();
		for(String m:modarr)
		{
			ModuleModal mod=new ModuleModal();
			mod.setModuleID(m);
			moduleList.add(mod);
		}*/		

		try 
		{
			HashMap<String,Object> baseLineMap = new HashMap<String,Object>();
			//baseLineMap = staticService.getBaseline(moduleList);
			baseLineMap = staticService.getBaseline(moduleIDs);

			if(!baseLineMap.isEmpty())
			{
				HashMap<String,Object> baseLineModalMap = new HashMap<String,Object>();
				List <EstBaselineProductModule> blList= new ArrayList<EstBaselineProductModule>();			
				for(String key: baseLineMap.keySet())
				{
					blList= (List<EstBaselineProductModule>) baseLineMap.get(key);
					List <BaselineModal> blModalList= new ArrayList<BaselineModal>();
					
					String moduleName=null;
					
					for(EstBaselineProductModule bl:blList)
					{
						
						BaselineModal baselineobj=new BaselineModal();
						baselineobj.setBaselineID(bl.getBaselineID());
						baselineobj.setComplexity(bl.getComplexity());
						baselineobj.setCustomization(bl.getCustomization());
						baselineobj.setFeature(bl.getFeature());
						baselineobj.setFeatureType(bl.getFeatureType());
						baselineobj.setOtbType(bl.getOtbType());
						baselineobj.setTotal(bl.getTotal());
						baselineobj.setUseCase(bl.getUseCase());
						baselineobj.setVersion(bl.getVersion());
						baselineobj.setModuleID(bl.getEstModuleMaster().getModuleName());
						moduleName=bl.getEstModuleMaster().getModuleName();
						baselineobj.setProductID(bl.getProductID().getProductName());

						blModalList.add(baselineobj);

					}
					
					baseLineModalMap.put(moduleName, blModalList);
				}
				/*for(EstBaselineProductModule bl:baselineList)
				{
					BaselineModal baselineobj=new BaselineModal();
					baselineobj.setBaselineID(bl.getBaselineID());
					baselineobj.setComplexity(bl.getComplexity());
					baselineobj.setCustomization(bl.getCustomization());
					baselineobj.setFeature(bl.getFeature());
					baselineobj.setFeatureType(bl.getFeatureType());
					baselineobj.setOtbType(bl.getOtbType());
					baselineobj.setTotal(bl.getTotal());
					baselineobj.setUseCase(bl.getUseCase());
					baselineobj.setVersion(bl.getVersion());
					baselineobj.setModuleID(bl.getModuleID().getModuleName());
					baselineobj.setProductID(bl.getProductID().getProductName());

					blModalList.add(baselineobj);

				}*/
				status.setStatus(HttpStatus.SC_OK);
				status.setBaseLineMap(baseLineModalMap);
				status.setMessage("Successful Search");
			}

			else
			{
				status.setStatus(HttpStatus.SC_OK);
				status.setBaseLineMap(null);
				status.setMessage("No Records Found!");
			}



		} catch (NoResultException e) {
			status.setStatus(HttpStatus.SC_NOT_FOUND);
			status.setMessage("Error while insertion " +e.getMessage());
		}
		catch (Exception e) {
			status.setStatus(205);
			status.setMessage("Error while insertion " +e.getMessage());
		}

		return status;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addClients")
	public Response addClients(EstimationModal estimationModal){
		ClientStatusModal status = new ClientStatusModal();
		try {
			staticService.addClients(estimationModal);
			status.setStatus(HttpStatus.SC_OK);
			status.setMessage("Successful Insertion");
		}catch(Exception e){
			status.setStatus(HttpStatus.SC_NOT_ACCEPTABLE);
			status.setMessage("Insert to DB failed :: " +e.getMessage());
		}
		
		return Response.ok(status).build();
	}

}	