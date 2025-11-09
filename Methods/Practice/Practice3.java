class Sample				// Multi-class
{
	static float x = 10.5f; // static variable		
	static void m1()		// static method
	{
		System.out.println("Inside m1 method");
		System.out.println(x);
	}
}
class Demo					// Multi-class
{
	static int y = 20;		// static variable
	static void m2()		// static method
	{
		System.out.println("Inside m2 method");
		System.out.println(y);
	}
}
class Practice3
{
	public static void main(String[] args)		// static area
	{
		Sample.m1();				// classname 
		Demo.m2();					// classname
		
		Sample s = new Sample();	// object creation
		s.m1();
		Demo d = new Demo();		// object creation
		d.m2();
	}
}