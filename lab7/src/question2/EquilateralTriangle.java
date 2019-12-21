package question2;

public class EquilateralTriangle implements Polygon {
	
	//fields
	private double side;
	
	//constructor
	public EquilateralTriangle(double side) {
		this.side = side;
	}
	
	//methods
	public double[] getSides() {
		double[] array = {side,side,side};
		return array;
	}
}
