package prob3.composition;

public class Cylinder {
	// fields
	private double height;
	public double volume;
	public Circle circle;

	// constructors
	public Cylinder() {
		circle = new Circle();
		this.height = 1.0;
		volume = circle.getArea() * height;
	}

	public Cylinder(double radius) {
		circle = new Circle(radius);
		this.height = 1.0;
		volume = circle.getArea() * height;
	}
	
	public Cylinder(double radius,double height) {
		circle = new Circle(radius);
		this.height = height;
		volume = circle.getArea() * height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		
		/*
		 Since volume is not defined,
		 volume calculation is done in the constructor
		 */
		return volume;
		
		//return super.getArea() * height;
	}
}
