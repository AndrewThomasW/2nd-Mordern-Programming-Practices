package scrum;

public class Report {
	private Sprint sprint;
	private ProjectManager manager;
	private int hoursWorked;
	private int hoursRemaining;
	
	public Report() {
		
	}
	
	public Sprint getSprint() {
		return sprint;
	}
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
	public ProjectManager getManager() {
		return manager;
	}
	public void setManager(ProjectManager manager) {
		this.manager = manager;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHoursRemaining() {
		return hoursRemaining;
	}
	public void setHoursRemaining(int hoursRemaining) {
		this.hoursRemaining = hoursRemaining;
	}
	
	

}
