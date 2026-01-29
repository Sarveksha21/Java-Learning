class Hdfc
{
	int amountBal;
	Hdfc(int amountBal)
	{
		if(amountBal>10000)
		{
			this.amountBal = amountBal;
			System.out.println("Account Successfully Created");
		}
		else
		{
			throw new ArithmeticException("Please Enter Valid Amount");
		}
	}
}

class Exception42
{
	public static void main(String[] args)
	{
		Hdfc cust1 = new Hdfc(1000);
	}
}