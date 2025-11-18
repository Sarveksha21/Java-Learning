class Example4
{
	int a = 10;
	static void m1(int a)		// static method
	{	
		System.out.println("Inside m1 method");
		System.out.println(a);
		System.out.println(this.a);
	}
	public static void main(String[] args)
	{
		Example4 ref1 = new Example4();
		ref1.m1(10);
	}
}

/*
	-In this example, "m1()" is static method, static methods loads inside "static pool" which has no address,
	-"static pool" has name same as classname (here, classname=Example4)
	-but, "this" keyword holds the address of the object(which includes all non-static members present inside class)
	-hence, when you try to load "this" keyword inside static method, it will not load it
	-"this" keyword doesn't work in a static area.
*/