class Example16
{	
	Example16(int a, float b)
	{
		System.out.println("Inside 2 Argument Constructor");
	}
	Example16(int a)
	{
		System.out.println("Inside 1 Argument Constructor");
	}
	Example16()
	{
		this(10);
		this(10,20.5f);		// this will throw an error
		System.out.println("Inside 1 Argument Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example16 ref = new Example16();
		System.out.println("Stop");
	}
}

// we can't use more than 1 "this()" statement within a constructor