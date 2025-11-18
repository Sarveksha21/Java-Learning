class Example3
{
	int a = 10;
	float b = 20.5f;
	void m1(int a,float b)		// non-static method
	{
		System.out.println("Inside m1 method");
		System.out.println("Without using this keyword = "+(a+b));			//3.5
		System.out.println("With using this keyword = "+(this.a+this.b));	//30.5
		this.a = 100;
		this.b = 200.5f;
		System.out.println("Without using this keyword = "+(a+b));			//3.5
		System.out.println("With using this keyword = "+(this.a+this.b));	//300.5
	}
	public static void main(String[] args)
	{
		Example3 ref1 = new Example3();
		Example3 ref2 = new Example3();
		System.out.println(ref1.a + ref1.b);
		System.out.println(ref2.a + ref2.b);
		ref1.m1(1, 2.5f);
		ref2.m1(1, 2.5f);
	}
}

