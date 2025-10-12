
/*	
	Ex12: Multiplication Table in Reverse Order
	
	Write a program that prints the multiplication table of a given number in reverse order.
	
	Test Data: 
			Enter number: 6
	Expected Output :                                                                                              
			6 X 10 = 60
			6 X 9 = 54
			6 X 8 = 48
			6 X 7 = 42
			6 X 6 = 36
			6 X 5 = 30
			6 X 4 = 24
			6 X 3 = 18
			6 X 2 = 12
			6 X 1 = 6
			
*/

import java.util.Scanner;
class Ex12
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number = ");
		int num = in.nextInt();
		
		for(int i=10; i>=1; i--)
		{
			int cal = num*i;
			System.out.println(num+" X "+i+" = "+cal);
		}
	}
}