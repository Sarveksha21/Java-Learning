class StaticMethod8
{
	public static void main(String[] args)
	{
		// caller method
		System.out.println("Start");
		int add = test();
		System.out.println("Addition = "+add);
		System.out.println("Stop");
	}
	static int test()
	{
		// calling method
		System.out.println("Inside test method");
		int add = 10+20;
		return add;
	}
}
		
/*
	- When the method is only return a control along with data, based on the type of data, we need to mention the returntype
	- If the data return is integer, then the returntype should be integer; ex:- static int test()
	- If the data return is float, then the returntype should be float; ex:- static float test()
*/