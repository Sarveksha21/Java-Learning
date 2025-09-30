class Example7
{
	public static void main (String[] args)
	{
		byte var1 = 127;
		System.out.println(var1);
		byte var2 = 128;
		System.out.println(var2);	// Compile Time error
		byte var3 = -128;
		System.out.println(var3);
		byte var4 = -129;
		System.out.println(var4);	// Compile Time error
	}
}