class NonStaticBlock1
{
	// this is Non-Static Block or Instance Block
	{
		System.out.println("Inside Non-Static Block"); 
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock1 n1 = new NonStaticBlock1();
		System.out.println("Stop");
	}
}

//NonStaticBlocks are executed only with the help of object creation.