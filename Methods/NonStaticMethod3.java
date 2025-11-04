class NonStaticMethod3
{
	public static void main (String[] args)
	{
		System.out.println("Start");
		int var1 = 10;
		Demo d = new Demo();
		float result = d.m1(var1);
		System.out.println("Final Result = "+result);
		System.out.println("Stop");
	}
}
class Demo
{
	int m1(int var1)
	{
		int result = var1 + 100;
		return result;
	}
}