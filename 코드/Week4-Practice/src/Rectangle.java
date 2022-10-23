
public class Rectangle {

	float height;
	float width;
	
	public Rectangle() {
		height = 1;
		width = 1;
		System.out.println("Rectangle created.");
		System.out.println("Height = " + height + " Width = " + width);
	}
	
	public Rectangle(float height, float width) {
		setHeight(height);
		setWidth(width);
	}
	
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		if(height >= 0 && height <= 20) {
		this.height = height;
		}
		else {
			System.out.println("Error, you cannot assign height ouside the range of 0 and 20.");
		}
		
	}
	
	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		if(width >= 0 && width <= 20) {
			this.width = width;
			}
			else {
				System.out.println("Error, you cannot assign width ouside the range of 0 and 20.");
			}
	}
	
	public float calculatePerimeter(float height, float width) {
		return (height + width) * 2;
	}
	
	public float calculateArea(float height, float width) {
		return height * width;
	}
	
	public String toString() {
		String info = "Height: " + this.height + "\n"
				+ "Width: " + this.width + "\n"
				+ "Perimeter: " + calculatePerimeter(this.height, this.width) + "\n"
				+ "Area: " + calculateArea(this.height, this.width) + "\n";
		return info;
	}

}
