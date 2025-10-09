/*
Pattern: 3 
		 2 2
		 1 1 1  
*/

class Pattern5
{
	public static void main (String[] args)
	{
		for(int i=3; i>=1; i--)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}	
		System.out.println("Stop");
	}
}
