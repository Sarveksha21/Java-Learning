class Exception41
{
	public static void main(String[] args)
	{
		//System.out.println(10/0);	//new ArithmeticException(); -> / by zero
		throw new ArithmeticException("Divide by 0");
	}
}

// "throw" keyword is used in one of the ways to change or customize the exception info.
// public ArithmeticException(String);

// The "throw" keyword is responsible to instructed the "JVM" 
// to handle the object creation as a type of an exception.