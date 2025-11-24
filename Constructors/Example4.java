class Example4
{
	Example4()
	{
		System.out.println("Inside Constructor");
		return;
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example4 ref = new Example4();
		System.out.println("Stop");
	}
}	

// for the constructor to return the control, we use "return" statement
// If we do not use "return" statement, then the complier bydefault will set the "return" statement
