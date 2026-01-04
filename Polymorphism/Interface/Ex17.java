interface It1							// Interface
{
	void m1();	// public & abstract
}
abstract class Demo implements It1		// abstract class
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Sample extends Demo				// normal class
{
	public void m2()
	{
		System.out.println("Inside m2 method");
	}
}
class Ex17							
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample s = new Sample();
		s.m1();
		s.m2();
		System.out.println("Stop");
	}
}
		
// In this example, we have covered interfaces, abstract classes as well as normal class.