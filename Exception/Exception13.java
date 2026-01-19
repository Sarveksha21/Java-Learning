class Exception13
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int[] a= {10,20,30};
		try
		{
			System.out.println("Inside Try Block");
			System.out.println(10/0);	
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			System.out.println("Inside catch Block = "+e);
		}
		System.out.println("Stop");
	}
}

/*
	In Real-time, we don't preferred to write multiple catch blocks, we preferred to write single catch block.
	This is possible with the help of Uncasting, whenever we print normal class reference variable it prints the address 
	but whenever we print the exception class reference variable, it doesn't print the address but prints the value.
	Exception classes overrides toString().
*/
