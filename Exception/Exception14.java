class Exception14
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
		System.out.println("Stop");
	}
}
/*
	Once the control goes out of "try" block to the catch block, the control will never back to the "try" hence, 
	it is never recommended to use statements after the exception statement.
*/