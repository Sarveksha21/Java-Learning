class NonPrimitive3
{
	int a = 100;		// non-static variable
	static void m1(NonPrimitive3 ref2)	// passing value of ref1 from line no.14 in m1() 
	{
		System.out.println("Inside m1 method");
		System.out.println(ref2.a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonPrimitive3 ref1 = new NonPrimitive3();
		System.out.println(ref1.a);
		m1(ref1);		// pass-by-value
		System.out.println("Stop");
	}
}