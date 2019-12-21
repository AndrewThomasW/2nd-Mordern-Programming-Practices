package prob1;

import java.util.List;
import java.util.stream.Collectors;

public class LambdaLibrary {
	
	static TriFunction<List<Apple>,String,Integer,List<Apple>> RED_SPECIALS_1 = 
			(inventory,color,grams) -> {
				return inventory
				.stream()
				.filter(a -> a.getColor().equals(color) && a.getWeight() > grams)
				.collect(Collectors.toList());
			};
}
