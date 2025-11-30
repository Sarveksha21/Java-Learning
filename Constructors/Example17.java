class Example17
{
	int a;			// 0
	Example17()
	{
		System.out.println("Inside 0 Args Const = "+a);
	}
	Example17(int a)
	{
		this();
		this.a = a;
		System.out.println("Inside 1 Args Const = "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example17 ref = new Example17(100);
		System.out.println("Stop");
	}
}

// We can use "this()" statement and "this" keyword within the constructor at the same time.