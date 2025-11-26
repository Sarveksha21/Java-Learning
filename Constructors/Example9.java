class Hdfc
{
	int amountBal;
	Hdfc(int amountBal)
	{
		if(amountBal>=10000)		// here, "if-else" condition is the basic business logic applied in the program
		{
			System.out.println("Account is created Successfully.");
		}
		else
		{
			System.out.println("Invalid Amount, pleasee re-enter valid amount");
		}
	}
}
class Example9
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Hdfc ref = new Hdfc(15000);
		System.out.println("Stop");
	}
}

// Construct are also used to implement the basic logic during object creation