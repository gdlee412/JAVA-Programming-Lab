
public class ball {

	String color;
	float size;
	String shape;
	
	//Constructor - to change the default parameters of declared variables
	public ball() {
		color = "white";
		size = 0;
		shape = "None";
	}
	
	//Constructor with same name - can make constructor with same name as long as parameters are different
	public ball(String a, float b, String c) {
		color = a;
		size = b;
		shape = c;
	}
	
	void Set_Ball_Color(String BallColor) {
		color = BallColor;
	}
	void Set_Ball_Size(float BallSize) {
		size = BallSize;
	}
	void Set_Ball_Shape(String BallShape) {
		shape = BallShape;
	}
}
