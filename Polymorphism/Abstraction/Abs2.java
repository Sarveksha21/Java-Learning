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
class Abs2 
{
	public static void main(String args[])
	{
		Sample s = new Sample();
		s.m1();
	}
}

/*
	- To provide implementation to the abstract method, we will go for child class
	- While implementing child class we need to override abstract method.
	- If the method is not overridden in child classes then child classes will become an abstract class.
*/