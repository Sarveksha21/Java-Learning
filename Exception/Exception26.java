class Exception26
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		catch(ArithematicException ae)
		{
			System.out.println("Inside Catch Block");
		}
		finally			
		{
			System.out.println("Inside finally Block");
			System.out.println(10/0);
		}
		System.out.println("Stop");
	}
}

/*
		If an exception is raised within a "try" block, it will be handled by the "catch" block,
		but if the exception is raised in the "finally" block, it will lead to "abnormal termination".
*/