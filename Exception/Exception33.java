class Exception33
{
	static void rtoOfficer() throws InterruptedException
	{
		System.out.println("Inside RTO Officer");
		Thread.sleep(3000);
	}
	static void rtoAgent()
	{		
		System.out.println("Inside RTO Agent");
		try
		{
			rtoOfficer();
			System.out.println("Things are handled");
		}
		catch(InterruptedException ie)
		{
			System.out.println("Alternate way to handle");
		}
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