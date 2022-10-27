package shapeExample;

public class Rectangle extends TwoDimensionalShape
    {   static final String CLASS_NAME = "Rectangle";
	public Rectangle(String Name, double width, double height) {
	 super(Name, width, height);
	}

	public double getWidth() {
	    return super.getDimension1();

	}
	public double getHeight() {
	    return super.getDimension2();

	}
	
	
	public static String getClassName() {
	    return CLASS_NAME;
	}
	
	public void setSize(double width, double height) {
	    super.setDimension1(width);
	    super.setDimension2(height);
	    
	}

	@Override
	public double getArea() {
	    double area = super.getDimension1()*super.getDimension2();
	    return area;
	}

	@Override
	public String toString() {
	    return "Rectangle [Width()=" + getWidth() + ", Height()=" + getHeight() + "]";
	}
	
	
	
	
    }
