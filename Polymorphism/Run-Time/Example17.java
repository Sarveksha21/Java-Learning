class Cyber
{
	final void m1()		// overridden method
	{
		System.out.println("Inside Cyber - m1 method");
	}
}
class Success extends Cyber
{
	void m1()		// overridding method
	{
		System.out.println("Inside Success - m1 method");
	}
}	
class Example17
{
	public static void main(String[] args)
	{
		Success s = new Success();
		s.m1();
	}
}

// It is not possible to override, "final" methods