class Example12
{
	Example12()
	{
		this(10);			// here, recursive constructor calling is happening
		System.out.println("Inside 0 Arg Const");
	}
	Example12(int a)
	{
		this();
		System.out.println("Inside 1 Arg Const");
	}
		
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example12 ref = new Example12(100);
		System.out.println("Stop");
	}
}

// Recursive Constructor calls are not supported by java programming language