class Example4
{	
	void m1(float a)
	{
		System.out.println("Inside float Arg");
	}
	void m1(int a,float b)
	{
		System.out.println("Inside int, float  Arg");
	}
	void m1(int a)
	{
		System.out.println("Inside int Arg");
	}
	public static void main(String[] args)
	{	
		Example4 ref = new Example4();
		ref.m1(10);
		ref.m1(20.6f);
	}
}

// One program can satify One Rule or One program can satisfy multiple overloading rules.