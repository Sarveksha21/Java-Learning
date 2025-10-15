/*	
	Ex24: Area and Perimeter of Rectangle
	
	Write a program to print the area and perimeter of a rectangle.
	
	Test Data: 
		Enter Length of Rectangle = 10
		Enter Breadth of Rectangle = 5
	Expected Output :                                                                                              
		Area of Rectangle = 50.0
		Perimeter of Rectangle = 30.0
			
*/
import java.util.Scanner;
class Ex24
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Length of Rectangle = ");
		double l = in.nextDouble();
		System.out.print("Enter Breadth of Rectangle = ");
		double b = in.nextDouble();
		
		double area = l*b;
		double peri = 2*(l+b);
		
		System.out.println("Area of Rectangle = "+area);
		System.out.println("Perimeter of Rectangle = "+peri);
	}
}