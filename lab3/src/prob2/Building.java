package prob2;

import java.util.List;

public class Building {
	// fields
	private double maintenanceCost;
	private List<Appartment> appartments;

	// constructor
	public Building(int maintenanceCost, List<Appartment> aprts) {
		this.maintenanceCost = maintenanceCost;
		appartments = aprts;
	}

	// profit
	public double getProfit() {

		double totalRent = 0;

		for (Appartment a : appartments) {
			totalRent += a.getRent();
		}

		return totalRent - maintenanceCost;
	}

	// add appartment
	public void addAppartment(Appartment aprtmt) {
		appartments.add(aprtmt);
	}

}
