class NonStaticRefVar2
{
	int a = 10;				    // non-static variable
	NonStaticRefVar2 refvar;	// non-static nonprimitive reference variable  // refvar=null, at initial stages
	void m1()					// non-static method
	{
		System.out.println("Inside m1 method = "+a);
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		
		NonStaticRefVar2 retval = new NonStaticRefVar2(); //here, retval will store the value of 'a' & 'refvar' non-static members
		retval.refvar = new NonStaticRefVar2();	 // here, 'retval.refvar' will store the value of 'a'&'refvar' and will get updated
		retval.refvar.m1();		
			
		System.out.println("Stop");
	}
}

/*
	At line4 value of refvar=null, then in line14 "refvar" work as an address to store the value of all non-static members 
	of NonStaticRefVar2 class
*/