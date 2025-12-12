class Flipkart
{
	void payment()
	{
		System.out.println("Pay By Cash");
	}
	void payment(int debt)
	{
		System.out.println("Pay By Debit/Credit Cash");
	}
	void payment(String upi)
	{
		System.out.println("Pay By UPI");
	}
	void payment(int netbankingID, String password)
	{
		System.out.println("Pay By Networking");
	}
}
class Example5
{
	public static void main(String[] args)
	{
		Flipkart cust = new Flipkart();
		cust.payment(12345);
		cust.payment("Payment Done");
	}
}