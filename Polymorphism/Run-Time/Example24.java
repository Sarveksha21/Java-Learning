class Rbi
{
	void loans(){ System.out.println("ROI for loans @RBI should be 8%");} // ROT change according to the bankname
	final void processFees() { System.out.println("Mandatory 1% of Loan Amount");}
	//but processing fees for all banks should be same that's why we used "final" keyword to make it constant for other banks
}
class Hdfc extends Rbi
{
	void loans(){ System.out.println("ROI for loans @Hdfc should be 15%");}
}
class Icici extends Rbi
{
	void loans(){ System.out.println("ROI for loans @Icici should be 15.5%");}
	//void processFees() { System.out.println("5% of Loan Amount");} 
	//this processFees() will not work because we already fixed processFees for all banks should be same by Rbi (class) i.e "1%"
}	
class YesBank extends Rbi
{
	//void loans(){ System.out.println("ROI for loans @YesBank should be 14.5%");}
}	
class Example24
{
	public static void main(String[] args)
	{
		//In overriding, upcasting will not happen(child class unable to access parent class members) 
		// that why preference will go to child class
		Rbi cust1 = new Hdfc();
		cust1.loans();
		Rbi cust2 = new YesBank();
		cust2.loans();
		Rbi cust3 = new Icici();
		cust3.loans();
		cust3.processFees();
	}
}