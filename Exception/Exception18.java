class Exception18
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int[] a= {10,20,30};
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);	
			System.out.println("After Try - Exception Block");
		}
		catch(Exception e)
		{
			System.out.println("Inside catch Block = "+e);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside Catch Block = "+ae);
		}
		System.out.println("Stop");
	}
}

// We can have multiple 'catch' blocks, but the order of this catch blocks, should not be from 'parent' to 'child'.