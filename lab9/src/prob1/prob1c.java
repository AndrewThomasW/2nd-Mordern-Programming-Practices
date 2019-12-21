package prob1;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class prob1c {
	public static void main(String[] args) {
		Stream<Integer> intStream = Stream.of(2, 3, 9, 8);
		IntSummaryStatistics summary = intStream.collect(Collectors.summarizingInt(Integer::intValue));

		System.out.println("max = " + summary.getMax() + " min = " + summary.getMin());

	}
}
