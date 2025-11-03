class NonStaticVar1
{
	int a =100;	// non-static variable
	public static void main(String[] args)
	{
		System.out.println("Start");
		// System.out.println(a);		// Direct access is Invalid of Non-Static Variables
		// System.out.println(NonStaticVar1.a);	// Classname access is also Invalid of Non-Static Variables
		
		NonStaticVar1 RefVar1 = new NonStaticVar1();
		System.out.println(RefVar1.a);
		
		System.out.println("Stop");
	}
}

/*
	Non Static Variables : Variables which are declared outside the method, construction and blocks but within the class 
						   and is not prefix with "static" keyword such variables are called as Non Static Variables.
*/