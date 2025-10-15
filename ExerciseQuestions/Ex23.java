/*	
	Ex23: Average of Numbers but ignores the lowest and highest values
	
	Write a program to compute the average of numbers until the user enters a negative number.
	
	Test Data: 
	Enter numbers (enter a negative number to stop) =
		10
		20
		30
		-7			
	Expected Output :              
		Average of entered numbers = 20.0

*/

import java.util.Scanner;
class Ex23
{
	public static void main(String[] args)
	{
		int count = 0;
		double sum = 0;
		double num;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter numbers (enter a negative number to stop) = ");
		
		while(true)					// infinite loop till negative value
		{
			num = in.nextDouble();
			if(num<0)				// stop if number is negative
			{
				break;
			}
			sum = sum + num;
			count++;
		}
		
		if(count>0)
		{
			double avg = sum / count;
			System.out.println("Average of entered numbers = "+avg);
		}
		else
		{
			System.out.println("No positive number were entered");
		}
	}
}
