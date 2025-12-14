class A
{
	int a=10;
	void m1()
	{
		System.out.println("Inside Class A - m1(): "+a);
	}
}
class B extends A
{
	float b=20.5f;
	void m2()
	{
		System.out.println("Inside Class B - m2(): "+b);
	}
}
class C extends B
{
	char c='x';
	void m3()
	{
		System.out.println("Inside Class C - m3(): "+c);
	}	
}
class Sample
{
	static void test(A aa)
	{
		aa.m1();		// In upcasting, it only remember parent
		//aa.m2();		// In upcasting, it only remember parent it doesn't remember child; that's why it throws an error
	}
}
class Example21
{
	public static void main(String[] args)
	{
		//A a1 = new C();
		//Sample.test(a1);
		
		Sample.test(new C());

	}
}