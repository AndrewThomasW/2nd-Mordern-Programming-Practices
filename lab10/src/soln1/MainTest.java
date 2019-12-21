package soln1;

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
	void asStringTest() {
		
		
		assertEquals("Alice Richards, Joe Stevens, John Sims, Steven Walters",Main.asString(emps));
	}
	
	
}


















