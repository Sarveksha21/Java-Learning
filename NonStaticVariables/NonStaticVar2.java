class NonStaticVar2
{
	int a = 100;
	float b = 200.5f;
	char c = 'x';
	public static void main (String[] args)
	{
		NonStaticVar2 RefVar1 = new NonStaticVar2();
		System.out.println(RefVar1.a);
		System.out.println(RefVar1.b);
		System.out.println(RefVar1.c);
	}
}

// To access one non static member or multiple non static members single object creation is sufficient.
