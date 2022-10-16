//super class
public class TwoDShape {
	protected String Name;
	private String Color;
	private double dim1;
	private double dim2;
	public TwoDShape(String name, String color, double dim1, double dim2) {
		Name = name;
		Color = color;
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getDim1() {
		return dim1;
	}
	public void setDim1(double dim1) {
		this.dim1 = dim1;
	}
	public double getDim2() {
		return dim2;
	}
	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}
	public String getColor() {
		return Color;
	}
	public String toString() {
		return "base class to string";
	}
}
 

//sub class circle which extends superclass TwoDShape
class Circle extends TwoDShape{
	public Circle(String name, String color, double rad) {
		super(name, color, rad, rad);	//call constructor of parent class
	}
	public double getArea()
	{
		//both works
		return Math.PI * super.getDim1() * getDim1();
	}
	public String toString() {
		//super.method -> call a method from super class
		return "subclass to string calling " + super.toString(); 
	}
}

//only used in this specific package
//since all the classes are in one file, we can run by using
// Run -> Run Configuration then locate the main method
	class TestShape{
		public static void main(String[] args) {
			Circle object = new Circle("Circle", "Red", 5);
			System.out.println(object.getName());
			System.out.println(object.getColor());
			System.out.println(object.getArea());
			//private has a problem but protected has a problem
			//protected is not recommended for the fields, it is recommends for classes and methods
			object.Name = "New Circle";
			
			System.out.println(object.getName());
			System.out.println(object.getColor());
			System.out.println(object.getArea());
			System.out.println(object);
		}
	}