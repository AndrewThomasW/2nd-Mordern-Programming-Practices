package honorRole;

public class Student {
	//fields
	private String name;
	private double gpa;
	private String major;
	
	//constructor
	public Student(String name, double gpa, String major) {
		this.name = name;
		this.gpa=gpa;
		this.major = major;
	}
	//methods
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != Student.class) return false;
		Student s = (Student)ob;
		return s.name.equals(name) && s.equals(major.equals(major));
	}
}
