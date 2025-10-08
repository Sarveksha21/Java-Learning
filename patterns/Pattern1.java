// Number-Increasing Pyramid Pattern 
// Prints a pyramid where each row contains numbers from 1 to the row number.

/*
Pattern: 1
		 1 2
		 1 2 3
*/

class Pattern1
{
	public static void main(String[] args)
	{
	System.out.println("Start");
	for(int i=1; i<=3; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(" "+j);
		}
		System.out.println();
	}
	
	System.out.println("Stop");
	}
}