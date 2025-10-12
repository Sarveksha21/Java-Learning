/*
Pattern: 3 
		 3 2
		 3 2 1  
*/

class Pattern4
{
	public static void main (String[] args)
	{
		for(int i=3; i>=1; i--)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}	
		System.out.println("Stop");
	}
}
