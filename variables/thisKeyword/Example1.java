class Example1
{
	int a=100;				//non-static variable
	void m1(int a)			//non-static method
	{
		System.out.println("Inside m1 method");
		System.out.println(a);
		// first approach - object
		Example1 ref = new Example1();															
		System.out.println(ref.a);
	}
	public static void main(String[] args)
	{
		Example1 ref = new Example1();
		ref.m1(10);
	}
}
