class StaticMethod4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
	static void m1()
	{
		return;
		System.out.println("Inside m1 method");
	}
}

// we should always write return statement at the end of the method.
