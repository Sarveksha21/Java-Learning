/*
Pattern:
	1
	2 3
	4 5 6
*/

class For12
{
	public static void main (String[] args)
	{
		int k=1;
		System.out.println("Start");
		for(int i=1; i<=3; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" "+k);
				k++;
			}
			System.out.println();
		}
		System.out.println("Stop");
	}
}
