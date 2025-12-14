class Demo
{
}
class Cyber
{
	Demo m1()
	{
		System.out.println("Inside Cyber - m1 method");
		Demo d1 = new Demo();
		return d1;
	}
}
class Success extends Cyber
{
	Demo m1()
	{
		System.out.println("Inside Success - m1 method");
		Demo d2 = new Demo();
		return d2;
	}
}	
class Example15
{
	public static void main(String[] args)
	{
		Success s = new Success();
		s.m1();
	}
}

// It is possible to override, if the parent method returntype and the child method returntype is same at class-level.