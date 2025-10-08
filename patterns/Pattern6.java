// Number Triangle Pattern
// Prints a right-angled triangle with numbers in increasing row order, aligned to the right.

/*
Pattern:      
		1 
	   2 2 
	  3 3 3 
     4 4 4 4 
	5 5 5 5 5  
*/

class Pattern6
{
	public static void main(String[] args)
	{
			int num = 5;
			System.out.println("Start");
			for(int i=1; i<=num;i++)
			{
				for(int j=1; j<=num-i; j++)
				{
					System.out.print(" ");
				}
				for(int j=1; j<=i;j++)
				{
						System.out.print(i+" ");
				}
				System.out.println();
			}		
			System.out.println("Stop");
	}
}