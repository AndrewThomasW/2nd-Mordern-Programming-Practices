package question2;

public final class Triangle implements IArea {

	// fields
	private final  double base;
	private final  double height;

	// constructor
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	//methods
	@Override
	public double computeArea() {
		double area = 1 / 2 * base * height;
		return area;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
}
