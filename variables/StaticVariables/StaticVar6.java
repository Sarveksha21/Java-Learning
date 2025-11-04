class Demo1
{
	static int var1 = 100;
}
class Demo2
{
	static float var2 = 200.5f;
}
class StaticVar6
{
	public static void main(String[] args)
	{
		float result;
		result = Demo1.var1 + Demo2.var2;
		System.out.println("Result = "+result);
	}
}
