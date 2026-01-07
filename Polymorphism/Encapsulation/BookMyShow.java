class Pvrmovies
{
	static private Pvrmovies mTicket;
	static private boolean ticketStatus = false;
	private Pvrmovies()
	{
		System.out.println("Welcome to Pvrmovies");
	}
	public static Pvrmovies bookTicket()
	{	
		if(ticketStatus == false)
		{
			mTicket = new Pvrmovies();
			ticketStatus=true;
		}
		return mTicket;
	}
}
class BookMyShow
{
	public static void main(String[] args)
	{
		Pvrmovies mTicket1 = Pvrmovies.bookTicket();
		System.out.println(mTicket1);
		mTicket1 = Pvrmovies.bookTicket();
		System.out.println(mTicket1);
	}
}

// The reason constructorss are made private because, it will not allow it object to be created in other classes.