package polymorphism;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class Commissioned extends Employee {
	// fields
	private double commission;
	private double baseSalary;
	private List<Order> orderList;

	// constructor
	public Commissioned(int empId, double commission, double baseSalary) {
		super(empId);
		this.commission = commission;
		this.baseSalary = baseSalary;
		orderList = new LinkedList<>();
	}
	
	/*
	 * watch out for this
	 */
	
	@Override
	public double calcGrossPay(int month, int year) {
		LocalDate firstOfCurrentMonth = LocalDate.of(year, month, 1);
		double totalValue = 0.0;
		for(Order o: orderList) {
			if(isPreviousMonth(firstOfCurrentMonth, o.getOrderDate())) {
				totalValue += o.getOrderAmount();
			}
		}
		
		return baseSalary + ((commission/100) * totalValue);
		
	}
	
	private boolean isPreviousMonth(LocalDate current, LocalDate maybePrevious) {
		
		int currentMonth = current.getMonthValue();
		int previousMonth = maybePrevious.getMonthValue();
		int currentYear = current.getYear();
		int prevYear = maybePrevious.getYear();
		
		if((currentMonth - previousMonth == 1 && currentYear == prevYear) ||
				(currentMonth == 1 && previousMonth == 12 && currentYear - prevYear == 1)) {
			return true;
		}
		return false;
	}
		

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

}
