// Parent/Super/Base
final class Demo
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
//Child/Sub/Derived
class Sample extends Demo
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Inherit8
{
	public static void main(String[] args)
	{
		Sample s = new Sample();
		s.m1();
		s.m2();
	}
}

/* 
	Interview Question: How can we avoid Inheritance?
	- By making the parent class as "final", we can avoid Inheritance.
*/
	