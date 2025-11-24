class Sample
{
	Sample()
	{
		System.out.println("Inside Sample Constructor");
	}
}
class Example6
{
	Example6()
	{
		System.out.println("Inside Example6 Constructor");
	}
	public static void main(String[] args)
	{
		System.out.println("Start");
		Example6 ref = new Example6();	// object creation
		Sample s1 = new Sample();		// object creation
		System.out.println("Stop");
	}
}

// To execute constructors from the same class or from the different class, we need to create an object