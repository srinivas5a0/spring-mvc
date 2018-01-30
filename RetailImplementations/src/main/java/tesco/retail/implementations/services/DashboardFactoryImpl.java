/**
 * 
 */
package tesco.retail.implementations.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import tesco.retail.implementations.model.Project;
import tesco.retail.implementations.model.Store;

/**
 * @author vagrant
 *
 */
@Service
public class DashboardFactoryImpl implements DashboardServiceFactory {

	/* (non-Javadoc)
	 * @see tesco.retail.implementations.services.DashboardServiceFactory#GetProjects(java.util.Date)
	 */
	@Override
	public List<Project> GetProjects(Date todayDate) {
		// TODO Auto-generated method stub
		
		List<Project> projectList = new ArrayList<Project>();
		
		Store store = new Store();
		store.setId(1);
		store.setStoreNumber("9754");
		store.setStoreIp("66.30.1.1");
				
		List<Store> storeList = new ArrayList<Store>();
		storeList.add(store);
		
		Project project = new Project();
		project.setId(1);
		project.setProjectName("CBO 5532");
		project.setStartDate(new Date());
		project.setEndDate(new Date());
		project.setScheduledStores(storeList);
		
		projectList.add(project);
		
		
		return projectList;
	}

}
