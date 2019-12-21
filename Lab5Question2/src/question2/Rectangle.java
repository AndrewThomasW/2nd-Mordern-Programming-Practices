package question2;

public final class Rectangle implements IArea {

	// fields
	private final double width;
	private final double length;

	// constructor
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	//methods
	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	@Override
	public double computeArea() {
		double area = width * length;
		return area;
	}
}
