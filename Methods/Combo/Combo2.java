class Sample				// multi-class
{
	static int a = 100;		// static variable
	static void m1()		// static method
	{
		System.out.println("Inside m1 method");
	}
}
class Combo2
{
	public static void main(String[] args)		
	{
		// Static Area
		System.out.println("Start");
		System.out.println("Value of x = "+Sample.a);	// access through using classname 
		Sample.m1();									// access through using classname 
		
		Sample s = new Sample();						// Object creation
		System.out.println("Value of x = "+s.a);
		s.m1();
		
		System.out.println("Stop");	
	}
}

/*
	1) Which Class?   -> Multi class
	2) Which Area?	  -> Static Area
	3) Which Members? -> Static Members
	Hence, it can be access two ways i.e. classname and object creation.
*/