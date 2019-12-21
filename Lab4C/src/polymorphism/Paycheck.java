package polymorphism;

public final class Paycheck {
	//fields
	double grossPay;
	double fica;
	double state;
	double local;
	double medicare;
	double socialSecurity;
	
	//constructor
	public Paycheck(double grossPay,double fica,double state,double local,double medicare,double socialSecurity) {
		this.grossPay = grossPay;
		this.fica = fica;
		this.state =state;
		this.local = local;
		this.medicare = medicare;
		this.socialSecurity = socialSecurity;
	}
	
	//methods
	public void print() {
		System.out.println(toString());
	}
	
	public double getNetPay() {
		return grossPay - (fica + state + local + medicare + socialSecurity );
	}
	
	@Override
	public String toString() {
		return "PAYCHECK: \n "
				+ " Gross Pay: " + grossPay + "\n"
				+ "  Fica: " + fica  + "\n" 
				+ "  State: " + state  + "\n" 
				+ "  Local: " + local  + "\n" 
				+ "  Medicare: " + medicare  + "\n" 
				+ "  Social Security: " + socialSecurity  + "\n" 
				+ "  Net Pay: " + getNetPay() + "\n \n";
	}
}
