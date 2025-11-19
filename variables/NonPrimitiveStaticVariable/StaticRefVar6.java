class Demo
{
	static Demo ref;
	float x = 10.5f;
	void m1()
	{	
		System.out.println("Inside m1 method");
	}
}

class StaticRefVar6
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo.ref = new Demo();
		System.out.println(Demo.ref.x);
		Demo.ref.m1();
		System.out.println("Stop");
	}
}