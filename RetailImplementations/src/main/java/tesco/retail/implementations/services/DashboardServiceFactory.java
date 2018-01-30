package tesco.retail.implementations.services;

import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Service;
import tesco.retail.implementations.model.Project;

@Service
public interface DashboardServiceFactory {

	List<Project> GetProjects(Date todayDate);
}
