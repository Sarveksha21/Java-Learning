// Example of Static Variables:

class StaticVar1
{
	static int a = 100;			//Declaring and initializing static variable
	public static void main (String[] args)
	{
		System.out.println("Start");
		System.out.println("Direct access of static variable = "+a);							// direct access
		System.out.println("Access through Classname of static variable = "+StaticVar1.a);		//classname
		System.out.println("Stop");

	}
}
	