// Number-Increasing Reverse Pyramid

/*
Pattern: 1 2 3
		 1 2
		 1  
*/

class Pattern3
{
	public static void main (String[] args)
	{
		for(int i=3; i>=1; i--)
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
