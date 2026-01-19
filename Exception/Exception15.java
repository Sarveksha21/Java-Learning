class Exception15
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int[] a= {10,20,30};
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);	
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
		}
		System.out.println("Stop");
	}
}

/*
	How many ways are there to print exception info?
	- There are three ways to print exception into:-
	1)public java.lang.String toString();
	2)public java.lang.String getMessage();
	3)public void printStackTrace();
*/
