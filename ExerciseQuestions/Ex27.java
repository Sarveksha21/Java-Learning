/*	
	Ex27: Swapping two variables
	
	Write a Java program to swap two variables without using third temporary variable.
	
	Test Data :
		Enter value of a = 10
		Enter value of b = 20
	
	Expected Output :    	
		Value of a before swapping = 10
		Value of b before swapping = 20
		Value of a after swapping = 20
		Value of b after swapping = 10
*/
import java.util.Scanner;
class Ex27
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of a = ");
		int a = in.nextInt();
		System.out.print("Enter value of b = ");
		int b = in.nextInt();
		System.out.println("Value of a before swapping = "+a);
		System.out.println("Value of b before swapping = "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Value of a after swapping = "+a);
		System.out.println("Value of b after swapping = "+b);
		
	}
}