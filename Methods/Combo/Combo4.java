class Demo			//Multi-class
{
	char z='a';		//non-static variable
	void m1()		//non-static method
	{
		System.out.println("Value of z inside m1 = "+z);
	}
	
}
class Combo4
{
	//Static Area
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo c1 = new Demo();
		System.out.println("Value of z = "+c1.z);	// Access through object creation
		c1.m1();
		System.out.println("Stop");
	}
}

/*
	1) Which Class?   -> Multi class
	2) Which Area?    -> Static Area
	3) Which Members? -> Non-Static Members
	Hence, it can be access only by object creation.
*/