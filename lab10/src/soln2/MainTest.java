package soln2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import question.Employee;
import question.Main;

class MainTest {
	
	List<Employee> emps = Arrays.asList(new Employee("Joe", "Davis", 120000),
	          new Employee("John", "Sims", 110000),
	          new Employee("Joe", "Stevens", 200000),
	          new Employee("Andrew", "Reardon", 80000),
	          new Employee("Joe", "Cummings", 760000),
	          new Employee("Steven", "Walters", 135000),
	          new Employee("Thomas", "Blake", 111000),
	          new Employee("Alice", "Richards", 101000),
	          new Employee("Donald", "Trump", 100000));

	@Test
	void salaryGreaterThan100000Test() {
		Employee emp = new Employee("John", "Sims", 110000);
		assertEquals(true,Main.salaryGreaterThan100000(emp));
	}
	
	@Test
	void lastNameAfterM() {
		Employee emp = new Employee("Steven", "Walters", 135000);
		assertEquals(true,Main.lastNameAfterM(emp));
		//Donald Trump
	}
	
	@Test
	void fullName() {
		Employee emp = new Employee("Donald", "Trump", 100000);
		assertEquals("Donald Trump", Main.fullName(emp));
	}

}


















