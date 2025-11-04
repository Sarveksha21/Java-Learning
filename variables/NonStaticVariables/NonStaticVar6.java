class Demo
{
	static int var1 = 10;
}
class Sample 
{
	float var2 = 20.5f;
}
class NonStaticVar6
{
	static float result;
	public static void main(String[] args)
	{
		System.out.println("Start");
		
//		Demo d = new Demo();		--we can access static variable 'var1' thrown object creation 
//		int var1 = Demo.var1; 
		
		Sample s = new Sample();
		float var2 = s.var2;
		
//		result = var1 +var2;			// if we use created object then result will calculated like this
		result = Demo.var1 + var2;		// we can access static variable 'var1' by classname also 
		System.out.println("Final Result = "+result);
	
		System.out.println("Stop");
	}
}