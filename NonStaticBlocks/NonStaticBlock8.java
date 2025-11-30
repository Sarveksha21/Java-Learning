class NonStaticBlock8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Hdfc ref1 = new Hdfc(10000);
		ref1.getAmountBal();
		System.out.println("Stop");
	}
}
class Hdfc
{
	int amountBal;
	static		//Static Block
	{
		System.out.println("Logic to establish connection with Adhaar Server");
	}
	{			//Non-Static Block
		System.out.println("Logic to verify Adhaar ID & OTP");
	}
	Hdfc(int amountBal)		// Constructor
	{
		if(amountBal>=1000)
		{
			this.amountBal = amountBal;
			System.out.println("Account is Successfully Created");
		}
		else
		{
			System.out.println("Invalid Amount, Pleae re-ente valid amount");
		}
	}
	void getAmountBal()		// non-static method
	{
		System.out.println("Your Account Balance = "+amountBal);
	}
}

// To implement bussiness logic during th object creation.