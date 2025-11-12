class NonPrimitive1		// classname
{
	int a = 100;		// non-static variable
	float b = 200.5f;	// non-static variable
	public static void main(String[] args)
	{
		NonPrimitive1 ref = new NonPrimitive1();	//"NonPrimitive1" is a local variable because it created under main method()
		System.out.println(ref.a);
		System.out.println(ref.b);
	}
}

// int a=10; a-> primitive -> data -> data type
// NonPrimitive1 ref = new NonPrimitive1(); ->nonprimitive -> address -> classtype