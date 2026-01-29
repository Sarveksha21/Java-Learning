class Flipkart	
{
	void getProdQty(int qty) //throws CurrentlyUnavaliableException
	{
		if(qty>=1 && qty<=10)
		{
			System.out.println("Purchase the Product");
		}
		else
		{
			throw new CurrentlyUnavaliableException("Currently Product is Unavailable");
		}
	}
}
class Exception44
{	
	public static void main(String[] args) //throws CurrentlyUnavaliableException
	{
		Flipkart cust1 = new Flipkart();
		cust1.getProdQty(15);
	}
}