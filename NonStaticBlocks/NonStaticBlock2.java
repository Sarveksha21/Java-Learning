class NonStaticBlock2
{
	// this is Non-Static Block or Instance Block
	{
		System.out.println("Inside Non-Static Block"); 
	}
	NonStaticBlock2()		// 0 arged constructor
	{
		System.out.println("Inside 0 Arged Constructor"); 
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock2 n1 = new NonStaticBlock2();
		System.out.println("Stop");
	}
}

/*
	- During object creation the instance/non-static block will get executed first and only after that the 
	  constructor will get executed
	- Before every constructor execution, it will check whether instance block s present or not
	- If it is presnet it will execute the instance block and only then, it will execute the constructor
*/
	