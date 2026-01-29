class Exception37
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
	static void rtoOffice() throws InterruptedException
	{
		System.out.println("Inside RTO Office");
		rtoAgent();
	}
	public static void main(String[] args) [
	{
		System.out.println("Start");
		try
		{
				rtoOffice();
		}
		catch (InterruptedException ie)
		{
		}
		System.out.println("Stop");
	}
}

// Throws keyword is applicable to "checked exception"