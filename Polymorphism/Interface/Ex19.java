interface HdfcBankAcc
{
	void bankAcc();
}
interface HdfcBankLoans
{
	void bankLoans();
}
interface HdfcFreeInsurance extends HdfcBankAcc, HdfcBankLoans
{
	void freeInsurance();
}
class Customer1 implements HdfcFreeInsurance
{
	public void bankAcc()
	{
			System.out.println("Inside Savings Bank Account");
	}
	public void bankLoans()
	{
			System.out.println("Inside Personal Bank Loans");
	}
	public void freeInsurance()
	{
			System.out.println("Inside Free Insurance");
	}
}
class Ex19
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Customer1 c1 = new Customer1();
		c1.bankAcc();
		c1.bankLoans();
		c1.freeInsurance();
		System.out.println("Stop");
	}
}

// It is possible to achieve multiple inheritance at Interface Level.