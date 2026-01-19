class Exception20
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int[] a = {10,20,30};
		try
		{
			System.out.println("Inside Outer - Try Block");
			System.out.println(a[20]);
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Inside Catch Block "+ai);
			try
			{
				System.out.println("Inside Inner - Inner Try Block");
				System.out.println(10/0);
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Inside Inner - Inner Catch Block");
			}
		}
		System.out.println("Stop");
	}
}
