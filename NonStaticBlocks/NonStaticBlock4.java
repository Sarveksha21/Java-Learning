class NonStaticBlock4
{
	{
		System.out.println("First Instance/NonStatic Block");
	}
	{
		System.out.println("Second Instance/NonStatic Block");
	}
	NonStaticBlock4()
	{
		System.out.println("Inside 0 Arged Constructor"); 
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock4 n1 = new NonStaticBlock4();
		NonStaticBlock4 n2 = new NonStaticBlock4();
		System.out.println("Stop");
	}
}

/*
	How many times instance block will be executed?
	- The number of times we create objects that number of times instance block will get executed.
*/