class Exception24
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside Try Block");
		}
		finally			
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Stop");
	}
}

// It is not mandantory, we have to use "try" with "catch", we can also use "try" with "finally" block.