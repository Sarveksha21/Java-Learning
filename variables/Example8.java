class Example8
{
	public static void main (String[] args)
	{
		short s1 = 32767;
		System.out.println(s1);
		short s2 = 32768;
		System.out.println(s2);		// Compile-Time Error
		short s3 = -32768;
		System.out.println(s3);
		short s4 = -32769;
		System.out.println(s4);		// Compile-Time Error
	}
}