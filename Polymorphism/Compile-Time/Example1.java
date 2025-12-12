class Example1
{	
	void m1()
	{
		System.out.println("Inside 0 Arg");
	}
	void m1(int a)
	{
		System.out.println("Inside 1 Arg");
	}
	public static void main(String[] args)
	{	
		Example1 ref = new Example1();
		ref.m1(10);
	}
}

/*
	Method Overloading:
	Rule1: Methodname should remain the same, but should vary in the number of arguments.
*/