package prob3.inheritance;

public class Cylinder extends Circle {
	// fields
	private double height;
	public double volume;

	// constructors
	public Cylinder() {
		super();
		this.height = 1.0;
		volume = super.getArea() * height;
	}

	public Cylinder(double radius) {
		super(radius);
		this.height = 1.0;
		volume = super.getArea() * height;
	}
	
	public Cylinder(double radius,double height) {
		super(radius);
		this.height = height;
		volume = super.getArea() * height;
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
