class Demo
{
	Demo(float b)
	{
		System.out.println("Inside float Arg");
	}
	Demo(int a)
	{
		System.out.println("Inside int Arg");
	}
}
class Example7
{
	public static void main(String[] args)
	{
		Demo d = new Demo(12.45f);
	}
}

/*
	Constructor Overloading:
	Rule2: Constructor name should remain the same, can have same number of arguments, but should vary in the type of the argument.
*/