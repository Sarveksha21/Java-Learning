class Sample		// Multi-Class
{
	static char z='a';		// static variable
	static void test1()		// static method
	{
		System.out.println("Inside test1 method");
	}
	
}
class Combo6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Combo6 ref = new Combo6();
		ref.m1();
		System.out.println("Stop");
	}
	void m1()
	{
		// Non-Static Area
		System.out.println("Inside m1 method");
		System.out.println("Classname access = "+Sample.z);
		Sample.test1();
		Sample s1 = new Sample();
		System.out.println("Object access = "+s1.z);
		s1.test1();
	}
}
/*
	1) Which Class?   -> Multi class
	2) Which Area?    -> Non-Static Area
	3) Which Members? -> Static Members
	Hence, it can be access two ways i.e. classname and object creation.
*/