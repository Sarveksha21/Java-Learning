/*
Pattern:
	*
	* *
	* * *
*/


class For10
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		for(int i=0; i<=2;i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(" *");   
			}
			System.out.println();
		}
		System.out.println("Stop");
	}
}
																