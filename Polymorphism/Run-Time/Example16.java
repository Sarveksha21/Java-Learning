class Cyber
{
	Cyber m1()
	{
		System.out.println("Inside Cyber - m1 method");
		return new Cyber();
	}
}
class Success extends Cyber
{
	Success m1()
	{
		System.out.println("Inside Success - m1 method");
		return new Success();
	}
}	
class Example16
{
	public static void main(String[] args)
	{
		Success s = new Success();
		s.m1();
	}
}

// It is possible to override, if the parent method returntype and the child method returntype is different at class-level.
// It is possible to override, if the parent method returntype is parent-type and the child method returntype is child-type, 
// such returntype are called as covariant returntype.
