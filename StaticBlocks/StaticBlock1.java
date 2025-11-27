class StaticBlock1
{
	static 
	{
		System.out.println("Inside Static Block");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println("Stop");
	}
}

// Static Block are executed during time of classloading.
// static block don't need object creation for execution, they can be executed directly.