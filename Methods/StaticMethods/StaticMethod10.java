class StaticMethod10
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		int x = 10;
		float y = 20.5f;
		
		float r1 = m1(x);
		float r2 = m2(y);
		float result = r1 + r2;
		
		System.out.println("Final Result = "+result);
		System.out.println("Stop");

	}
	static int m1(int x)
	{
		int r1 = x + 10;
		return r1;			// return-by-value
	}
	static float m2(float y)
	{
		float r2 = y + 20.5f;
		return r2;			// return-by-value
	}
}

	