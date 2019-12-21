package scrum;

import java.util.List;

public class Project {
private String projectId;
private String projectName;
private List<Feature> features;
private List<Release> releases;

public String getProjectId() {
	return projectId;
}

public void setProjectId(String projectId) {
	this.projectId = projectId;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public List<Feature> getFeatures() {
	return features;
}

public void setFeatures(List<Feature> features) {
	this.features = features;
}

public List<Release> getReleases() {
	return releases;
}

public void setReleases(List<Release> releases) {
	this.releases = releases;
}


}