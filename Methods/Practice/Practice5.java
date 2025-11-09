class Cyber
{
	int a = 10;					// non-static variable
	static void m1()			// static method
	{
		System.out.println("Inside m1 method");
		System.out.println("Value of b = "+Success.b);
	}
}
class Success
{
	static float b = 200.5f;	// static variable
	void m2()					// non-static method
	{
		System.out.println("Inside m2 method");
		Cyber c = new Cyber();	// object creation of class "Cyber"
		System.out.println("Value of a = "+c.a);
	}
}
		
class Practice5
{
	public static void main(String[] args)
	{
		Cyber.m1();
		Success s1 = new Success();
		s1.m2();
	}
}