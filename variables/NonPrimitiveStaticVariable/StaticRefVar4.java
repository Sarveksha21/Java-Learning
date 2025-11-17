class Cyber
{
	int a = 100;				// non-static variable
}
class Success
{
	float b = 200.5f;			// non-static variable
}
class Training
{
	static Cyber ref1;			// Non-Primitive static reference variable/classtype
	static Success ref2;		// Non-Primitive static reference variable/classtype
}
class StaticRefVar4
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Training.ref1 = new Cyber();	//here, we are access static member of other 'Training' class using classname
		Training.ref2 = new Success();	//here, we are access static member of other 'Training' class using classname
		System.out.println(Training.ref1.a);	// It will access "a" variable using "ref1", which is present inside "Training" class
		System.out.println(Training.ref2.b);	// It will access "b" variable using "ref2", which is present inside "Training" class
		System.out.println("Stop");
	}
}