class Sample4
{
	int a = 100;					// non-static variable
	float b = 20.5f;
	static void m1(Sample4 ref)		// static method
	{
		System.out.println("Inside m1 method");
		System.out.println(ref.a);
	}
	static void m2(Sample4 ref)		// static method
	{
		System.out.println("Inside m2 method");
		System.out.println(ref.b);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sample4 ref = new Sample4();	// Named Object
		m1(ref);
		m2(new Sample4());		// Nameless Object Creation
		System.out.println("Stop");

	}
}
	