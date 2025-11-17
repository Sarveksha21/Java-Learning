class System1
{
	static System1 out1;
	void println1(String info)
	{
		System.out.println("hi");
		System.out.println(info);
	}
}

class Sample2
{
	public static void main(String[] args)
	{
		System1.out1 = new System1();
		System1.out1.println1("This is SOP Statement");
	}
}

/*
	out1 -> It is reference variable which is bynature static
	println -> Non-static method
	out1.println -> because of 'out1' reference variable, I am able to access 'println' non-static method 
*/