package prob1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob1b {
	public static void main(String[] args) {
			
		Stream<String> stringStream = Stream.of("Bill","Thomas", "Mary");
		
		System.out.print(stringStream.collect(Collectors.joining(",")));
		

	}

}