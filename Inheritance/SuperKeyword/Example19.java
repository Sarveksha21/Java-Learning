class Parent
{
	Parent()
	{
		System.out.println("Inside 0 Arg Const : Parent"); //2
		
	}
}
class Child extends Parent
{
	{
		System.out.println("Inside  Instance/NonStatic Block : Child"); //4
		
	}
}
class Example19
{
	public static void main(String[] args)
	{
		new Child();
	}
}