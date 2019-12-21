package polymorphism;

public class Hourly extends Employee {
	// fields

	private double hourlyWage;
	private int hoursPerWeek;

	// constructor
	public Hourly(int empId, double hourlyWage, int hoursPerWeek) {
		super(empId);
		this.hourlyWage = hourlyWage;
		this.hoursPerWeek = hoursPerWeek;
	}

	public double calcGrossPay(int month, int year) {
		return this.hourlyWage * this.hoursPerWeek * 4;
	}
}
