class RedBus	
{
	String redBusDest = "Waynad";
	void checkBusAvailability(String custDest)
	{
		if(redBusDest.equals(custDest))
		{
			System.out.println("Bus is Available");
		}
		else
		{
			throw new NoBusFoundException();
		}
	}
}
class Exception45
{	
	public static void main(String[] args) //throws CurrentlyUnavaliableException
	{
		RedBus cust1 = new RedBus();
		cust1.checkBusAvailability("Pondicherry");
	}
}