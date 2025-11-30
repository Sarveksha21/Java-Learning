class NonStaticBlock10
{
	NonStaticBlock10()
	{
		this(10);		
		System.out.println("Inside 0 Argu Constructor");
	}
	NonStaticBlock10(int a)
	{
		System.out.println("Inside 1 Arg Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock10 ref1 = new NonStaticBlock10();
		System.out.println("Stop");
	}
}

//this -> keyword -> it holds address of the current object

//Interview Question: How do we execute two conatructor by single object creation.
//this() -> statement/method -> it calls another constructor within the same class.
