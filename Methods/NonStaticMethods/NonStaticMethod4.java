class Demo
{
	int test1(int a)
	{
		int result1 = a + 100;
		return result1;	
	}
}
class Sample
{
	float test2(float b)
	{
		float result2 = b + 200.5f;
		return result2;
	}	
}
class NonStaticMethod4
{
	float FinalResult;
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		int a = 10;
		float b = 20.5f;
		
		Demo d = new Demo();
		float result1 = d.test1(a);
		
		Sample s = new Sample(); 
		float result2 = s.test2(b);
		
		float FinalResult = result1 + result2;
		System.out.println("Final Result = "+FinalResult);
		
		System.out.println("Stop");
	}
}