package polymorphism;

public class Salaried extends Employee {
	//fields
	private double salary;
	
	//constructor
	public Salaried(int empId,double salary) {
		super(empId);
		this.salary = salary;
	}
	
	//methods
	public double calcGrossPay(int month, int year) {
		return salary;
	}
}
