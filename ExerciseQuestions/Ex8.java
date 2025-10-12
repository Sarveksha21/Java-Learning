
/*	Ex8: Round off while performing arithmetic operations:

	Perform arithmetic operations, but ensure the division operation rounds to two decimal places.
	Test Data: 
		Input first number: 55
		Input second number: 13
	Expected Output : 
		Division operation rounds to two decimal places = 45
			
*/
import java.util.Scanner;
class Ex8
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter first number = ");
		int num1 = in.nextInt();
		System.out.print("Enter second number = ");
		double num2 = in.nextInt();
		double result = num1/num2;
		double r1 = Math.round(result * 100.0) / 100.0;
		System.out.println("Division operation rounds to two decimal places = "+r1);
	}
}