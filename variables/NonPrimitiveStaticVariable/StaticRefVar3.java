class Demo
{
	static Demo ref;	// Non_Primitive Type/ ClassType/ Reference Variable
	int a = 100;		// non-static variable
	void m1()			// non-static method
	{
		System.out.println("Inside m1 method = "+a);
	}
}

class StaticRefVar3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo.ref = new Demo();		// To access static memeber from another class, we use "Demo.ref"
		Demo.ref.m1();				// It will call m1() method using "ref", which is present inside "Demo" class
		System.out.println("Stop");
	}
}

/*
	At line3 value of ref=null, then in line16 "ref" work as an address to store the value of all non-static members of Demo class
*/