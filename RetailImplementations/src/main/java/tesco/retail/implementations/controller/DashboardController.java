/**
 * 
 */
package tesco.retail.implementations.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tesco.retail.implementations.model.Project;
import tesco.retail.implementations.services.DashboardServiceFactory;

/**
 * @author vagrant
 *
 */
@RestController
@RequestMapping("api/v1/")
public class DashboardController {

	@Autowired
	private DashboardServiceFactory dashboardService;
	
	@RequestMapping(value = "projects", method = RequestMethod.GET)
    public ResponseEntity<List<Project>> listAllProjects() {
       List<Project> projects = dashboardService.GetProjects(new Date());
       if(projects.isEmpty()){
    	   return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }
       return new ResponseEntity<List<Project>>(projects,HttpStatus.OK);
    }
	
}
