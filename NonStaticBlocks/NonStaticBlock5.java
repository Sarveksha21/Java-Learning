class Demo
{
	{
		System.out.println("Inside Non-static block: Demo");
	}
}

class NonStaticBlock5
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Demo ref = new Demo();
		System.out.println("Stop");
	}
}

// To execute instance block same class or another class we need to create an object of that class.
