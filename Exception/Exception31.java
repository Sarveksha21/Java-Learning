class Exception31
{
	static void rtoOfficer()
	{
		System.out.println("Inside RTO Officer");
		try
		{
			Thread.sleep(3000);
			System.out.println("Things are handled");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Alternate way to handle");
		}
	}
	static void rtoAgent()
	{
		System.out.println("Inside RTO Agent");
		rtoOfficer();
	}
	static void rtoOffice()
	{
		System.out.println("Inside RTO Office");
		rtoAgent();
	}
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Start");
		rtoOffice();
		System.out.println("Stop");
	}
}