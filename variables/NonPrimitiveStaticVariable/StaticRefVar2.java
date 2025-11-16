class StaticRefVar2
{
	static StaticRefVar2 ref;				// Static Variable
	public static void main(String[] args)
	{
		System.out.println("Start");
		ref = new StaticRefVar2();			// object creation
		ref.m1();
		System.out.println("Stop");	
	}
	void m1()								// Non-Static Variable
	{
		System.out.println("Inside m1 method");
	}
}
+ 
/*
	Whenever we create a static or reference variable it's not mandatory, 
	we need to initialize it within the constructor method or block
*/