package question2;

import java.util.Arrays;

public interface Polygon extends ClosedCurve {
	
	double[] getSides();
	
	default public double computePerimeter() {
		
		double[] array = getSides();
		
		return Arrays.stream(array).sum();
	}
	
	
}
