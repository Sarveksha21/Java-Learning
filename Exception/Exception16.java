class Exception16
{
	static void m2()
	{
		System.out.println("Inside m2 method");
		try
		{
			System.out.println("Inside Try");
			System.out.println(10/0);	
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Inside Catch");
			//System.out.println(ae.toString());
			//System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
	}
	static void m1()
	{
		System.out.println("Inside m1 method");
		m2();
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
}

//Internally which method is called to print the exception info()? => printStackTrace()