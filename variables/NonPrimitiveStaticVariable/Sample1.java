class s1
{
	static s1 o1;
	void p1(String info)
	{
		System.out.println("hi");
		System.out.println(info);
	}
}

class Sample1
{
	public static void main(String[] args)
	{
		s1.o1 = new s1();
		s1.o1.p1("Inside Info");
	}
}

/*
	Here, I want to access "o1" in class "Sample", which is present inside class "s1"
*/