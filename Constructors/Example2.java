class Example2
{
	Example2()
	{
		System.out.println("Inside Constructor Example2");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example2 ref1 = new Example2();
		Example2 ref2 = new Example2();
		Example2 ref3 = new Example2();
		System.out.println("Stop");
	}
}

// based on number of times we create an object that number of times constructors will get executed.

