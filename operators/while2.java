
//	Write a java program to print number in descending order 10 to 1 and check if number is present.

class while2
{
	public static void main (String[] args)
	{
		int i=10;
		System.out.println("Start");
		while(i>=1)
		{
			System.out.println("Value of i = "+i);
			if(i==5)
			{	
				System.out.println("5 is present");
				break;
			}
			i--;
		}
		System.out.println("Stop");
	}
}