
public class Cone extends Shape3D {
	// initialize field
	// radius of cone
	private double radius;
	// height of cone
	private double height;
	// circle object
	private Circle circle = new Circle(radius);

	// constructor
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
		circle.setRadius(radius);
	}

	// getter and setter methods
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Circle getCircle() {
		return circle;
	}

	public void setCircle(Circle circle) {
		this.circle = circle;
	}

	// overwrite calculateVolume method
	public double calculateVolume(double radius, double height) {
		// volume of cone = circle area * height / 3
		return circle.calculateArea(radius) * height / 3;
	}

}
