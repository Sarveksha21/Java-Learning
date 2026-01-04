interface It1
{
	//static abstract void m1()	// this is also illegal combination
	static void m1()	
	{
		System.out.println("Inside m1 method");
	}
}
class Ex24
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		It1.m1();	// We are able to create static "complete" methods within an interface.
		System.out.println("Stop");
	}
}

/*
	- We are able to create static "complete" methods within an interface.
	- this feature has been added in Java8.
*/1