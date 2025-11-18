class Sample2
{
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		Sample2 s = new Sample2();	// named object creation	(less used 20%-30%)
		s.m1();
		new Sample2().m1();		// nameless object creration ( mostly used 70%-80%)
	}
}
