class Exception8
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
		catch (ArithmeticException ai)
		{
					System.out.println("Alternative Solution");	
					System.out.println(a[2]);
		}
		System.out.println("Stop");
	}
}
/*
	- If an exception is raised, then it doesn't matter, what is written within the block.
	- But if does matter, what is written inside the "catch" block only when the exception is raised.
	
*/