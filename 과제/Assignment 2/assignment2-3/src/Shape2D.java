
public class Shape2D {
	// initialize fields
	// area of shape
	private double Area;

	// no specific constructor since this class only has the area
	// the specified constructors would be defined in the subclasses

	// getter and setter method for area
	public double getArea() {
		return Area;
	}

	public void getArea(double Area) {
		this.Area = Area;
	}

	// to calculate area
	public double calculateArea() {
		return 0;
	}
}
