class Flipkart
{
	void getProdStatus(boolean locStatus)
	{
		if(locStatus==true)
		{
			System.out.println("Do you what to Add to Cart");
		}
		else
		{
			throw new NotDeliverableException();
		}
	}
}
class Exception43
{
	public static void main(String[] args)
	{
		Flipkart cust1 = new Flipkart();
		cust1.getProdStatus(false);
	}
}