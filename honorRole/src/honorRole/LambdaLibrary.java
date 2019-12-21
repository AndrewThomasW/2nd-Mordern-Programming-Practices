package honorRole;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	public static final TriFunction<List<Student>, String, Double, List<Student>> DEPT_GPAHONOURVALUE = (allStudents,
			major, gpa) -> {

		return allStudents.parallelStream()
				.filter(student -> student.getGpa() > gpa)
				.filter(student -> student.getMajor().equals(major))
				.collect(Collectors.toList());
	};
	
	public static final TriFunction<List<Student>, String, Double, List<Student>> DEPT_GPAHONOURVALUE_DESC = (allStudents,
			major, gpa) -> {

		return allStudents.parallelStream()
				.filter(student -> student.getGpa() > gpa)
				.filter(student -> student.getMajor().equals(major))
				.sorted(Comparator.comparing(Student ::getGpa).reversed().thenComparing(Student:: getName))
				.collect(Collectors.toList());
	};
	
	
}
