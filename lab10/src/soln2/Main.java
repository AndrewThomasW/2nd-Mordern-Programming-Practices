package soln2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import question.Employee;

public class Main {

	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
				          new Employee("John", "Sims", 110000),
				          new Employee("Joe", "Stevens", 200000),
		                  new Employee("Andrew", "Reardon", 80000),
		                  new Employee("Joe", "Cummings", 760000),
		                  new Employee("Steven", "Walters", 135000),
		                  new Employee("Thomas", "Blake", 111000),
		                  new Employee("Alice", "Richards", 101000),
		                  new Employee("Donald", "Trump", 100000));
		
		
		printEmps(emps);
		  System.out.println(emps
				    .stream()
				    .filter(e -> (e.getSalary() > 100000))
				    .filter(e -> (e.getLastName().charAt(0) > 'M'))
				    .map(e -> fullName(e))
				    .sorted()
				    .collect(Collectors.joining(", ")));
		  
	}
	
	public static String fullName(Employee e) {
		return e.getFirstName() + " " + e.getLastName();
	}
	
	public static String asString(List<Employee> emps) {
		return emps
				.stream()
				.filter(e -> salaryGreaterThan100000(e))
				.filter(e -> lastNameAfterM(e))
				.map(e -> fullName(e))
				.sorted()
				.collect(Collectors.joining(", "));
	}
	
	public static void printEmps(List<Employee> emps) {
		System.out.println(asString(emps));
	}
	
	public static boolean salaryGreaterThan100000(Employee e) {
		return (e.getSalary() > 100000);
	}
	
	public static boolean lastNameAfterM (Employee e) {
		return (e.getLastName().charAt(0) > 'M');
	}

}















