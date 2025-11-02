class StaticMethod3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		m1();
		System.out.println("Stop");
	}
	static void m1()
	{
		System.out.println("Inside m1 method");
		return;
		return;
	}
}

/*
	- We can't use more than more than one return statement inside a single method.
	- if we do so the first return statement will move the control back to the caller method.
	- because of this, the control will never reach the second written 'return' statement.
	- Hence, the 2nd return statement will be unreachable statement.
*/