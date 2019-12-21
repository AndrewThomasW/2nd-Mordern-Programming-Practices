package application;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import polymorphism.Commissioned;
import polymorphism.Employee;
import polymorphism.Hourly;
import polymorphism.Order;
import polymorphism.Paycheck;
import polymorphism.Salaried;

public class Main {
	public static void main(String[] args) {
		
		//creating Employees
		Hourly h = new Hourly(1,1000,20);
		Salaried s = new Salaried(2,1000);
		Commissioned c = new Commissioned(3,10,1000);
		
		List<Order> cOrderList = Arrays.asList(  new Order(1,LocalDate.of(2015, 02, 18),3000), new Order(1,LocalDate.of(2015, 02, 22),4000) );
		c.setOrderList(cOrderList);
		
		Paycheck hPaycheck = h.calcCompesation(03, 2015);
		hPaycheck.print();
		
		Paycheck sPaycheck = s.calcCompesation(03, 2015);
		sPaycheck.print();
		
		Paycheck cPaycheck = c.calcCompesation(03, 2015);
		cPaycheck.print();
	}
}
