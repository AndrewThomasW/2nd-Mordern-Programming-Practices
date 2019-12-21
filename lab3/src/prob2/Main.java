package prob2;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String [] args) {
		
		//creating Appartments
		Appartment ap1 = new Appartment(10000);
		Appartment ap2 = new Appartment(10000);
		Appartment ap3 = new Appartment(10000);
		
//		// adding appartments to building
//		b1.addAppartment(ap1);
//		b2.addAppartment(ap2);
//		b3.addAppartment(ap3);
//		
//		List<Appartment> aList1 = Arrays.asList(ap1);
//		
//		//creating building
//		Building b1 = new Building(1000);
//		Building b2 = new Building(1000);
//		Building b3 = new Building(1000);
//		
//
//		//add building to landlord
//		ld.addBuilding(b1);
//		ld.addBuilding(b2);
//		ld.addBuilding(b3);
//		
//		
//		// create LandLord
//		LandLord ld = new LandLord();
//		
//		//System.out.println(b2.getProfit());
//		
//		System.out.println(getlandlordMonthlyTotalProfit(ld));
		
	}
	
	//landlord’s monthly total profits
	static double  getlandlordMonthlyTotalProfit(LandLord ld) {
		List<Building> tempList = ld.getBuildings();
		double profit = 0;
		
		for(Building b : tempList ) {
			profit += b.getProfit();
		}
		
		return profit;
	}
}
