package prob1;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Apple {
	//fields
	private String color;
	private double weight;
	
	//constructor
	public Apple(String color,double weight) {
		this.color = color;
		this.weight = weight;
	}
	
	//methods
	public String getColor() {
		return color;
	}
	
	public double getWeight() {
		return weight;
	}
	
		
	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + "]";
	}

	public static void main(String[] args) {
		
		List<Apple> inventory = new LinkedList<>();
		
		inventory.add(new Apple("red",150));
		inventory.add(new Apple("red",250));
		inventory.add(new Apple("blue",150));
//		inventory.add(new Apple("red",50));
//		inventory.add(new Apple("red",150));
//		inventory.add(new Apple("red",250));
//		inventory.add(new Apple("red",150));
//		inventory.add(new Apple("red",50));
//		inventory.add(new Apple("red",150));
//		inventory.add(new Apple("red",250));
//		inventory.add(new Apple("red",150));
//		inventory.add(new Apple("red",50));
		
//		Write a streams and lambda implementation that will
//		create a list of apples called redSpecials that include all the apples in our inventory that are red
//		and weigh more than 100 grams.
		
		List<Apple> redSpecials1 = 
				inventory
				.stream()
				.filter(a -> a.getColor().equals("red") && a.getWeight() > 100)
				.collect(Collectors.toList());
		
//		 Suppose we want the list redSpecials to only include the 10 heaviest red apples over 100 grams in
//		 our inventory. Modify your solution to problem 1 to meet this requirement.
		
		List<Apple> redSpecials2 = 
				inventory
				.stream()
				.filter(a -> a.getColor().equals("red") && a.getWeight() > 100 )
				.sorted(Comparator.comparing(Apple::getWeight).reversed())
				.limit(10)
				.collect(Collectors.toList());
		
		System.out.println(redSpecials1);
		System.out.println(LambdaLibrary.RED_SPECIALS_1.apply(inventory,"red",100));
		System.out.println(redSpecials2);
		
		
		
		
		
	}
	
	
}
