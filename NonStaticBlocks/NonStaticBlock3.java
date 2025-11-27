class NonStaticBlock3
{
	{
		System.out.println("First Instance/NonStatic Block");
	}
	{
		System.out.println("Second Instance/NonStatic Block");
	}
	NonStaticBlock3()
	{
		System.out.println("Inside 0 Arged Constructor"); 
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock3 n1 = new NonStaticBlock3();
		System.out.println("Stop");
	}
}

/*
	we can create minimum one or multiple instance/NonStatic Block, whenever there are multiple instance block, 
	the order of execution of the blocks are from top to bottom.
*/