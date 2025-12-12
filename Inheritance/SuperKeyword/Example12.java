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
		super();
		System.out.println("Inside 0 Arg Const - Child");
	}
}	
class Example12
{
	public static void main(String[] args)
	{
		new Child();
	}
}