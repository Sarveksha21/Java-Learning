class NonStaticMethod1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticMethod1 ref = new NonStaticMethod1();	// accessing non-static method by creating object 
		ref.m1();
		System.out.println("Stop");
	}
	void m1()			// non-static method
	{
		System.out.println("Inside m1 method");
	}
	
}

/*
	The Way we access non static variables with the help of object creation, 
	the same approach is applicable for non-static methods.
*/

		