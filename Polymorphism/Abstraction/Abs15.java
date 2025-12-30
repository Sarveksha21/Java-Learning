abstract class Demo
{
	static
	{
		System.out.println("Inside Static block - Demo");		
	}
}
class Sample extends Demo
{
	static
	{
		System.out.println("Inside Static block - Sample");		
	}
}
class Abs15
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new Sample();
		System.out.println("Stop");
	}
}

// static blocks are also allowed within abstract class.