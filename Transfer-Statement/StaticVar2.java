// Example of Static Variables:

class StaticVar2
{
	static int a = 100;				// Declaring and initializing static variable
	static float b = 200.5f;
	public static void main (String[] args)
	{
		float add;					// Declaring local variable 
		add = a + StaticVar2.b;		// Accessing variable 'b' using classname 'StaticVar2'
		System.out.println("Addition of two numbers = "+add);
	}
}

/*
	-The dot(.) operator in java is called as access modifier.
	-If we have to access a member with a specific area (class or object) then we have to use
	 (.) dot operator also called as access operator.
*/