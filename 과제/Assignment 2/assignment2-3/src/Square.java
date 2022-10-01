
public class Square extends Shape2D {
	// initialize fields
	// edge of square
	private double edge;

	// constructor, given edge
	public Square(double edge) {
		this.edge = edge;
	}

	// getter and setter methods
	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	// overwrite calculateArea method
	public double calculateArea(double edge) {
		// area of square = edge * edge
		return edge * edge;
	}

}
