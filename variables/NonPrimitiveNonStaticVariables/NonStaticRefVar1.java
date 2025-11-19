/*
	here, I want to access the value of non-static variable 'a' from class "NonStaticRefVar1" using 
    non-static non-primitive reference variable named "NonStaticRefVar1 refvar"
*/

class NonStaticRefVar1
{
	int a = 10;					// non-static variable
	NonStaticRefVar1 refvar;	// non-static non-primitive referene variable  // refvar=null, at initial stages
	public static void main(String[] args)
	{
		System.out.println("Start");
		NonStaticRefVar1 retval = new NonStaticRefVar1(); //here, retval will store the value of 'a' & 'refvar' non-static members
		retval.refvar = new NonStaticRefVar1();	// here, 'retval.refvar' will store the value of 'a'&'refvar' and will get updated
		System.out.println(retval.refvar.a);
		System.out.println("Stop");
	}
}

/*
	At line9 value of refvar=null, then in line14 "refvar" work as an address to store the value of all non-static members 
	of NonStaticRefVar1 class
*/