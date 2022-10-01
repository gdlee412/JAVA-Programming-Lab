
public class square extends rectangle {
	private static final String CLASS_NAME = "Square";
	
	public square(String name, double side) {
		super(name, side, side);
	}

	public static String getClassName() {
		return CLASS_NAME;
	}
	public double getSide() {
		return super.getHeight();
	}
	public void setSide(double side) {
		super.setHeight(side);
		super.getWidth();
	}
	public double getArea() {
		return super.getArea();
	}
}
