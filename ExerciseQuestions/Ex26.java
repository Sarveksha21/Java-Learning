/*	
	Ex26: Swapping two variables
	
	Write a Java program to swap two variables using third temporary variable.
	
	define swap(a, b)
    temp := a
    a := b
    b := temp
	
	Test Data :
		Enter value of a = 15
		Enter value of b = 27
	
	Expected Output :    	
		Value of a before swapping = 15
		Value of b before swapping = 27
		Value of a after swapping = 27
		Value of b after swapping = 15
*/
import java.util.Scanner;
class Ex26
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
				
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("Value of a after swapping = "+a);
		System.out.println("Value of b after swapping = "+b);

	}
}