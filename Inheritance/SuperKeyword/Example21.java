class Parent
{
	static
	{
		System.out.println("Inside Static Block: Parent"); //2
	}
}
class Child extends Parent
{
	static
	{
		System.out.println("Inside Static Block: Child"); //4
	}
}
class Example21
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new Child();
		System.out.println("Stop");
	}

}
