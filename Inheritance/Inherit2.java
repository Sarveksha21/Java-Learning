class Demo
{
	int a=10;
	void m1()
	{
		System.out.println("Inside m1 method, value of a = "+a);
	}
}
class Sample extends Demo
{
	float b=20.5f;
	void m2()
	{
		System.out.println("Inside m2 method, value of b = "+b);
	}
}
class Inherit2
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		d.m1();
		System.out.println("---------");
		Sample s = new Sample();
		s.m2();
		s.m1();
	}
}