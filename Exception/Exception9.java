class Exception9
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
		System.out.println("After Try & Before Catch");	
		catch (ArrayIndexOutOfBoundsException ai)
		{
					System.out.println("Alternative Solution");	
					System.out.println(a[2]);
		}
		System.out.println("Stop");
	}
}

/*
	We cann't write statments after "try" & "catch" block, else it will throw an error.
*/