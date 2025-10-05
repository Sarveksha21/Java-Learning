
/*	Ex5: Product of Two Numbers

	Write a Java program that takes two numbers as input and displays the product of two numbers.
	Test Data: 
		Input first number: 25
		Input second number: 5
	Expected Output : 25 x 5 = 125
			
*/
import java.util.Scanner;
class Ex5
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);				// Create a Scanner object to read input from the user
		
		System.out.print("Input the first number: ");		// Prompt the user to input the first number
		int a = input.nextInt();							// Read and store the first number
		
		System.out.print("Input the second number: ");		// Prompt the user to input the second number
		int b = input.nextInt();							// Read and store the second number
		
		int d = a * b;
		System.out.println("The Product of a and b is: " + d);
	}
}

/*
	In the exercise above:
		-The above Java code takes two integer numbers as input from the user, performs mutiplication, and displays the result.
		-It uses the "Scanner" class for input, divides 'a' by 'b', and prints the result as "The mutiplication of a and b is: [result]."
*/