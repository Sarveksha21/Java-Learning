class StaticMethod7
{
	public static void main(string[] args)
	{
		System.out.println("Start");
		int l=10, b=20;
		test(l,b);
		System.out.println("Stop");
	}
	static void test(int l, int b)
	{
		System.out.println("Inside test method");
		int result = l*b;
		System.out.println("Result = "+result);
	}
}

// We can't only pass one argument in a method, but we can also pass multiple argument.