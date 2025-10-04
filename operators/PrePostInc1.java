class PrePostInc1
{
	public static void main(String[] args)
	{
		int i=1;
		System.out.println(i);		//print 1
		// Pre Increment
		// First Increment the value of i => Second, it will do Operation 
		System.out.println(++i);	//1 increment to 2 ==> print 2
		System.out.println(i);		// print 2
		
		// Post Incremenet
		// First Operation =>Second, Increment
		System.out.println(i++);	// print 2 ==> 2 increment to 3
		System.out.println(i);		// print 3
	}
}