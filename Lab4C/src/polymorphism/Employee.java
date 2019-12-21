package polymorphism;

public abstract class Employee {
	//fields
	private int empId;
	
	//constructor
	public Employee(int empId) {
		this.empId = empId;
	}
	
	//methods
	public void print() {
		System.out.println(toString());
	}
	
	public Paycheck calcCompesation(int month, int year) {
		
		double grossPay = calcGrossPay(month,year);
		double fica = 0.23 * grossPay;
		double state = 0.05 * grossPay;
		double local = 0.01 * grossPay;
		double medicare = 0.03 * grossPay;
		double socialSecurity = 0.075 * grossPay;
		
		Paycheck p = new Paycheck(grossPay, fica, state, local, medicare, socialSecurity);
		
		return p;
	}
	
	abstract public double calcGrossPay(int month, int year);
}
