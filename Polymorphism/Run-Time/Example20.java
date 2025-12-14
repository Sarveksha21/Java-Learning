class A
{
	int a=10;
	void m1() { System.out.println("Inside Class A - m1() "+a);}
}
class B extends A
{
	float b=20.5f;
	void m2() { System.out.println("Inside Class B - m2() "+b);}
}
class C extends B
{
	char c='x';
	void m3() { System.out.println("Inside Class C - m3() "+c);}
}
class Example20
{
	public static void main(String[] args)
	{
		//Upcasting
		B b1 = new C();
		b1.m1(); b1.m2(); //b1.m3();
		System.out.println("-----------");
		A a1 = (A)b1;
		a1.m1();	//a1.m2();
		System.out.println("-----------");
		
		//DownCasting
		C c1 = (C)a1;
		c1.m1(); c1.m2(); c1.m3();
	}
}	