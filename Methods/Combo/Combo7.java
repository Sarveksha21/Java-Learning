class Combo7		// Single class
{	
	int a = 10;		// non-static variable
	void test1()	// non-static method
	{
		System.out.println("Inside test1 method");
	}
	void m1()
	{	// Non-static Area
		System.out.println("Inside m1 method");
		System.out.println("Direct Access = "+a);
		test1();
		Combo7 c1 = new Combo7();
		System.out.println("Object access = "+c1.a);
		c1.test1();
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Combo7 c1 = new Combo7();
		c1.m1();
		System.out.println("Stop");
	}
}
/*
	1) Which Class?   -> Single class
	2) Which Area?    -> Non-Static Area
	3) Which Members? -> Non-Static Members
	Hence, it can be access two ways i.e. directly and object creation.
*/