
/*	Ex7: Addition of three number

	Write a program that performs arithmetic operations on three numbers instead of two.
	Test Data: 
		Input first number: 10
		Input second number: 20
		Input third number: 15
	Expected Output : 
		Addition of three number = 45
			
*/

import java.util.Scanner;
public class Ex7
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter first number = ");
		int num1 = in.nextInt();
		
		System.out.print("Enter second number = ");
		int num2 = in.nextInt();
		
		System.out.print("Enter third number = ");
		int num3 = in.nextInt();
		
		int result = num1 + num2 + num3;
		System.out.println("Addition of three numbers = "+(num1 + num2 + num3));
		System.out.println("Substraction of three numbers = "+(num1 - num2 - num3));
		System.out.println("Multiplication of three numbers = "+(num1 * num2 * num3));
		System.out.println("Division of three numbers = "+(num1 / num2 / num3));
		System.out.println("Modulus of three numbers = "+(num1 % num2 % num3));
	}
}