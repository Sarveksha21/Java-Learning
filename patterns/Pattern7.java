// Number-Changing Pyramid Pattern
// Prints a pyramid where numbers increase continuously from top to bottom.
/*
Pattern: 
	1 
	2 3 
	4 5 6 
	7 8 9 10 
*/

class Pattern7
{
	public static void main (String[] args)
	{
		int k=1;
		System.out.println("Start");
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
		System.out.println("Stop");
	}
}