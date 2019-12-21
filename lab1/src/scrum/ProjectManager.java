package scrum;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager {
	private String ssn;
	private String name;
	private List<Report> reports;
	
	public ProjectManager() {
		reports = new ArrayList<>();
		
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Report> getReports() {
		return reports;
	}

	public void setReports(List<Report> reports) {
		this.reports = reports;
	}

	
}
