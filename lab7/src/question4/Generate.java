package question4;

import java.util.stream.IntStream;

public class Generate {
	public static void main(String[] args) {

		IntStream
		.iterate(1, n -> n + 1)
		.map(n -> n * n)
		.limit(4)
		.forEach(n -> System.out.println(n));
	}
}
