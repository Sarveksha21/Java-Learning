class Combo5			// single class
{
	static int a = 100;	// static variable
	static void m1()	// static method
	{
		System.out.println("Inside m1 method");
	}
	void test1()		 
	{
		//  Non-Static Area
		System.out.println("Inside test1 method");
		System.out.println("Value of a direct access = "+a);	// Direct Access
		m1();
		System.out.println("Value of a classname access = "+Combo5.a);	// Accessing using classname
		Combo5.m1();
		Combo5 c1 = new Combo5();
		System.out.println("Value of a object access = "+c1.a);		// Object access
		c1.m1();
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Combo5 c1 = new Combo5();
		c1.test1();
		System.out.println("Stop");
	}
}
/*
	1) Which Class?   -> Single class
	2) Which Area?    -> Non-Static Area
	3) Which Members? -> Static Members
	Hence, it can be access three ways i.e. directly, classname and object creation.
*/