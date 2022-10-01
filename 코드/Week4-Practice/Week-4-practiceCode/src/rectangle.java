
public class rectangle
{
	private double height;
	private double width;

	public rectangle() {
		height = 0.0;
		width = 0.0;

	}

	public rectangle(double height, double width) {
		// this.height = height;
		setHeight(height);
		// this.width = width;
		setWidth(width);
		System.out.println("Rectangle created");
		System.out.println("Hight ="+getHeight()+ " Width =" + getWidth());

		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height >= 0.0 && height <= 20) {
			this.height = height;
		}
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		if (width >= 0.0 && width <= 20) {
			this.width = width;
		}
	}

	public double area() {
		// double areaCalc = getHeight() * getWidth();
		// double areaCalc = height * width;
		return getHeight() * getWidth();
	}

	public double perimeter() {
		// double perimeterCalc= 2 * (getHeight()+getWidth());
		//double perimeterCalc = 2 * (height + width);
		return 2 * (height + width);
	}
	
	@Override
	public String toString() {
		String info = "The rectangle height = "+ this.getHeight()+"\n"+
				" width = " + this.getWidth()+"\n"+
				" area = " + this.area()+"\n"+
				"perimeter = "+ this.perimeter()+"\n";
		return info;
	}

}
