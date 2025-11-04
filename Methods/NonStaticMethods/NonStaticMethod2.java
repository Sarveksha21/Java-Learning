class NonStaticMethod2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		int a = 100;
		float b = 200.5f;
		
		NonStaticMethod2 var1 = new NonStaticMethod2();		// creating object using classname
		float result = var1.m1(a,b);						// accessing non-static method by creating object 
		
		System.out.println("Final Result = "+result);
		
		System.out.println("Stop");
	}
	float m1(int a, float b)			// non-static method
	{
		System.out.println("Inside m1 method");
		float result = a + b;
		return result;
	}
}
