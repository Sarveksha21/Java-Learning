class Inherit7
{
	public static void main(String[] args)
	{
		final int a=100;
		a=200;
		System.out.println("Value of a = "+a);
	}
}

/*
	- The "final" keyword is also called as modifier.
	- A variable by nature can change its value multiple times.
	- But if we want to make the variable behave as a constant, then it can be assign the value one time only.
	- To make the variable behave as constant we have to prefix it keyword called as "final".
*/