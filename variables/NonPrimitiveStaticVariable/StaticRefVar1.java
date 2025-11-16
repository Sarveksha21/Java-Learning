// Non Primitive local reference variable

class StaticRefVar1
{	
	int a = 100;			// non-static variable
	float b = 200.5f;		// non-static variable
	static StaticRefVar1 ref = new StaticRefVar1();		// object creation
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(ref.a + ref.b);
		System.out.println("Stop");
	}
}
		
/*
	Whenever we create a static or reference variable it's not mandatory, 
	we need to initialize it within the constructor method or block
*/