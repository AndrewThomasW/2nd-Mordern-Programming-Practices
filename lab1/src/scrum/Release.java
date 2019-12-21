package scrum;

import java.util.Date;
import java.util.List;

public class Release {
	private String releaseid;
	private Date releaseDate;
	private List<Sprint> sprints;	
	
	public String getReleaseid() {
		return releaseid;
	}
	public void setReleaseid(String releaseid) {
		this.releaseid = releaseid;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public List<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}
	
	

}
