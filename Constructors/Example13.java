class Example13
{	
	/*
		Example13()		// here, this is "default, zero argument & empty implementation" constructor
		}
	*/
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example13 ref = new Example13();
		System.out.println("Stop");
	}
	static void m1()
	{
	}
	void m2()
	{
	}
}
	
// If we don't create "any" constructor, then the compiler will create "default, zero argument & empty implementation" constructor
// To check the members within a class, we have to use a command called as "javap classname".

