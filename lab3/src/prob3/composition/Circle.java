package prob3.composition;

public class Circle {
	// fields
	private double radius;
	private String color;
	private double area;

	// constructors

	public Circle() {
		this.radius = 1.0;
		this.color = "red";
		this.area = Math.PI * Math.pow(radius,2);
	}

	public Circle(double radius) {
		this.radius = radius;
		this.color = "red";
		this.area = Math.PI * Math.pow(radius,2);
	}
	
	//methods
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		
		/*
		 * As area is not defined,
		 * for performance reasons,
		 * area is calculated in the constructor 
		 */
		return area;
		
		
		//return Math.PI * Math.pow(radius,2);
	}

	@Override
	public String toString() {
		
		return "Circle [radius=" + radius + ", color=" + color +  ", Area=" + area +  "]";
		//return "Circle [radius=" + radius + ", color=" + color +  ", Area=" + getArea() +  "]";
	}
	

}
