class Parent
{
	int a=10;
}
class Child extends Parent
{
	float b=20.5f;
}	
class Example18
{
	public static void main(String[] args)
	{
		Parent p = new Child();		// upcasting, here child is behaving as parent, and child will loose child's behaviour
		System.out.println(p.a);
		Child c = (Child)p;		//downcasting
		System.out.println(c.b);
		System.out.println(c.a);
	}
}
//Whenever any object is upcasted, it will lose characteristics of child and occur characteristics of parent.
//Downcasting is a process of making the parent behave as a child (whatever is upcasted only can be downcasted)

// Upcasting: A child object behaving as a parent auch process is called as Upcasting.
// DownCasting:	A child object behaving as a child and then behaving back as child, such a process is called as downcasting
//(only whatever is upcasted can be downcasted, direct downcasting is not possible)
