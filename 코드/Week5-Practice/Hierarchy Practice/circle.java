
public class circle extends twoDShapes {
	private static final String CLASS_NAME = "Circle";
	//functions and fields that aren't here are inherited from the super class
	
	public circle(String name, double r) {
		super(name, r, r);
	}
	public double getRadius() {
		return super.getDimension1();
	}
	public void setRadius(double radius) {
		super.setDimension1(radius);
		super.setDimension2(radius);
	}
	public double getDiameter() {
		return super.getDimension1() * 2; 
	}
	public void setDiameter(double diameter) {
		setRadius(diameter/2);
	}
	public static String getClassName() {
		return CLASS_NAME;
	}
	public double getArea() {
		return Math.PI * super.getDimension1() * super.getDimension2();
	}
	
	public String toString() {
		return CLASS_NAME + "'s area is " +
				this.getArea() +", radius is " +
				this.getRadius();
	}
	
}
