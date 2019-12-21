package question4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		MyConsumer consumer = new MyConsumer();
		list.forEach(consumer);	
	}
	
	//implement a Consumer
	static class MyConsumer implements Consumer<String> {
		public void accept(String string) {
			System.out.println(string.toUpperCase());
		}
	}
}
