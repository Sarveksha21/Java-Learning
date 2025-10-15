/*	
	Ex18: Area and Perimeter of Semicircle
	
	Write a Java program to print the area and perimeter of a semicircle.
	
	Test Data: 
		r = 4
	Expected Output :                                                                                              
		Area of Semicircle =  25.136
		Perimeter of Semicircle =  20.567999999999998
			
*/
import java.util.Scanner;
class Ex18
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius of semicircle = ");
		int r = in.nextInt();
		
		double area = 3.142*r*r/2;
		double peri = r*(3.142 + 2);
		
		System.out.println("Area of Semicircle = "+area);
		System.out.println("Perimeter of Semicircle = "+peri);
	}
}