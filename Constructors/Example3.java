class Example3
{
	Example3()			// First constructor
	{
		System.out.println("Inside Constructor1");
	}
	Example3(int a)		// Second Constructor
	{
		System.out.println("Inside Constructor2");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example3 ref1 = new Example3();
		Example3 ref2 = new Example3(100);
		System.out.println("Stop");
	}
}

// We can't only create one constructor but we can also create multiple constructor during java program 
