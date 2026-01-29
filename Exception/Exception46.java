class MMT	
{
	String mmtDestFlight = "Sydney";
	String custDestFlight;
	void checkFlightAvailability(String custDestFlight)
	{
		this.custDestFlight = custDestFlight;
		if(mmtDestFlight.equals(custDestFlight))
		{
			System.out.println("Flight is Available");
		}
		else
		{
			throw new NoFlightFoundException("Flight are not available at "+custDestFlight);
		}
	}
}
class Exception46
{	
	public static void main(String[] args) //throws CurrentlyUnavaliableException
	{
		MMT cust1 = new MMT();
		cust1.checkFlightAvailability("Singapore");
	}
}