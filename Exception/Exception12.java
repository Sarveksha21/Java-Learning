class Exception12
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30};
		System.out.println("Start");
		try
		{
					System.out.println("Inside Try Block");	
					System.out.println(10/0);	//ArithmeticException
					System.out.println(a[10]);	//ArrayIndexOutOfBoundsException
		}
		catch (ArithmeticException ae)
		{
					System.out.println("Inside catch block - ArithmeticException");	
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{
					System.out.println("Inside catch block - ArrayIndexOutOfBoundsException");	
		}
		System.out.println("Stop");
	}
}
/*
	As seen in Ex12, based on the no. of exception being generated within "try" block, we use that may no. of "catch" blocks,
	but in real-time a "try-block" can generate only 1 exception at a time, because of this only one catch block will get executed, 
	but due to the remaining "catch" block, the code length will increase & consume more memory due to which will take more time for 
	execution, hence we will follow, the approach mentioned in Ex13
*/