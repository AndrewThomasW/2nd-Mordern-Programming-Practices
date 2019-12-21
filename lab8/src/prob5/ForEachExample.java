package prob5;

import java.util.Arrays;
import java.util.List;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		
		//solution for part (a)
		list.forEach(string -> System.out.println(string.toUpperCase()));	
		
		//solution for part (b)
		list.forEach(ForEachExample :: printToUpperCase);
	}
	
	public static void printToUpperCase(String string ) {
		 System.out.println(string.toUpperCase());
	}
	
}
