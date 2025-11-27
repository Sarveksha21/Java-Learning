class StaticBlock3
{
	{
		System.out.println("Inside Non Static Block");
	}
	static 
	{
		System.out.println("Inside 1st Static Block");
	}
	static 
	{
		System.out.println("Inside 2nd Static Block");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		StaticBlock3 s1 = new StaticBlock3();
		StaticBlock3 s2 = new StaticBlock3();
		System.out.println("Stop");
	}
}

/*
	classloading happens only once (calling static blocks) whereas object creation can happens multiple number of times
	(calling non-static blocks) based on that instance blocks will get executed.
*/