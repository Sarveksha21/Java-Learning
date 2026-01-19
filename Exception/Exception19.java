class Exception19
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int[] a = {10,20,30};
		try
		{
			System.out.println("Inside Outer - Try Block");
			try
			{
				System.out.println("Inside Inner - Try Block");
				System.out.println(10/2);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Inside Inner - Catch Block");
			}
			System.out.println(a[20]);
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside Outer - Try Block");
			try
			{
				System.out.println("Inside Inner - Try Block");
				System.out.println(10/2);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Inside Inner - Catch Block");
			}
			System.out.println(a[20]);
		}
		System.out.println("Stop");
	}
}