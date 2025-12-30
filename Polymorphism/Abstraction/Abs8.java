abstract class Demo
{
	abstract void m1();
	abstract void m2();
}
abstract class Sample extends Demo
{
	void m1()
	{
		System.out.println("Inside m1 method - Sample");
	}
}
class Lenovo extends Sample
{
	void m2()
	{
		System.out.println("Inside m2 method - Lenovo");
	}
}
class Abs8
{
	public static void main(String[] args)
	{
		Lenovo ref = new Lenovo();
		ref.m1();
		ref.m2();
	}
}

/*
	It is not mandantory for normal class to inherit from abstract class, 
	but an abstract class can also be inherit from abstract class can also inherit from another abstract class.
*/