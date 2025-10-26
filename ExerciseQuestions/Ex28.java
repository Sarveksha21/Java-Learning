/*	
	Ex28: Swap two strings instead of integers.
	
	Write a Java program to swap two string instead of integers.
	
	Test Data :
		Enter value of a = Hello
		Enter value of b = World
	
	Expected Output :    	
		Value of a before swapping = Hello
		Value of b before swapping = World
		Value of a after swapping = World
		Value of b after swapping = Hello
*/
import java.util.Scanner;
class Ex28
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value of a = ");
		String a = in.next();
		System.out.print("Enter value of b = ");
		String b = in.next();	
				
		System.out.println("Value of a before swapping = "+a);
		System.out.println("Value of b before swapping = "+b);
		
		String temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a after swapping = "+a);
		System.out.println("Value of b after swapping = "+b);
	}
}