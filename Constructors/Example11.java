class Example11
{
	Example11()
	{
		System.out.println("Inside 0 Arg Const");
		this(10);
	}
	Example11(int a)
	{
		System.out.println("Inside 1 Arg Const");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example11 ref = new Example11();
		System.out.println("Stop");
	}
}

// "this()" statement should always be first statement inside any constructor.
// This program will through an error, it will not get executed.