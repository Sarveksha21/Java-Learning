class Combo3				// single-class
{
	float x = 10.5f;		//non-static variable
	void m1()				//non-static method
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		//Static Area
		System.out.println("Start");
		Combo3 c1 = new Combo3();		// object creation
		System.out.println("Value of x = "+c1.x);
		c1.m1();
		System.out.println("Stop");
	}
}

/*
	1) Which Class?   -> Single class
	2) Which Area?	  -> Static Area
	3) Which Members? -> Non-Static Members
	Hence, it can be access by only object creation.
*/