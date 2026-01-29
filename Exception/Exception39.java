class Exception39
{
	static void m1() throws ArithmeticException
	{
		System.out.println("Inside m1 method");
		System.out.println(10/0);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
}

/*
	"Checked Exception" can be handled or can be delegected,
	but "Unchecked Exception" cann't be delegected but only needs to be handled.
*/