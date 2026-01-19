class Exception22
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);
		}
		catch(Exception ai)
		{
			System.out.println("Inside Catch Block");
		}
		finally			
		{
			System.out.println("Inside finally Block");
		}
		System.out.println("Stop");
	}
}
