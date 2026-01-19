class Exception23
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a[] = {10,20,30};
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		catch(Exception ai)
		{
			System.out.println("Inside Catch Block");
			System.out.println(a[10]);
		}
		finally			
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Stop");
	}
}

/*
	Before JVM shuts down:
	- Under Normal Condition: Ex21, Ex22
	- Under Abnormal Condition: Ex23
*/
