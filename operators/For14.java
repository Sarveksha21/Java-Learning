/*
Pattern : 
		 4 5 6 
		 2 3
		 1
*/

class For14
{
	public static void main(String[] args)
	{
		int k=6;
		System.out.println("Start");
		for(int i=3; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+k);
				k--;
			}
			System.out.println();
		}
		System.out.println("Stop");
	}
}		

































