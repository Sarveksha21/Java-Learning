class Sample		// Multi-class
{
	int a = 20;		// non-static variable
	void test1()	// non-static method
	{
		System.out.println("Inside test1 method");
	}
}
class Combo8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Combo8 c1 = new Combo8();
		c1.m1();
		System.out.println("Stop");

	}
	void m1()
	{
		// Non-static Area
		System.out.println("Inside m1 method");
		Sample s = new Sample();
		System.out.println("Object Creation = "+s.a);
		s.test1();
	}
}
/*
	1) Which Class?   -> Multi class
	2) Which Area?    -> Non-Static Area
	3) Which Members? -> Non-Static Members
	Hence, it can be access by only object creation.
*/