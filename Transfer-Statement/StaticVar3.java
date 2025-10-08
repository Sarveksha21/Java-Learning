// Example of Static variable

class StaticVar3
{	
	static float result;		// static variable
	public static void main (String[] args)
	{
		int var1 = 67;	// local variable
		float var2 = 35.534f;	// local variable
		result = var1 + var2;
		System.out.println("Result = "+result);
	}
}

// we can't use static keyword for local variables.