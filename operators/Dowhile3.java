
class Dowhile3
{
	public static void main (String[] args)
	{
		int i=1;
		do{
			System.out.println("Value of i = "+i);
			i++;
		}while();	// Here, condition is not present inside while(), that's why code will throw an error
	}
}
		
// It is mandatory, to use a condition in the do while loop.