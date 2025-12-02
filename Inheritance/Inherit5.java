class A
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class B
{
	void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class C extends A, B
{
}
class Inherit5
{	
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		System.out.println("Stop");
	}
}

/*
	- Java will not support concept of Multiple Inheritance
	- Class C will get confused to call which method from parent class A & B.
*/
