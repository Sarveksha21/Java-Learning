// Example of Static variable

class StaticVar4
{		
	static int var1;	// Declaring static variable
	public static void main (String[] args)
	{
		var1 = 1000;	// Initializing static variable
		System.out.println("Result = "+var1);
	}
}
	
/*
	-It doesn't matter where the variable is initialize, what matter is where we declare the variable.
	-Hence, based on the declaration of variable, the variable will be categorized into 
	 local, static and non-static variables.
*/
