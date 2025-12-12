class Example3
{	
	void m1(int x,float y)
	{
		System.out.println("Inside int, float Arg");
	}
	void m1(float y, int x)
	{
		System.out.println("Inside float, int Arg");
	}
	public static void main(String[] args)
	{	
		Example3 ref = new Example3();
		ref.m1(10.54f,15);
	}
}

/*
	Method Overloading:
	Rule3: Methodname should remain the same, can have same number of arguments, also can have same type of the argument, 
	       but should vary in the sequence of the argument
*/