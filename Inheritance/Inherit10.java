class Demo
{
	int x=10;
}
class Sample extends Demo
{
	int x=20;
	void m1(int x)
	{
		System.out.println("Inside m1 method");
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
}
class Inherit10
{
	public static void main(String[] args)
	{	
		Sample s = new Sample();
		s.m1(30);
	}
}

//this -> It holds the address of the current class object
//super -> It holds the address of the parent/super class object.

/*
	When do we use "super" keyword?
	- We use "super" keyword to differentiate the child class instance member
*/