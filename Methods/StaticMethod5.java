class StaticMethod5
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		test();
		System.out.println("Stop");
	}
	static void test()
	{
		System.out.println("Inside test method");
		// If we don't write return statement then the compiler will write the return statement.
	}
}

/*
	void: The void returntype is only used within a method when the method only return the control but no data.
		  In this situation the method returntype is "void".
*/