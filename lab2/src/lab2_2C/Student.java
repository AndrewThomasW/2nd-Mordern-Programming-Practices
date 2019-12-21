package lab2_2C;

import java.util.ArrayList;
import java.util.List;

public class Student {
	public String name;
	private List<Section> sections;
	
	public Student(String name) {
		this.name = name;
		sections = new ArrayList<Section>();
	}

	public String getName() {
		return name;
	}

	public List<Section> getSections() {
		return sections;
	}

	public void setSections(Section section) {
		sections.add(section);
	}
	
	

}
