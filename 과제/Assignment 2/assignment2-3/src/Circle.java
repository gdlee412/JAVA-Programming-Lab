
public class Circle extends Shape2D {
	// initializing fields
	// radius of circle
	private double radius;

	// constructor, given radius
	public Circle(double radius) {
		this.radius = radius;
	}

	// getter and setter methods
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	// overwrite calculateArea method
	public double calculateArea(double radius) {
		// area of circle = PI * radius * radius
		return Math.PI * radius * radius;
	}

}
