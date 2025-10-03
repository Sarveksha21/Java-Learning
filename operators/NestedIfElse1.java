class NestedIfElse1
{
	public static void main (String[] args)
	{
		char prod = 'P';
		int prodQty = 28;
		if(prod=='M' || prodQty=='L')
		{
			if(prodQty>=25)
			{
				System.out.println("Purchase the product");
			}
			else
			{
				System.out.println("Wait for updated Stock");
			}
		}
		else
		{
			System.out.println("Products are not available");
		}
	}
}
