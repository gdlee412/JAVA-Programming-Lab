
public class SquarePyramid extends Shape3D {
	// initialize fields
	// edge of square pyramid
	private double edge;
	// height of square pyramid
	private double height;
	// square object
	private Square square = new Square(edge);

	// constructor method
	public SquarePyramid(double edge, double height) {
		this.edge = edge;
		this.height = height;
		square.setEdge(edge);
	}

	// getter and setter methods
	public double getEdge() {
		return edge;
	}

	public void setEdge(double edge) {
		this.edge = edge;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

	// overwrite calculateVolume method
	public double calculateVolume(double edge, double height) {
		// volume of square pyramid = square area * height / 3
		return square.calculateArea(edge) * height / 3;
	}
}
