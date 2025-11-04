class Sample
{
	char x = 'a';		// non-static variable
}

class NonStaticVar4
{
	public static void main(String[] args)
	{
		Sample s = new Sample();	
		System.out.println(s.x);
	}
}

// To access non static member within same class or another class we need to create an object in "main" method.