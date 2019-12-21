package question2;

public final class Circle implements IArea {
	
	// fields
	private final  double radius;

	// constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	//methods
	
	public double getradius() {
		return radius;
	}	
	
	@Override
	public double computeArea() {
		double area = Math.PI * Math.pow(radius, 2);
		return area;
	}

	

}
