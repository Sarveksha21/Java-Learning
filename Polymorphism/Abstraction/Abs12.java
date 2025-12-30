abstract class Demo
{
	Demo()		// constructor
	{
		System.out.println("Inside Demo - 0 Args Const");
	}
}
class Sample extends Demo
{
	Sample()	// constructor
	{
		System.out.println("Inside Sample - 0 Arg Const");
	}
	Sample(int a)	// constructor
	{
		System.out.println("Inside Sample - 1 Arg Const");
	}
}
class Abs12
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		new Sample();
		new Sample(100);
		System.out.println("Stop");
	}
}

/*
	- we can create more than 1 constructor in Sample class(child class)
	- firstly, when Sample() is called, it will go to Sample class inside it will search for Sample()
	- Sample() will see is there any inheritansce happening for Sample class
	- if no inheritance happens it will go back to Sample() directly & print content inside Sample().
	- if inheritance is present, it will go to the Demo class(parent) & print content inside Demo() & after that go back to the Sample class.
	- Same steps happens with the Sample(100) also.
*/