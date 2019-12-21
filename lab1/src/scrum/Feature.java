package scrum;

public class Feature {
	private String featureId;
	private String featureName;
	private WorkLoad workLoad;
	
	public Feature() {
	
	}

	public String getFeatureId() {
		return featureId;
	}

	public void setFeatureId(String featureId) {
		this.featureId = featureId;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public WorkLoad getWorkLoad() {
		return workLoad;
	}

	public void setWorkLoad(WorkLoad workLoad) {
		this.workLoad = workLoad;
	}
	
	
}
