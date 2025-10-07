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

// Statements are not allowed within condition