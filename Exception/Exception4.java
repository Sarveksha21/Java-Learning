class Exception4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
					System.out.println("Inside Try Block");	
					System.out.println(10/0);	// new ArithmeticException
		}
		catch (ArithmeticException ae)
		{
					System.out.println("Alternative Solution");	
					System.out.println(10/2);
		}
		System.out.println("Start");
	}
}

/*
	- Exceptions bynature are treated as "classes".
	- Whenever, we use the sentence "ArithematicException ae =  new ArithematicExpression()" exceptions are generated.
	- It internally means, it creates an object & to hold that object in "catch" block we use reference variable.
	- In the try block we always preferred writting the staments, where chances are there, it will raise an exception.
	- In catch block we prefer writing those statements, which will provide an alternative solution.
*/