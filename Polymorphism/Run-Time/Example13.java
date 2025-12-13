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
	int m1()
	{
		System.out.println("Inside Sample - m1 method");
		return 100;
	}
}
class Example13
{	
	public static void main(String[] args)
	{
		Sample s = new Sample();
		s.m1();
	}
}

// It is possible to override, if the parent method returntype & child method returntype is same at primitive level.
