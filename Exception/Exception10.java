class Exception10
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30};
		System.out.println("Start");
		try
		{
					System.out.println("Inside Try Block");	
					System.out.println(a[10]);	//20
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{
					System.out.println("Alternative Solution");	
					System.out.println(10/0);
		}
		System.out.println("Stop");
	}
}

/*
	IF an exception is raised within "try" block it will be handle by "catch" block but if an exception is raised
	within catch block, it will lead to abnormal termination.
*/