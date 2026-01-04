interface AxisBankAcc
{
	void bankAcc();
}
interface AxisBankLoans
{
	void bankLoans();
}
class Kyc
{
	void adhaar()
	{
		System.out.println("Adhaar Number: 1234567890");
	}
}
class Customer extends Kyc implements AxisBankAcc, AxisBankLoans
{
	public void bankAcc()
	{
		System.out.println("Inside Savings Bank Account");
	}
	public void bankLoans()
	{
		System.out.println("Inside Bank Personal Loans");
	}
}
class Ex20
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Customer c1 = new Customer();
		c1.adhaar();
		c1.bankAcc();
		c1.bankLoans();
		System.out.println("Stop");
	}
}

/*
	- It is possible for a class to extends another class(only one class) & implements multiple interfaces.
	- Rule is we have to use "extends" first & then go for "implements".
	- but it is invalid to use "implements" first & then go for "extends".
*/