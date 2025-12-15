class Parent
{
	private void m1()
	{
		System.out.println("Inside m1 method - Parent");
	}
}
class Child extends Parent
{
	void m1()
	{
		System.out.println("Inside m1 method - Child");
	}
}
class Example25
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
	}
}

// Private members cann't be overridden 