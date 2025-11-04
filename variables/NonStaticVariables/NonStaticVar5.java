class NonStaticVar5
{
	static int a = 10;		// static variable
	float b = 20.5f;			// non-static variable
	public static void main(String[] args)
	{
		float result;		// local variable
		System.out.println("Start");
			
		NonStaticVar5 var1 = new NonStaticVar5();
		float  b = var1.b;		// here we are creating object of non-static varible 'b'
			
		result = a + b;
		System.out.println("Final Result = "+result);
			
		System.out.println("Stop");
	}
}
