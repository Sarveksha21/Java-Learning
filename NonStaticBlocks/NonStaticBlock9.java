class NonStaticBlock9
{
	int a;
	{
		System.out.println("Inside Non-Static Block, value of a = "+a);
		a = 10;
	}
	NonStaticBlock9()
	{
		System.out.println("Inside Non-Static Block, value of a before initialization = "+a);
		a = 100;
		System.out.println("Inside Non-Static Block, value of a after initialization = "+a);
	}
	NonStaticBlock9(char x)
	{
		System.out.println("Inside Non-Static Block, value of a before initialization = "+a);
		a = 1000;
		System.out.println("Inside Non-Static Block, value of a after initialization = "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticBlock9 n1 = new NonStaticBlock9();
		NonStaticBlock9 n2 = new NonStaticBlock9('a');
		System.out.println("Stop");
	}
}

/*
	Interview Question:
	Constructor & Instance blocks both perform the same operation, then what is difference between them.
	- The Instance Block logics are applicable to all constructors and all objects.
	- But Constructors logics are applicable to their respective object and respective constructor.
*/