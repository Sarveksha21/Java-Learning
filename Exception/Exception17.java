class Exception17
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
		catch(ArithmeticException ae)		// child catch block
		{
			System.out.println("Inside Catch Block = "+ae);
		}
		catch(Exception e)					// parent catch block
		{
			System.out.println("Inside catch Block = "+e);
		}
		System.out.println("Stop");
	}
}

// We can create multiple 'catch' blocks, but the order of this catch blocks, should be from 'child' to 'parent'.
