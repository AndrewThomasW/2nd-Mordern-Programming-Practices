package prob1j;

import java.util.function.Supplier;

public class InnerClass {
	
	class Myrandom implements Supplier<Double>{
		@Override
		public Double get() {
			// TODO Auto-generated method stub
			return Math.random();
		}

	}

	public static void main(String[] args) {
		
		Supplier<Double> supplier = (new InnerClass()).new Myrandom();
		System.out.println(supplier.get());
	}
	
}
