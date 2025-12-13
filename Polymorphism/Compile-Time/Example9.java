class Hdfc
{
	Hdfc(String custName)
	{
		System.out.println("Saving Account of "+custName+" has been created");
	}
	Hdfc(String custName, String orgName)
	{
		System.out.println("Saving Account of "+custName+" has been created for "+orgName);
	}
}
class Example9
{	
	public static void main(String[] args)
	{
		//Hdfc h1 = new Hdfc("Artha");
		Hdfc h1 = new Hdfc("Artha","ICICI Bank");

	}
}