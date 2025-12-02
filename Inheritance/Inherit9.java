class Demo
{
	static int a=100;
	static void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Sample extends Demo
{
}
class Inherit9
{
	public static void main(String[] args)
	{
		System.out.println(Sample.a);
		Sample.m1();
	}
}

// Both static & non-static members are part of Inheritance.