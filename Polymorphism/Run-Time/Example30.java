class Parent
{
	void m1()
	{
		System.out.println("Inside m1 method - Parent");
	}
	void m2()
	{
		System.out.println("Inside m2 method - Parent");
	}	
}
class Child extends Parent
{
	void m1()
	{
		System.out.println("Inside m1 method - Child");
	}
	void m3()
	{
		System.out.println("Inside m3 method - Child");
	}
}
class Example30
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		p.m1();		//here, overriding is happening
		p.m2();		//here, upcasting is happening because this method is present in parent class
		//p.m3();	//here, overriding or upcasting is not possible because this method is not present in parent or child class 
		Child c = (Child)p;
		c.m3();		// here, downcasting is happening
	}
}