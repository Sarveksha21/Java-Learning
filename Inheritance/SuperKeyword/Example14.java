class Parent
{
	Parent()
	{
		System.out.println("Inside 0 Arg Const - Parent");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Inside 0 Arg Const - Child");
		super();
	}
}	
class Example14
{
	public static void main(String[] args)
	{
		new Child();
	}
}

// This program will not get executed
// because, "super()" statement should always be the first statement.
