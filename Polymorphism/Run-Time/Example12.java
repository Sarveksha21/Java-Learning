/*
	Run-Time Polymorphism:
	- It can be achieve with the help of "overriding"
	- To achieve overriding, there use to be two conditions which needs to be satisfies.
	  i) Minimium there should be two classes.
	  ii) Between those two classes, there should exist "is a" relationship
	 
	Overriding: It is a process where, the child inherits the object of the parents and then changes its behaviour
	
	Method Signature: It can be defined as a combination of Methodname as well as along with arguments/ parameters.
*/
class Demo
{
	void m1()
	{
		System.out.println("Inside Demo - m1 method");
	}
}
class Sample extends Demo
{
	void m1()
	{
		System.out.println("Inside Sample - m1 method");
	}
}
class Example12
{
	public static void main(String[] args)
	{
		Sample s = new Sample();
		s.m1();
	}
}

// To achieve method overriding, the parent method signature and child method signature should remain the same
// Instead of using the parent class m1() method, Sample class provides its own implementation by displaying m1() method of Sample class.
