class StaticMethod6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int a = 100;
		test(a);	// pass by value
		System.out.println("Stop");
	}
	static void test(int a)			// example of pass by value
	{
		System.out.println("Inside test method");
		System.out.println("Value of a = "+a);
	}
}

/* 
	1) How do we access local variables from one method to another? -> we can access it with the help of 'pass by value'.
	2) In Real-Time, when should we go for 'pass by value' -> whenever we have to access local variables from 
		one method area to another we have to use "pass by value"
*/
/*
	Note: Variables which are declared within a method or part of a method, constructor or blocks, 
		such variables are called as local variables.
*/