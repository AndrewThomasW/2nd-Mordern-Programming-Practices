package prob6;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {

	// print the number of Employees in list whose salary > 100000 and whose
	// last name begins
	// with a letter that comes after the letter 'E'

	 static TriFunction<List<Employee>, Integer, Character, Long> NUMBER_OF_EMPLOYEES_BY_SALARY = 
			(list, salary,letter) -> {
				
				return list
						.stream()
						.filter(e -> e.getSalary() > salary)
						.filter(e -> e.getLastName().charAt(0) > letter)
						.count();
	};
	
	// print a list of sorted full names - all upper case -- of Employees
	// with
	// salary > 85000 and whose first name begins with a letter that comes
	// before the letter 'R'
	
	 static TriFunction<List<Employee>, Integer, Character, String> LIST_OF_EMPLOYEES_BY_SALARY = 
			(list, salary,letter) -> {
				
				return list
						.stream()
						.filter(e -> e.getSalary() > salary)
						.filter(e -> e.getFirstName().charAt(0) < letter)
						.map(e -> e.getFirstName() + " " + e.getLastName())
						.map(String :: toUpperCase)
						.sorted()
						.collect(Collectors.joining(","));
	};
	
	
	

}
