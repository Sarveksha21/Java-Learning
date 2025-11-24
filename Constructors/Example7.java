// Constructors are executed during object creation, hence they are very closely connected to the non-static context.

/*
	Interview Question: In Real-time, can you tell me when do we use constructors?
	Constructor are primarly used for two reasons:
	i) To initalize the non-static variable during object creation.
	ii) To implement the bussiness logic during object creation.
*/

// first point explaination based program:

class Example7
{
	int a;		// At starting the value of a=0;
	Example7()
	{
		System.out.println("Inside Constructor the value of a = "+a);
		a = 100;		// here value of 'a' get initialize
		System.out.println("Inside Constructor the value of a = "+a);

	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println("Value of a = "+a);
		Example7 ref = new Example7();
		System.out.println("Value of a = "+ref.a);
		System.out.println("Stop");
	}
}