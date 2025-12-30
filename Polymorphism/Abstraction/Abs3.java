abstract class Demo
{
	abstract void m1();
}
class Sample extends Demo
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Abs3
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.m1();
		Demo d = new Demo();
	}
}

/*
	Q. Why we cann't create object of abstract class (parent class)?
	- If we are able to create the object of the abstract class there will be of no use because we cann't call incomplete methods.
	- We may not able to create an object of abstract class but the abstract class will have the ability to hold the address of Child class.
*/