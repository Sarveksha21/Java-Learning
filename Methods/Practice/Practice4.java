class Cyber			// Multi-class
{
	int a = 10;		// non-static variable 
}
class Practice4
{
	float b = 20.5f;					// non-static variable 
	static float result;				// static variable 
	public static void main(String[] args)
	{
		Cyber c = new Cyber();			//Object creation of "Cyber" class	
		Practice4 p = new Practice4();	//Object creation of "Practice4" class
		result = c.a+p.b;
		System.out.println("Result = "+result);
	}
}
