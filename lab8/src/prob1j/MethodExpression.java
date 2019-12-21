package prob1j;
import java.util.function.Supplier;


public class MethodExpression {
	public static void main(String[] args) {
		
		Supplier<Double> supplier = Math::random;
		
		System.out.println(supplier.get());
	}
}
