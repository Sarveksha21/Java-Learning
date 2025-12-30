abstract class Demo
{
	// Instance block
	{
		System.out.println("Inside Instance block - Demo");		
	}
}
class Sample extends Demo
{
	{
		System.out.println("Inside Instance block - Sample");		
	}
}
class Abs14
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new Sample();
		System.out.println("Stop");
	}
}

// Instance blocks are allowed within Abstract Class.