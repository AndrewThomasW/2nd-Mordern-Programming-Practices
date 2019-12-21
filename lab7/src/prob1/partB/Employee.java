package prob1.partB;

public class Employee {
	//fields
	private String name;
	private int salary;
	
	//constructor
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + salary;
		return result;
	}


	@Override 
	public String toString() {
		return "(" + name + ", " + salary + ")";
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null) return false;
//		if( ! (obj instanceof Employee) ) return false;
//		Employee e = (Employee)obj;
//		boolean isEqual = e.name.equals(name) && e.salary == salary;
//		return  isEqual;
//	}
	
	public boolean equals(Employee e) {
		return e.name.equals(name) && e.salary == salary;
	}
}
