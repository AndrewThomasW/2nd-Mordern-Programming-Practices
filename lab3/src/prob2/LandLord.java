package prob2;

import java.util.List;

public class LandLord {
	//fields
	private List<Building> buildings;

	//constructor
	public LandLord(List<Building> bldgs) {
		buildings = bldgs;
	}
	
	//methods
	public void addBuilding(Building b) {
		buildings.add(b);
	}
	
	public List<Building> getBuildings() {
		return buildings;
	}
	
	

}
