class Sample
{
	static void m1()
	{
		System.out.println("Inside m1 method- Sample");
	}
}
class Demo extends Sample
{
	static void m1()
	{
		System.out.println("Inside m1 method- Demo");
	}
}
class Example23
{
	public static void main(String[] args)
	{
		// Upcasting
		Sample s = new Demo();	
		s.m1();
	}
}

/*
	Static Method:
	- Under concept of overriding, if child method is present or not it will only display parent method 
	- It is possible to override "non-static method", but it is not possible to override "static method"
	- because "non-static method" are bonded by object whether as "static method" are bonded by classes