class Sys1
{
	static Sys1 a1;
	void p1(String info)
	{
		System.out.println(info);
	}
}
class StaticRefVar5
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Sys1.a1 = new Sys1();
		Sys1.a1.p1("Inside p1 method");
		System.out.println("Stop");
	}
}