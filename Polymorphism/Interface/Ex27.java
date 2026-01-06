class Flipkart //implements Cloneable
{
	int flipkartId;
	String flipkartCustName;
	Flipkart(int flipkartId, String flipKartCustName)
	{
		this.flipkartId = flipkartId;
		this.flipkartCustName = flipkartCustName;
	}
	protected Object clone()
	{
		try
		{
			return super.clone();
		}
		catch (CloneNotSupportedException cs)
		{
			return this;
		}
	}
}

class Ex27
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Flipkart cust1 = new Flipkart(101, "Saru");
		Flipkart cust2 = (Flipkart)cust1.clone();
		System.out.println(cust1);
		System.out.println(cust2);
		System.out.println(cust2.flipkartId+" - "+cust2.flipkartCustName);
		System.out.println("Stop");
	}
}




/* Important Note: Marker Interface
	Marker Interface are interfaces, they are menat to perform special operations & the power to perform this special operations
	is giving by JVM during runtime.
	- javap java.lang.Cloneable
	- javap java.io.Serializable
	- javap java.util.RandomAccess
*/