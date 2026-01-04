interface It1
{
	interface It2	//It2 is nested interface
	{
		void m1();
	}
}
class Ex21 implements It1, It2
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Ex21 c1 = new Ex21();
		c1.m1();
		System.out.println("Stop");
	}
}

/*
- It2 is not a top-level interface.
- It is a nested interface inside It1.
- Nested interfaces must be referenced with their enclosing interface/class name.
- It2 is inside It1, so you must write It1.It2.
- You don’t need to implement It1 itself unless it has abstract methods (here it doesn’t).
*/