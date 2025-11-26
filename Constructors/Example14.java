/*
	What are the difference types of constructors?
	There are mainly 3 types of constructors:
	i) Default Constructor
	ii) 0 Argument Constructor
	iii) 1 Argument Constructor
*/
class Example14
{	
	Example14(int a)
	{
		System.out.println("Inside 1 Argument Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example14 ref = new Example14();
		System.out.println("Stop");
	}
}

// If we create "any" constructor, then the complier will "not" create "default, zero argument & empty implementation" constructor