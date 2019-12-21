package prob4;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
//import java.util.stream.Collectors;

public class Union {
	public static void main(String[] args) {
		// Example: The union method should transform the list [{“A”, “B”}, {“D”}, {“1”,
		// “3”, “5”}]
		// to the set {“A”, “B”, “D”, “1”, “3”, “5”}.

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		Set<String> set3 = new HashSet<>();
		List<Set<String>> setOfSets = new LinkedList<>();

		set1.add("A");
		set1.add("B");

		set2.add("D");

		set3.add("1");
		set3.add("3");
		set3.add("5");

		setOfSets.add(set1);
		setOfSets.add(set2);
		setOfSets.add(set3);

		System.out.println(setOfSets);
		System.out.println(union(setOfSets));

	}

	public static Set<String> union(List<Set<String>> sets) {
		
		Set<String> EMPTY_SET = new HashSet<String>();
		return sets.stream().reduce(EMPTY_SET, (s, t) -> {s.addAll(t); return s;});
		
		//return sets.stream().flatMap(set -> set.stream()).collect(Collectors.toSet());
		
	}
	
	

}
