class Practice2
{
	static float x = 10.5f;		// static variable
	static void m1()		// static method
	{
		System.out.println("Inside m1 method");
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		m1();							// Direct Access
		Practice2.m1();					// Access by using classname
		Practice2 p = new Practice2();	// object creation
		p.m1();
	}
}
