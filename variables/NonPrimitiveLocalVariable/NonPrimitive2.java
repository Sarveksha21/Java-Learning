class NonPrimitive2
{
	int a = 100;		// non-static variable
	void m1()			// non-static method
	{
		System.out.println("Inside m1 method = "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonPrimitive2 ref = new NonPrimitive2();	// local variable named "NonPrimitive2" is created 
		ref.m1();
		System.out.println("Stop");
	}
}                           