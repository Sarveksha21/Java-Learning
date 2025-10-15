/*	
	Ex21: Average of Three Numbers
	
	Write a Java program that takes five numbers as input to calculate and print the average of the numbers.
	
	Test Data: 
		Enter value of number1 = 10
		Enter value of number2 = 20
		Enter value of number3 = 30
		Enter value of number4 = 40
		Enter value of number5 = 50
	Expected Output :                                                                                              
		Average of five numbers = 30.0
			
*/

import java.util.Scanner;
class Ex21
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of number1 = ");
		int num1  = in.nextInt();
		System.out.print("Enter value of number2 = ");
		int num2  = in.nextInt();
		System.out.print("Enter value of number3 = ");
		int num3  = in.nextInt();
		System.out.print("Enter value of number4 = ");
		int num4  = in.nextInt();
		System.out.print("Enter value of number5 = ");
		int num5  = in.nextInt();
		
		double avg = (num1+num2+num3+num4+num5)/5;
		System.out.println("Average of five numbers = "+avg);
	}
}