abstract class Demo
{
	abstract void m1();
	void m2()
	{
		System.out.println("Inside m2 method - Demo");
	}
}
class Sample extends Demo
{
	void m1()
	{
		System.out.println("Inside m1 method - Sample");
	}
}
class Abs4
{
	public static void main(String[] args)
	{
		Demo d = new Sample();
		d.m1();
		d.m2();
	}
}

// Within an abstract class, we not only can create incomplete method but also can create complete method. 