class Exception27
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
		}
		finally			
		{
			System.out.println("Inside finally Block");
			try
			{
				System.out.println("Inside finally - Try Block");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Inside fianlly - Catch Block");
			}
		}
		System.out.println("Stop");
	}
}

// It is possible to create "try-catch" block within "finally" block.
