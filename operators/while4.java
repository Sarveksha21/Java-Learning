class while4
{
	public static void main (String[] args)
	{
		int i=1;
		while(System.out.print("Hello World!"))	// this error will display: "void cannot be converted to boolean"
		{
			System.out.println("Value of i = "+i);
			i++;
		}
	}
}

/*
	-In the while loop, if we do not set any condition, then complier will not set any condition
	-This means, the while condition is mandatory.
	-Statements are not allowed within condition
*/