class Example18
{
	int a;			// 0
	Example18()
	{
		System.out.println("Inside 0 Args Const = "+a);
	}
	Example18(int a)
	{
		this();
		this.a = a;
		System.out.println("Inside 1 Args Const = "+a);
	}
	void m1(int a)
	{
		//this();
		this.a = a;
		System.out.println("Inside m1 method = "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example18 ref = new Example18(100);
		ref.m1(1000);
		System.out.println("Stop");
	}
}

/*
	- this code will not get execute
    - We can't use "this()" statement within a method, we can only use "this" keyword within a method.
	- "this()" statement concept is introduce to call constructors only, it will not work or thrown an error when used within a method.
*/
