/*
Pattern:
	1 
	1 2
	1 2 3
*/

class For15
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