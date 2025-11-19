class A
{
	int x = 10;		// non-static variable
	void m2()		// non-static method
	{
		System.out.println("Inside m1 method");
		B b1 = new B();
		System.out.println(b1.y);
	}
}
class B
{
	float y=20.5f;		// non-static variable
	static void m1()	// static method
	{
		System.out.println("Inside m2 method");
		A a1 = new A();
		System.out.println(a1.x);
	}
}

class NonStaticRefVar5
{
	static B aref;
	A bref;
	public static void main(String[] args)
	{
		System.out.println("Start");
		aref = new B();
		aref.m1();
		NonStaticRefVar5 d = new NonStaticRefVar5();
		d.bref = new A();
		d.bref.m2();
		System.out.println("Stop");
	}
}