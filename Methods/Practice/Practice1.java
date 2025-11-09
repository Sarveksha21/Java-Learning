class Practice1
{
	static int var1 = 10;		// static variable
	float var2 = 20.5f;			// non-static variable
	public static void main(String[] args)
	{
		int var3 = 100;
		Practice1 p = new Practice1();		// object creation for "var2" non-static variable
		float result = var1 + p.var2 + var3;
		System.out.println("Result = "+result);
	}
}