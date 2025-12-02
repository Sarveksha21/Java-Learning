class A
{
	void m1()
	{
		System.out.println("Inside m1 method - A");
	}
}
class B extends A
{
	void m2()
	{
		System.out.println("Inside m2 method - B");
	}
}
class C extends A
{
	void m3()
	{
		System.out.println("Inside m3 method - C");
	}
}
class D extends B
{
	// m1(); // m2();
}
class E extends C
{
	// m3(); // m4();
}
class Inherit6
{
	public static void main(String[] args)
	{
		D d1 = new D();
		d1.m1();
		d1.m2();
		System.out.println("----------------------");
		E e1 = new E();
		e1.m1();
		e1.m3();
	}
}

/*
	- A combination of two or more inheritance is called as Hybrid Inheritance is called as Hybrid Inheritance.
	- A seen above, the above combunation takes a shape of a diamond.
	- Hence, it is called as Diamond problem.
	- Hybrid Inheritance are partionally supported.
*/