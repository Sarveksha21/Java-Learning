interface Hsbc
{
	void banking();
	void finance();
	void insurance();
}
class AdapterClass implements Hsbc
{
	public void banking(){}
	public void finance(){}
	public void insurance(){}

}
class HsbcBanking extends AdapterClass
{
	public void banking()
	{
		System.out.println("Banking Logics Implemented");
	}
}
class Ex26 
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		HsbcBanking cust1 = new HsbcBanking();
		cust1.banking();
		System.out.println("Stop");
	}
}

// "AdapterClass" provide are responsible to provide empty implementation to interface methods such classes are called as adapter classes.

