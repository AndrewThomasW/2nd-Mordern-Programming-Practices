package question2;

public class Rectangle implements Polygon {
	//fields
	private double length, width;
	
	//constructor
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	//methods
	@Override
	public double[] getSides() {
		
		double[] array = new double[4];
		
		array[0] = length;
		array[1] = length;
		array[2] = width;
		array[3] = width;
		
		return array;
	}
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
}
