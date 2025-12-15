class Parent
{
	protected void m1()
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
class Example28
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();
	}
}

// It is not possible to override if the parent method access-level and child method access-level is in "decreasing" order.