class  NonStaticBlock7
{
	int a;		//0
	//Non-Static Block
	{
		System.out.println("Inside Non-Static Block = "+a);
		a = 100; // initializing value of 'a'
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock7 ref1 = new NonStaticBlock7();
		System.out.println(ref1.a);
		System.out.println("Stop");
	}
}

// To initializing the non-static variable during object creation
