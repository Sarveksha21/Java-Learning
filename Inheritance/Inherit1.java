class Demo
{
	int a = 10;
}
class Sample extends Demo
{
	float b = 20.5f;
}
class Inherit1
{
	public static void main(String[] args)
	{	
		System.out.println("Start");
		Demo d = new Demo();
		System.out.println("Value of a inside Demo class = "+d.a);
		//System.out.println("Value of b inside Demo class = "+d.b);	// this will not get execute 
		System.out.println("-------------");
		
		Sample s = new Sample();
		System.out.println("Value of b inside Sample class = "+s.b);
		System.out.println("Value of a inside Sample class = "+s.a);
		System.out.println("Stop");
	}		
}

/*
	i) Variables are part of Inheritance
	ii) Methods are also part of Inheritance
	iii) Java does support the concept of Single Inheritance
*/