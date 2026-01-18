class Exception11
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30};
		System.out.println("Start");
		try
		{
					System.out.println("Inside Try Block");	
					System.out.println(10/0);	//ArithmeticException
					System.out.println(a[10]);	//ArrayIndexOutOfBoundsException
		}
		catch (ArithmeticException ae)
		{
					System.out.println("Alternative Solution");	
		}
		System.out.println("Stop");
	}
}

/*
	A "try" block can generate any type of exception but at any point of time, it can generate only, one exception.
*/