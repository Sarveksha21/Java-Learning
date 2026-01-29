class Exception36
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
	public static void main(String[] args) 
	{
		System.out.println("Start");
		rtoOffice();
		System.out.println("Stop");
	}
}