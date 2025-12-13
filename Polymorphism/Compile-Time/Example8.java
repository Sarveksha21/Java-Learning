class Demo
{
	Demo(char x, boolean y)
	{
		System.out.println("Inside Char, Boolean Arg");
	}
	Demo(boolean x, char y)
	{
		System.out.println("Inside Boolean, Char Arg");
	}
}
class Example8
{
	public static void main(String[] args)
	{
		Demo d = new Demo(true,'s');
	}
}

/*
	Constructor Overloading:
	Rule3: Constructor name should remain the same, can have same number of arguments, also can have same type of the argument, 
	       but should vary in the sequence of the argument
*/