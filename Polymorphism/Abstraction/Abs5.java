abstract class HdfcMobileApp
{
	abstract int checkBalance();	// incomplete method
}
class HdfcServer extends HdfcMobileApp
{
	int amountBal;
	HdfcServer(int amountBal)
	{
		this.amountBal = amountBal;
		System.out.println("Account has been successfully created");
	}
	int checkBalance()
	{
		System.out.println("Please wait retriving your Balance");
		return amountBal;
	}
}
class Abs5
{
	public static void main(String[] args)
	{
		HdfcMobileApp cust1 = new HdfcServer(100000);
		int currentBal = cust1.checkBalance();
		System.out.println("Current Balance = "+currentBal);
	}
}