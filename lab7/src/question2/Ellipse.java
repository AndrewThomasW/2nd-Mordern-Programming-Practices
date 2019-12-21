package question2;

public class Ellipse implements ClosedCurve {

	// fields
	private double a;
	private double e;

	// constructor
	public Ellipse(double a, double e) {
		this.a = a;
		this.e = e;
	}
		@Override
	public double computePerimeter() {
		/*
		 * The perimeter (or circumference) of an ellipse is 4aE where a is the length
		 * of the semi-major axis and E is the value of the elliptic integral evaluated
		 * at the ellipse’s eccentricity
		 */

		return 4 * a * e;
	}
}
