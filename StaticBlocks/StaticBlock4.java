/*
	Static Blocks if they are part of main class then bydefault they will get executed at a start during classloading 
	but we executed at a start during classloading from another class, the only way to executed them is by accessing
	the member of that class or by object creation.
*/ 
class Demo
{
	int a=10;
	static
	{
		System.out.println("Inside Static Block");
	}
}
class StaticBlock4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo ref1 = new Demo();
		System.out.println("Value of a = "+ref1.a);
		System.out.println("Stop");
	}
}
