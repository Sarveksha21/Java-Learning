class Parent
{
	Parent()
	{
		System.out.println("Inside 0 Args Const - Parent");
	}
	Parent(int a)
	{
		System.out.println("Inside 1 Args Const - Parent");
	}	
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Inside 0 Args Const - Child");
	}
}
class Example15
{
	public static void main(String[] args)
	{
		new Child();
	}
}

// "super()" statement set by the compiler will be responsible to call parent class zero argument constructor.