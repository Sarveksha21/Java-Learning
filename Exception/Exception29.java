class Exception29
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(10/0);
		try
		{
			System.out.println("Inside Try Block");
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