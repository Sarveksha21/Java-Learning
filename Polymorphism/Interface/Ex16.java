interface It1
{
	void m1();	// public & abstract
}
class Demo implements It1
{
	public void m1()
	{
			System.out.println("Inside m1 method");
	}
}
class Ex16
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d = new Demo();
		d.m1();
		//It1 i1 = new It1();
		System.out.println("Stop");
	}
}
		
// m1() is inherit from (interface It1 to demo class(child class)) but until we override this method in Demo class it will not work
// It is not possible to create objects of an interface.