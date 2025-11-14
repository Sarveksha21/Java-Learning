class Combo1					// single class
{
	static float x = 10.5f;		// static variable
	static void m1()			// static method
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		// Static Area
		System.out.println("Start");
		System.out.println("Value of x accessing directly = "+x);		// Direct Access
		m1();															// Direct Access
		
		System.out.println("Value of x using Classname = "+Combo1.x);	// Access through Classname 
		Combo1.m1();													// Access through Classname
		
		Combo1 c = new Combo1();										// Object creation
		System.out.println("Value of x by creating an object = "+c.x);	// Object through access
		c.m1();
		
		System.out.println("Stop");
	}
}
		
/*
	1) Which Class?   -> Single class
	2) Which Area?    -> Static Area
	3) Which Members? -> Static Members
	Hence, it can be access three ways i.e. directly, classname and object creation.
*/