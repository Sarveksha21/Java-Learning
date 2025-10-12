
/*	
	Ex11: Multiplication Table
	
	Write a Java program to print the multiplication table up to 20 instead of 10.
	
	Test Data: 
			Enter number: 4
	Expected Output :                                                                                              
			4 X 1 = 4				4 X 11 = 44
			4 X 2 = 8				4 X 12 = 48
			4 X 3 = 12				4 X 13 = 52
			4 X 4 = 16				4 X 14 = 56
			4 X 5 = 20				4 X 15 = 60
			4 X 6 = 24				4 X 16 = 64
			4 X 7 = 28				4 X 17 = 68
			4 X 8 = 32				4 X 18 = 72
			4 X 9 = 36				4 X 19 = 76
			4 X 10 = 40				4 X 20 = 80
			
*/

import java.util.Scanner;
class Ex11
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number = ");
		int num = in.nextInt();
		for(int i=1; i<=20; i++)
		{
			int cal = num*i;
			System.out.println(num+" X "+i+" = "+cal);
		}																																										
	}
}