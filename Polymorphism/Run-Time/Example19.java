class Parent
{
	int a=10;
	void m1()
	{	
		System.out.println("Inside m1 method = "+a);
	}
}
class Child extends Parent
{
	float b=20.5f;
	void m2()
	{	
		System.out.println("Inside m2 method = "+b);
	}
}	
class Example19
{
	public static void main(String[] args)
	{
		Parent p = new Child();		// upcasting, here child is behaving as parent, and child will loose child's behaviour
		System.out.println(p.a);
		p.m1();
		Child c = (Child)p;		//downcasting
		System.out.println(c.b);
		System.out.println(c.a);
		c.m1();
		c.m2();
	}
}