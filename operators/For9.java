class For9
{
	public static void main(String[] args)
	{
		for(; ;)
		{
			System.out.println("Inside for");
		}
	}
}

/*
	for(; ;) is a valid infinite loop in Java (same as while(true)).
	Since there is no initialization, condition, or increment part, the loop will never terminate.
	It will go on infinitely until you manually stop the program (e.g., pressing Ctrl+C in terminal or stopping execution in IDE).
*/