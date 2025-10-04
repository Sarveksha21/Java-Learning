// Pre Decrement 
/*
	In the pre decrement operator, we will first decrement the value of i (variable) and then secondly it will perform operation.
*/
// Post Decrement 
/*
	In the post decrement operator, we will first perform operation and then secondly we will decrement the value of i (variable).
*/
class PrePostInc2
{
	public static void main(String[] args)
	{
		int i=3;
		System.out.println(i);		// print 3
		// Pre Decrement 
		// First Decrement the value of i => Second, it will do Operation 
		System.out.println(--i);	// 3 Decrement to 2 ==> print 2
		System.out.println(i);		// print 2
		
		// Post Decrement
		// First Operation =>Second, Decrement
		System.out.println(i--);	// print 2 ==> 2 increment to 3
		System.out.println(i);		// print 1
	}
}