//Exceptions

class Exception1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(10/0);		//Unchecked Exception: ArrayOutOfBoundException
		System.out.println("Start");
	}
}

/* 
	Exceptions: It can be defined as an unexepected event which may occur during rhe complie-time or run-time.
	They are categorised mainly into 3 types:
	I) Unchecked Exception
	II) Checked Exception
	III) Errors
	
	I)Unchecked Exception: Exception wgich are are checked by the complier but checked but JVM at runtime such exception are called as Unchecked Exception.
		example: i) ArithmeticException
				 ii) ArrayOutOfBoundException
				 
*/
			