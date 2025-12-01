class One
{
	int a=10;
	void m1()
	{
		System.out.println("Inside m1 method, the value of a = "+a);
	}
}
class Two extends One
{	
	float b=15.6f;
	void m2()
	{
		System.out.println("Inside m2 method, the value of b = "+b);
	}
}
class Three extends One
{
	char c='x';
	void m3()
	{
		System.out.println("Inside m3 method, the value of c = "+c);
	}
}
class Four extends One
{
	boolean d=true;
	void m4()
	{
		System.out.println("Inside m4 method, the value of d = "+d);
	}
}
class Inherit4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		One ref1 = new One(); ref1.m1();
		System.out.println("-------");
		Two ref2 = new Two(); ref2.m2(); ref1.m1();
		System.out.println("-------");
		Three ref3 = new Three(); ref3.m3(); ref1.m1();
		System.out.println("-------");
		Four ref4 = new Four(); ref4.m4(); ref1.m1();
	}
}