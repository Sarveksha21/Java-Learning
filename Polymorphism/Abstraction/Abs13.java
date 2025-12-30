abstract class Demo
{
	Demo()		// constructor
	{
		this(20.5f);
		System.out.println("Inside Demo - 0 Args Const");			//2
	}
	Demo(float x)		// constructor
	{
		System.out.println("Inside Demo float - 1 Args Const");		//1
	}
}
class Sample extends Demo
{
	Sample()	// constructor
	{
		super();
		System.out.println("Inside Sample - 0 Arg Const");			//3
	}
	Sample(int a)	// constructor
	{
		this();
		System.out.println("Inside Sample int - 1 Arg Const");		//4
	}
}
class Abs13
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new Sample(100);
		System.out.println("Stop");
	}
}