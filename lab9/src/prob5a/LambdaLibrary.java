package prob5a;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	static final TriFunction<List<Employee> ,Integer ,Character ,String > NAMES_BY_SALARY = 
			(list,salary,letter) -> {
				
				return list
				.stream()
				.filter(e -> e.getSalary() > salary)
				.filter(e -> e.getLastName().charAt(0) > letter)
				.map(e -> (" " + e.getFirstName() + " " + e.getLastName()))
				.sorted()
				.collect(Collectors.joining(","));
			};

}
