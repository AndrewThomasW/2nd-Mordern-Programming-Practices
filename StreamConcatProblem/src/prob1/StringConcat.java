package prob1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Comparator;

public class StringConcat {

	// Returns a list of those strings which belong to just one of the two lists
	// using concat
	public static List<String> elementsInJustOne(List<String> list1, List<String> list2) {
		// implement

		Stream<String> stream1 = list1.stream().filter(s -> !list2.contains(s));
		Stream<String> stream2 = list2.stream().filter(s -> !list1.contains(s));
		
		return Stream.concat(stream1, stream2).collect(Collectors.toList());
	}

	// test methods
	public static void main(String[] args) {
		testFirstMethod();
	}

	private static void testFirstMethod() {
		List<String> list1 = Arrays.asList(new String[] { "friend", "tree", "bike", "bat" });
		List<String> list2 = Arrays.asList(new String[] { "tree", "strong", "bike", "weak" });
		System.out.println("Strings occurring in just one of the two lists: " + elementsInJustOne(list1, list2));
		
		Optional<String> max = list1.stream().max(Comparator.comparing(String::length));
		
		//max.ifPresent(value -> System.out.println(value));
		System.out.println(max.orElse("null"));
	}
}
