package question2;

import java.util.LinkedList;
import java.util.List;

public class MainProgram {
	 
	
	public static void main(String[] args) {
		
		List<IArea> list = new LinkedList<>();
		
		list.add(new Rectangle(5,10));
		list.add(new Triangle(2,3));
		list.add(new Circle(10));
		
		
		double sum = 0.0;
		
		for(IArea i : list) {
			sum += i.computeArea();
		}
		
		System.out.println("Sum of areas = " + sum);
	}

}
