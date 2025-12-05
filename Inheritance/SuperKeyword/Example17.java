class Parent // 6
{
	Parent()			//7
	{
		this(10);		//this will go to Parent(int a)   //8
		System.out.println("Inside 0 Arged Parent Constructor"); //11
	}
	Parent(int a)		//9
	{
		System.out.println("Inside 1 Arged Parent Constructor");// 10
	}
}
class Child extends Parent
{
	Child()			// control will start from child constructor  //2
	{
		this(10);	// this will go to child(int a) line no.20	//3
		System.out.println("Inside 0 Arged Child Constructor"); //13
	}
	Child(int a)	//4
	{
		super();//	it will go to parent() of Parent class //5
		System.out.println("Inside 1 Arged Child Constructor");	//12
	}
}	
class Example17
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Child ref1 = new Child();		// 1
		System.out.println("Stop");
	}
}