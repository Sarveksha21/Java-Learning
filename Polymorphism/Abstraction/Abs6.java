abstract class Parent
{
	abstract void m1();	//incomplete method
	void m2()			//complete method
	{	
		System.out.println("Inside m1 method - Demo");
	}
}
class Child extends Parent
{
	void m1()
	{
		System.out.println("Inside m1 method - Child");
	}
	void m2()
	{
		System.out.println("Inside m2 method - Child");
	}
}
class Abs6
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
		p.m2();
	}
}