package prob1;

public class PersonWithJob extends Person {
	
	private Person person;
	private double salary;
	
	PersonWithJob(String n, double s) {
		super(n);
		//person = new Person(n);
		salary = s;
	}
	
	public String getName() {
		return person.getName();
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false; 
		if(!(aPerson instanceof PersonWithJob)) return false;
		PersonWithJob p = (PersonWithJob)aPerson;
		boolean isEqual = this.getName().equals(p.getName()) &&
				this.getSalary()==p.getSalary();
		return isEqual;
	}
	
	
	/*@Override
	public boolean equals(Object ob) {
		if(ob == null) return false; 
		if( getClass() != ob.getClass() ) return false;
		PersonWithJob p = (PersonWithJob)ob;
		return p.person.equals(person) && p.salary == salary;
	}*/
	
	
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
