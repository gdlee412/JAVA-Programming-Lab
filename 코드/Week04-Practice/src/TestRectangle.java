
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle);
		
		Rectangle rectangle1 = new Rectangle(5, 10);
		System.out.println(rectangle1);
		
		Rectangle rectangleArray[] = new Rectangle[5];
		
		for(int i = 0; i < rectangleArray.length; i++) {
			rectangleArray[i] = new Rectangle(i, i);
			System.out.println(rectangleArray[i]);
		}
		
	}

}
