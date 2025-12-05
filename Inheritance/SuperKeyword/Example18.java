class Parent
{
	{
		System.out.println("Inside Instance/NonStatic Block : Parent"); //1
		
	}
	Parent()
	{
		System.out.println("Inside 0 Arg Const : Parent"); //2
		
	}
}
class Child extends Parent
{
	{
		System.out.println("Inside Instance/NonStatic Block Instance/NonStatic Block : Child"); //3
		
	}
	Child()
	{
		System.out.println("Inside 0 Arg Const : Child"); //4
		
	}
}
class Example18
{
	public static void main(String[] args)
	{
		new Child();
	}
}

/*
	- Under the concept of Inheritance, we create object of the Child Constructor, it will check if inheritance is present or not.
	- If it is present the control, will go to the Parent Constructor again in Parent Class, it will check Instance Block in the parent and
	- Once the Parent Constructor gets executed then control comes to Child Constructor 
	- Child Constructor will check whether inside Child Class do we have Instance Block is present or not
	- If present it will execute that & only after then Child Class Constructor will get executed.
*/