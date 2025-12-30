abstract class Demo
{
	Demo()		// constructor
	{
		System.out.println("Inside Demo - 0 Args Const");
	}
}
class Sample extends Demo
{
	Sample()	// constructor
	{
		System.out.println("Inside Sample - 0 Arg Const");
	}
}
class Abs11
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new Sample();
		System.out.println("Stop");
	}
}
/*
 - Constructors are allowed within Abstract Clas.
 - But we can't create object of abstract class.
 - Therefore, we inherit abstract class inside Sample class.
*/