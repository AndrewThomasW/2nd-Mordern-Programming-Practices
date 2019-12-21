package prob1;

import java.util.stream.IntStream;

public class Prob1a {
	public static void main(String[] args) {
		
		IntStream ones = IntStream.generate(() -> 1).limit(1);
		ones.forEach(System.out::println);
		
	}

}
