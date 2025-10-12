
/*	Ex6: Basic Arithmetic Operations

	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
	Test Data: 
		Input first number: 125
		Input second number: 24
	Expected Output : 
		125 + 24 = 149
		125 - 24 = 101
		125 x 24 = 3000
		125 / 24 = 5
		125 mod 24 = 5
			
*/

import java.util.Scanner;
public class Ex6
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);			// Create a Scanner object to read input from the user
			
		System.out.print("Input first number = ");		// Prompt the user to input the first number
		int a = in.nextInt();							// Read and store the first number  
		//int num2 = in.nextInt();
		
		System.out.print("Input second number = ");		// Prompt the user to input the first number
		int b = in.nextInt();							// Read and store the first number

		System.out.println(a+" + "+b+" = "+(a+b));		//Addition
		System.out.println(a+" - "+b+" = "+(a-b));		//Substraction
		System.out.println(a+" * "+b+" = "+(a*b));		//Multiplication
		System.out.println(a+" / "+b+" = "+(a/b));		//Division
		System.out.println(a+" mod "+b+" = "+(a%b));	//Modulus
	}
}
