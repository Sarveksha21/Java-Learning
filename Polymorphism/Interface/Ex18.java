interface IciciBankAcc							// parent interface
	void bankAcc();
}
interface IciciBankLoans extends IciciBankAcc	// child interface
{
	void bankLoans();		//here this interface have both bankAcc() & bankLoans() methods
}
class Customer1 implements IciciBankAcc
{
	public void bankAcc()
	{
		System.out.println("Open Saving Bank Account");
	}
}
class Customer2 implements IciciBankLoans	//this class will execute only when both bankAcc() & bankLoans() methods are declared inside class
{
	public void bankAcc()
	{
		System.out.println("Open Saving Bank Account");
	}
	public void bankLoans()
	{
		System.out.println("Open Current Bank Account");
	}
}
class Ex18
{
	public static void main(String [] args)
	{
		System.out.println("Start");
		Customer1 c1 = new Customer1();
		c1.bankAcc();
		Customer2 c2 = new Customer2();
		c2.bankLoans();
		System.out.println("Stop");
	}
}

/*
	Requriments:
	1) Customer can open bank account
	2) Customer to get loans must have bank account 
*/