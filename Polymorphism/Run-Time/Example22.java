/*
class Sample
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Demo extends Sample
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Example22
{
	public static void main(String[] args)
	{
		Sample s = new Demo();
		s.m1();
	}
}
*/

// Under the concept of Overriding, it is not possible to perform upcasting
class Sample
{
	void m1()
	{
		System.out.println("Inside m1 method- Sample");
	}
}
class Demo extends Sample
{
	/* void m1()
	{
		System.out.println("Inside m1 method- Demo");
	}*/
}
class Example22
{
	public static void main(String[] args)
	{
		// Upcasting
		Sample s = new Demo();	// under the concept overriding, we always prefer to use upcasted statement
		s.m1();
	}
}

// Non-Static Method
// Under concept of overriding, if child method is present then upcasting will not work & child method will get display
// but, if child method id not present then upcasting will work and parent method will get display