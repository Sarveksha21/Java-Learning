
class Dowhile4
{
	public static void main (String[] args)
	{
		int i=1;
		do
		{
			System.out.print("Do while i = "+i);
		}
		while(System.out.print("Inside while loop "));	// this error will display: "void cannot be converted to boolean"
	}
}

/*
	-In the do while loop, if we do not set any condition, then complier will not set any condition.
	-This means, the while condition is mandatory.
	-Statements are not allowed within condition.
*/