class Exception5
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30};
		System.out.println("Start");
		try
		{
					System.out.println("Inside Try Block");	
					System.out.println(a[10]);
		}
		catch (ArrayIndexOutOfBoundsException ai)
		{
					System.out.println("Alternative Solution");	
					System.out.println(a[2]);
		}
		System.out.println("Start");
	}
}