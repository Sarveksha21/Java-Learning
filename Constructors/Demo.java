/* 
Assignment Question:
i) Class A -> having two constructors
ii) Class B -> having two constructors
iii) Class Demo -> calling all 4 construction during object creation of class A & B
*/
class A
{
	A()
	{
		this(10);
		System.out.println("Inside 0 Argument Constructor A");
	}
	A(int x)
	{
		System.out.println("Inside 1 Argument Constructor A");
		System.out.println("Value of x = "+x);
	}
}
class B
{
	B()
	{
		this(12.34f);
		System.out.println("Inside 0 Argument Constructor B");
	}
	B(float y)
	{
		System.out.println("Inside 1 Argument Constructor B");
		System.out.println("Value of y = "+y);
	}
		
}
class Demo
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		A ref1 = new A();
		B ref2 = new B();
		System.out.println("Stop");
	}
}