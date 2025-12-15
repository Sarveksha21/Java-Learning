class Parent
{
	int a=10;
}
class Child extends Parent
{
	int a=100;
}
class Example29
{
	public static void main(String[] args)
	{
		Parent p = new Child();
		System.out.print(p.a);
	}
}


//Methods are part of polymorphic behaviour as well as overriding but variables are not part polymorphic behaviour as well as overriding