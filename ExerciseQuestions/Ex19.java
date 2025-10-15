/*	
	Ex19: Compare Area of two Circles
	
	Write a program to compare the areas of two circles given their radii.
	
	Test Data: 
		r1 = 5
		r2 = 4
	Expected Output :                                                                                              
		Area of Circle1 is greater than Circle2 which is = 78.5
			
*/
import java.util.Scanner;
class Ex19
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter value for radius r1 for Circle1 = ");
		int r1 = in.nextInt();
		System.out.print("Enter value for radius r2 for Circle2 = ");
		int r2 = in.nextInt();
		
		double a1 = 3.14*r1*r1;
		double a2 = 3.14*r2*r2;

		if(a1> a2)
		{
			System.out.println("Area of Circle1 is greater than Circle2 which is = "+a1);
		}
		else if(a2> a1)
		{
			System.out.println("Area of Circle2 is greater than Circle1 which is = "+a2);
		}
		else
		{	
			System.out.println("Area of Circle1 is equal to Area of Circle2 which is = "+a1);
		}
	}
}