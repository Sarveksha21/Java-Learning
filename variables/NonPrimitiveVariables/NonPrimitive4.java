class NonPrimitive4
{
	float x=20.5f;
	static NonPrimitive4 m1()
	{
		System.out.println("Inside m1 method");
		NonPrimitive4 ref = new NonPrimitive4();	// local variable named "NonPrimitive4" is created 
		System.out.println(ref.x);
		return ref;		// we are returning ref value having classtype "NonPrimitive4" 
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonPrimitive4 ref1 = m1();
		System.out.println("Inside main = "+ref1.x);	// pass by reference
		System.out.println("Stop");
	}
}