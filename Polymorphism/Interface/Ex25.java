interface It1
{
	int a=100;	// It is internally public & static
}
class Ex25 implements It1
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		System.out.println(a);
		System.out.println("Stop");
	}
}
		
//Variables declared within an Interface is by nature are "Public+Static+Final".
