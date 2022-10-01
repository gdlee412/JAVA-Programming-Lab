package shapeExample;

public class Square extends Rectangle
    {   static final String CLASS_NAME = "Square";
	public Square(String Name, double side) {
	    super(Name, side, side);
	}
	
	public static String getClassName() {
	    return CLASS_NAME;
	    
	}
	public void setSide(double side) {
	    super.setSize(side, side);
	    
	}
	
	public double getSide() {
	    return super.getDimension1();
	    
	}
	@Override
	public double getArea() {
	    //double area = super.getWidth() * super.getHeight();
	    //double area = super.getDimension1() * super.getDimension2();
	    
	    //double area = Math.pow(super.getDimension1(), 2);
	    double area = super.getArea();
	    return area;
	}

	@Override
	public String toString() {
	    return "Square [Side()=" + getSide() + "]";
	}
	
	
	
    }
