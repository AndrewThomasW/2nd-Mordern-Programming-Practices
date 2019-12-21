package prob3.composition;

public class Main {
	public static void main(String[] args) {
		Cylinder cyl = new Cylinder(3,3);
		System.out.println(cyl.getVolume());
		
		
		Circle c = new Circle();
		System.out.println(c.toString());
	}
}
