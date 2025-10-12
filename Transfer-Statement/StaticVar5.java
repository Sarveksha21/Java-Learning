// Accessing static members from another class
/*
	There are two approaches to access the static members from another class:
	1)ClassName		2)Object Creation
*/

class Demo
{
	static int a=100;
}
class StaticVar5
{
	public static void main (String[] args)
	{
		//System.out.println(a);		// Directly (Ihis is invalid)
		System.out.println(Demo.a);		// ClassName (Ihis is valid)
										// Object Creation (Ihis is valid)
	}
}

	