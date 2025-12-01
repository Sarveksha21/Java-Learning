class One
{
	int a=10;
	void m1()
	{
		System.out.println("Inside m1 method, value of a = "+a);
	}
}
class Two extends One
{
	float b=20.54f;
	void m2()
	{
		System.out.println("Inside m2 method, value of b = "+b);
	}
}
class Three extends Two
{
	char c='x';
	void m3()
	{
		System.out.println("Inside m3 method, value of c = "+c);
	}
}
class Inherit3
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		One ref1 = new One(); ref1.m1(); 
		System.out.println("--------");
		Two ref2 = new Two(); ref2.m2(); 
		System.out.println("--------");
		Three ref3 = new Three(); ref3.m3(); 
		System.out.println("Stop");
	}
}