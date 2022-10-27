//use import instead of #include
public class examples 
{
	//if main is static, methods must be static as well (method is the equivalent of function for Java)
	static void RunMethod(int a, int b)
	{
		System.out.println("Executed RunMethod..");
		System.out.println("Finished RunMethod..");
	}
	
	void NotStaticRun(int a, int b)
	{
		System.out.println("Executed without static..");
		System.out.println("Finished without static..");
	}
	
	//Method Overloading: having the same method name is possible as long as the parameters are different
	void NotStaticRun(int a, float b)
	{
		System.out.println("This is version 2 without static..");
		System.out.println("Finished this version without static..");
	}
	
	//a method can have infinite variable parameters of the same type using ...
	void VariableOverflow(int... a)
	{
		//looping through all the elements of the parameter
		for(int i: a)
		{
			System.out.println("Overflow " + i);
		}
	}
 
	public static void main(String[] args) 
	{
		int variable1 = 10;
		double variable2 = 2.5;
		float variable3 = 2.4f;
		long variable4 = 2l;
		boolean variable5 = true;
		String string1 = "Hello, welcome to ";
		String string2 = "Java programming";
		String string3 = string1 + string2;
		//println will add a new line after printing
		System.out.println(variable1 + "  " + variable2 + "  " + variable3);
		System.out.println(variable4 + "  " + variable5 + "  " + string3);
		
		RunMethod(variable1, 20);
		
		//running methods that arent static
		examples object = new examples();
		object.NotStaticRun(variable1, 20);
		object.NotStaticRun(variable1, variable3);
		object.VariableOverflow(variable1, variable1, variable1, variable1, variable1);
		
		int array1[] = new int [10];
		int array2[][] = new int[10][5];
		int array3[][] = {{1,2,3,4},{5,6,7,8}}; // = new int[2][4]
		int array4[][] = {{0},{1,2}}; // jagged arrays exist in java (array4[0][1] doesnt exist)
		//arrays in Java automatically initialize as zero
		array1[1] = 12345;
		System.out.println(array1[0] + "  " + array1[1]);
		System.out.println(array3[0][2] + "  " + array2[5][3]);
		System.out.println(array4[0][0]);
		
	}

}
