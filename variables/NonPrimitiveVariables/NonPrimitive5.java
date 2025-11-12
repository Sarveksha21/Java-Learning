class Demo
{
	float x = 20.5f;	// non-static variable	
}
class NonPrimitive5
{
	static void method1(Demo d1)	// static method
	{
		System.out.println("Inside method1");
		System.out.println(d1.x);
	}
	void method2(Demo d1)			// non-static method	
	{
		System.out.println("Inside method2");
		System.out.println(d1.x);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo d = new Demo();							// local variable 'd'
		NonPrimitive5.method1(d);
		NonPrimitive5 ref = new NonPrimitive5();		// local variable 'ref'
		ref.method2(d);
		System.out.println("Inside main = "+d.x);
		System.out.println("Stop");
	}
}