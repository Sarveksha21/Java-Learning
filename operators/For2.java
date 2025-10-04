// Write a java program to check, if number '3' is present while iterating from 1 to 5.

class For2
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		for(int i=1; i<=5; i++)
		{
			System.out.println("Value of i = "+i);
			if(i==3)
			{
				System.out.println(i+" is present");
				break;
			}
				
		}
		System.out.println("Stop");
	}
}

// As seen in the above program, the break statement will break the control within the loop & will move the control outside the loop.