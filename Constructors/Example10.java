class Example10
{
	Example10()
	{
		this(10);	// It calls another constructor within the same class, here it will call "Example10(int a)"
		System.out.println("Inside 0 Argument Constructor");
	}
	Example10(int a)
	{
		System.out.println("Inside 1 Argument Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example10 ref = new Example10();
		System.out.println("Stop");
	}
}

// Interview Question: How do we execute two constructors by single object creation.
// this -> keyword -> It holds address of the current object
// this() -> statement/method -> It calls another constructor within the same class.