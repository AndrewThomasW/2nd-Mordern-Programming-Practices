package prob1.partB;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Test {
	private int a;
	private String name;

	public Test(int a, String name) {
		this.a = a;
		this.name = name;
	}

	public void print() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Test other = (Test) obj;
		if (a != other.a)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	

		
		class Myrandom implements Supplier<Double>{
			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random();
			}
			
		}
	

	public static void main(String[] args) {

		
		Supplier<Double> supplier = () -> Math.random();
	
	
		Supplier<Double> supplier2 = new Test(5, "five").new Myrandom();

		System.out.println(supplier.get());
		System.out.println(supplier2.get());
		

	}
}
