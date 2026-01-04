interface It1
{
	default void m1()
	{
		System.out.println("Inside m1 method");
	}
}
class Ex23
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		It1 i= new Ex23();	//here, overriding is not happening, that's why upcasting will happen.
		i.m1();
		System.out.println("Stop");
	}
}

//here, overriding is not happening, that's why upcasting will happen,but we don't have inheritance happening that's why upcasting will also not happen

/*
	- It is possible to create complete methods within an interface.
	- The complete methods can only be created whenever we use a "default" keyword.
	- The "default" keyword is only appliacble within an interface & is not part of access modifier.
*/