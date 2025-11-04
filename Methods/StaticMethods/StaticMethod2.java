class StaticMethod2
{
	// This is caller method
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
	
	// This is called method
	static void m1()
	{
		System.out.println("Inside m1 method");
		return;
	}
}		

// The return statement is used within the methods to return the control back to the caller method.
	