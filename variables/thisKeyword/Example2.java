class Example2
{
	int a = 100;
	void m1(int a)
	{
		System.out.println("Inside m1 method");
		System.out.println("Without using this keyword = "+a);
		System.out.println("With using this keyword = "+this.a);
	}
	public static void main(String[] args)
	{
		Example2 ref = new Example2();
		ref.m1(10);
	}
}

	