// Here, we want to access non-static members from class "Demo" & "Sample" with the help of reference type declared in "Tech" class
class Demo
{
	int a = 100;		// non-static variable
}
class Sample
{
	void m1()			// non-static method
	{
		System.out.println("Inside m1 method");
	}
}
class Tech
{
	Demo ref1;			// non-static non-primitive reference variable
	Sample ref2;		// non-static non-primitive reference variable
}
class NonStaticRefVar4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Tech t = new Tech();		// object creation
		t.ref1 = new Demo();		// accessing non-static variable from one class in static area of another class
		t.ref2 = new Sample();		// accessing non-static variable from one class in static area of another class
		System.out.println("Value of a from Demo Class= "+(t.ref1.a));
		System.out.print("Value of m1() from Sample Class=> ");
		t.ref2.m1();
		System.out.println("Stop");
	}
}