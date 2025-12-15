class Parent
{
	void m1()		// acess-level
	{
		System.out.println("Inside m1 method - Parent");
	}
}
class Child extends Parent
{	
	void m1()		// acess-level
	{
		System.out.println("Inside m1 method - Child");
	}
}
class Example26
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
	}
}
// It is possible to override, if the parent method access level and child method acess-level is same.