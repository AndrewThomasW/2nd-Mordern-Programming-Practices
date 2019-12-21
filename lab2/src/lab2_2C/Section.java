package lab2_2C;

import java.util.ArrayList;
import java.util.List;

public class Section {
	public int sectionNum;
	String name;
	private Student student;
	private List<Student> students;

	public Section(int sectionNum, Student student) {
		this.sectionNum = sectionNum;
		students = new ArrayList<>();
		addStudent(student);
	}
	
	public int getSectionNum() {
		return sectionNum;
	}
	
	public Student getStudent() {
		return student;
	}
	
	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}


}
