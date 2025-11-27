class StaticBlock2
{
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
		System.out.println("Stop");
	}
}

/*
	- we can create two or more static blocks within java class.
	- whenever there are two or more static blocks in a java class then the order of execution will be from top to bottom order.
*/