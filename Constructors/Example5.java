class Example5
{
	Example5()
	{
		System.out.println("One");
	}
	Example5()
	{
		System.out.println("Two");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example5 ref = new Example5();
		System.out.println("Stop");
	}
}
// error: constructor Example5() is already defined in class Example5
// Duplicate constructor are not supported by java