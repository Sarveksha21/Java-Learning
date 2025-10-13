
/*	
	Ex13: Multiplication Table from 1 to 10.
	
	Write a program that prints the multiplication table of a given number in reverse order.
			
*/

import java.util.Scanner;
class Ex13
{
	public static void main (String[] args)
	{
		for(int i=1; i<=10; i++)
		{
			for(int j=1; j<=10; j++)
			{
				int cal = i*j;
				System.out.println(i+" X "+j+" = "+cal);		
			}
			System.out.println();
		}
	}
}