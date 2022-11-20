
public class TestBoxing {

	public static void main(String[] args) {
		float f = 125.3f;

		// boxing
		Float fObject = new Float(f);

		int i = 23;
		// auto-boxing: automatically converts primitive type to an object
		Integer iObject = i;

		// auto-unboxing: automatically converts an object to a value with corresponding
		// primitive type
		int j = iObject;

		System.out.println(j);

	}

}
