class Cyber
{
	static int a=10;		// static variable
	static float m1()		// static method
	{
		System.out.println("Inside m1 method");
		Success s = new Success();	// object creation of class "Success"
		float result1 = s.b + Y.q;
		return result1;
	}
}
class Success
{
	float b = 20.5f;		// non-static variable
	int m2()				// non-static method
	{
		System.out.println("Inside m2 method");
		X ref = new X();	// object creation of class "X"
		int result2 = Cyber.a + ref.p;
		return result2;
	}
}
class X
{
	int p = 100;				// non-static variable
}
class Y
{
	static float q=200.5f;		// static variable
}
class Practice6
{
	public static void main(String[] args)
	{
		Cyber c = new Cyber();		// object creation of class "Cyber"
		float result1 = c.m1();
		
		Success s = new Success();	// object creation of class "Success"
		int result2 = s.m2();
		
		float finalResult = result1 + result2;
		System.out.println("Final Result = "+finalResult);
	}
}