//This is example of Data Hiding
class Hdfc
{
	private int amountBal;
	Hdfc(int amountBal)
	{
		this.amountBal = amountBal;
		System.out.println("Account is Successfully created");
	}
	public int getBalance()
	{
		System.out.println("Your request is in process .... kindly wait!");	
		return amountBal;
	}
	public int setBalance(int amount)
	{
		System.out.println("Fetching your balance.... is in Progress...");	
		if(amount>0)
		{
			amountBal = amountBal + amount;	// Deposit Amount
			System.out.println("Amount Deposit is Succcessful");	
			return amountBal;
		}
		else
		{
			return 0; //amountBal = amountBal - amount;	// Transfer Amount 
			
		}
	}
}
class En2
{
	public static void main(String[] args)
	{
		/*
		Hdfc c1 = new Hdfc();
		System.out.println(c1.amountBal);
		c1.amountBal = 100000;
		System.out.println(c1.amountBal);
		*/
		Hdfc c1 = new Hdfc(10000);
		int amountBal = c1.getBalance();
		System.out.println("Account Balance = "+amountBal);
		amountBal = c1.setBalance(5000);
		System.out.println("Account Balance = "+amountBal);
	}
}