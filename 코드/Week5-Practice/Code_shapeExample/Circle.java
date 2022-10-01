package shapeExample;

public class Circle extends TwoDimensionalShape
    {   static final String CLASS_NAME = "Circle";
	public Circle(String Name, double radius) {
	    super(Name, radius, radius);
	}

	public double getRadius() {
	    return super.getDimension1();

	}
	public void setRadius(double radius) {
	     super.setDimension1(radius);
	     super.setDimension2(radius);

	}
	
	public void setDiameter(double diameter) {
	    setRadius(diameter/2);

	}
	
	public double getDiameter() {
	    return getRadius()*2;

	}
	
	 
	public static String getClassName() {
	    return CLASS_NAME;
	}
	
	@Override
	public double getArea() {
	    //double area = Math.PI*super.getDimension1()*super.getDimension1();
	    double area = Math.PI*Math.pow(super.getDimension1(), 2);
	    return area;
	}

	@Override
	public String toString() {
	    return "Circle [Radius()=" + getRadius() + "]";
	}
	
	
	
    }
