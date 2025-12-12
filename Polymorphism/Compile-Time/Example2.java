class Example2
{	
	void m1(int x)
	{
		System.out.println("Inside 0 Arg");
	}
	void m1(float y)
	{
		System.out.println("Inside 1 Arg");
	}
	public static void main(String[] args)
	{	
		Example2 ref = new Example2();
		ref.m1(10.56f);
	}
}

/*
	Method Overloading:
	Rule2: Methodname should remain the same, can have same number of arguments, but should vary in the type of the argument.
*/