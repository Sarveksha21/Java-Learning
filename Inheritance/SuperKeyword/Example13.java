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
	}
}	
class Example13
{
	public static void main(String[] args)
	{
		new Child();
	}
}

// If we don't use "super()" statement, then the compiler will set the super() statement.
