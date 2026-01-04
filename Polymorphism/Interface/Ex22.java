/* j
interface It1
{
	interface It2	//It2 is nested interface
	{
		void m1();
	}
}
class Ex22 implements It1.It2
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Ex22 c1 = new Ex22();
		c1.m1();
		System.out.println("Stop");
	}
}
*/
class Demo
{
	interface It1	
	{
		void m1();
	}
}
class Ex22 implements Demo.It1
{
	public void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");	
		Ex22 c1 = new Ex22();
		c1.m1();
		System.out.println("Stop");
	}
}

// We can create an interface within an class