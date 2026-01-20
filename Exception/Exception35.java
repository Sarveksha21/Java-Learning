class Exception35
{
	static void rtoOfficer() throws InterruptedException
	{
		System.out.println("Inside RTO Officer");
		Thread.sleep(3000);
	}
	static void rtoAgent() throws InterruptedException
	{
		System.out.println("Inside RTO Agent");
		rtoOfficer();
	}
	static void rtoOffice()
	{
		System.out.println("Inside RTO Office");
		try
		{
			rtoAgent();
		}
		catch (InterruptedException ie)
		{
		}
		
	}
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Start");
		rtoOffice();
		System.out.println("Stop");
	}
}