class Example15
{
	Example15()
	{
		this(10);
		System.out.println("0 Argument");
	}
	Example15(int a)
	{
		this(15,20.5f);
		System.out.println("1 Argument");
	}
	Example15(int x, float y)
	{
		System.out.println("2 Arguments");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example15 ref = new Example15();
		System.out.println("Stop");
	}
}