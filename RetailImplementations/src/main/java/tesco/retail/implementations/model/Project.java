/**
 * 
 */
package tesco.retail.implementations.model;

import java.util.Date;
import java.util.List;

/**
 * @author vagrant
 *
 */
public class Project {
		private long id;
		private String projectName;
		private Date startDate;
		private Date endDate;
		private List<Store> scheduledStores;
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getProjectName() {
			return projectName;
		}
		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}
		public Date getStartDate() {
			return startDate;
		}
		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}
		public Date getEndDate() {
			return endDate;
		}
		public void setEndDate(Date endDate) {
			this.endDate = endDate;
		}
		public List<Store> getScheduledStores() {
			return scheduledStores;
		}
		public void setScheduledStores(List<Store> scheduledStores) {
			this.scheduledStores = scheduledStores;
		}
}
