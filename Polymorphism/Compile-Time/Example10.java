class Example10
{
	public static void main(String[] args)
	{
		System.out.println(10+20);				// Addition -> 30
		System.out.println("Cyber"+25);			// Concatenation -> Cyber25
		System.out.println("Cyber"+"Success");	// Concatenation -> CyberSuccess
	}
}

/*
	Operator Overloading:
	1) An Operator having more than one behaviour is called as Operator Overloading.
	2) Java doesn't support operator overloading except "+" operator.
	3) The "+" operator can either perform addition or can perform contenation.
	4) When the "+" operator has both the inputs in numberic format, it will perform addition.
	5) But, if the "+" operator has both the inputs in "String" format or one of the input in "String" format, 
		it will perform concatenation.
*/
