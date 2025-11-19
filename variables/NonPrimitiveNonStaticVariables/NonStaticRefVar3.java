class Demo
{
	int a = 100;		// non-static variable
	float b = 200.5f;	// non-static variable
	Demo ref;			// non-static non-primitive reference referene variable  // ref=null, at initial stages
}
class NonStaticRefVar3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d = new Demo();		// 1st object creation
		d.ref = new Demo();			// 2nd object creation
		float result = d.ref.a + d.ref.b;
		System.out.println("Result = "+result);
		System.out.println("Stop");
	}
}

/*
	At line5 value of ref=null, then in line11 "d" work as an address to store the value of all non-static members 
	of NonStaticRefVar3 class
*/