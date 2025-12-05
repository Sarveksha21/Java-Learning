class Parent
{
	{
		System.out.println("Inside Instance/NonStatic Block  : Parent"); //2
		
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Inside 0 Arg Const : Child"); //4
		
	}
}
class Example20
{
	public static void main(String[] args)
	{
		new Child();
	}
}