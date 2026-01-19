class Exception28
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside Catch Block");
			System.exit(0);
		}
		finally			
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Stop");
	}
}

/*
	System Class: public static void main(int status)
	
	- If an exception is raised within a "try" block only then, the "finally" block will get executed
	but if an exception is raised outside the "try" block then finally block will not get executed.
	
*/