class NonStaticBlock6
{
	{
		System.out.println("Inside Non-static Block: One");
	}
	{
		System.out.println("Inside Non-static Block: Two");
	}
	NonStaticBlock6()
	{
		System.out.println("Inside Constructor Block");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock6 ref1 = new NonStaticBlock6();
		NonStaticBlock6 ref2 = new NonStaticBlock6();
		System.out.println("Stop");
	}
}

/*
	Interview Question: What is the need of instance block? OR When do we use Instance Block in real-time?
	- To initialize the non-static variable during the object creation.
	- To implement the bussiness logics during the object creation.
*/
