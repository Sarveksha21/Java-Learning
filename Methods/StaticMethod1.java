class StaticMethod1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();					// Directly calling a method
		StaticMethod1.m1();		// Indirectly calling a method
		System.out.println("Stop");	
	}
	static void m1()
	{
		System.out.println("Inside m1 method");
	}
}
	