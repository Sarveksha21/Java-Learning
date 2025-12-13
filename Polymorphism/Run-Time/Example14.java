class Demo
{
	int m1()
	{
		System.out.println("Inside Demo - m1 method");
		return 10;
	}
}
class Sample extends Demo
{
	float m1()
	{
		System.out.println("Inside Sample - m1 method");
		return 10.56f;
	}
}
class Example14
{	
	public static void main(String[] args)
	{
		Sample s = new Sample();
		s.m1();
	}
}

// It is not possible to override, if the parent method returntype & child method returntype are different at primitive level.
