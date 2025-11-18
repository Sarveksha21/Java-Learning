class Sample3
{
	int a = 100;
	void m1()
	{
		System.out.println("Inside m1 method");
	}
	public static void main(String[] args)
	{
		Sample3 s = new Sample3();		// named object creation
		System.out.println(s.a);
		s.m1();
		
		System.out.println(new Sample3.a);	// namedless object creation
		new Sample3().m1();
	}
}
/*
	here in line13 & 14 "new Sample3", object is creating two times, it takes more space inside a memory 
	this is not the right way to write nameless object creation
*/