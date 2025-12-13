class Demo
{
	Demo()
	{
		System.out.println("Inside 0 Arg");
	}
	Demo(int a)
	{
		System.out.println("Inside 1 Arg");
	}
}
class Example6
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		//Demo d = new Demo(12);
	}
}

/*
	Constructor Overloading:
	Rule1: Constructor name should remain the same, but should vary in the number of arguments.
*/