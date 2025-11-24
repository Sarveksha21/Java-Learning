/* 
	Constructors: They can be defined as Special methods which are meant to perform operations.
	Constructor creation rules:
	i) Constructor name should be same as ClassName.
	ii) Constructor can accept arguments.
	iii) Constructor do not have a returntype.
*/

class Example1
{
	Example1()
	{
		System.out.println("Inside Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example1 ref1 = new Example1();	// Constructor are executed during object creation.
		System.out.println("Stop");
	}
}

/*
	here,
	Example1 -> Class Name
	ref1	 ->	Reference Variable
	=		 -> Assigment Operator
	new		 -> Keyword
	Example()-> Constructor
	;		 -> end of statement
*/
	
