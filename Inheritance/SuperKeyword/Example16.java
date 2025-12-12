class Parent
{
	Parent(int a)
	{
		System.out.println("Inside 1 Arg Const - Parent Constructor");
	}
}
class Child extends Parent
{
	Child(int a)
	{
		System.out.println("Inside 1 Arg Const - Child Constructor");
	}
}
class Example16
{
	public static void main(String[] args)
	{
		new Child(10);
	}
}

/*
- By default, Java inserts a call to super() (the no-argument constructor) at the beginning of every constructor if you don’t specify one.
- But in your Parent class, there is no no-argument constructor — only a constructor that takes an int.
- The compiler tries to call super(); inside Child(int a), but it fails because Parent doesn’t have a no-arg constructor.
- If the parent class doesn’t have a default constructor, every child constructor must explicitly call one of the parent’s constructors using super(...).
- Otherwise, compilation fails.
*/
