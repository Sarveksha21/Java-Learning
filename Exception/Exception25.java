class Exception25
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		finally			
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Stop");
	}
}

/*
	We can use "try" & "finally" blocks, but incase an exception is raised within the "try" block,
	it cann't be handled by "finally" block, it will lead to abnormal termination.
*/