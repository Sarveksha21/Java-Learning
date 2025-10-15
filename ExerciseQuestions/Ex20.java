/*	
	Ex20: surface area and volume of a sphere
	
	Write a program to Calculate the surface area and volume of a sphere.
	
	Test Data: 
		r = 9
	Expected Output :                                                                                              
		Surface area of Sphere = 1017.36
		Volume of Sphere = 3052.08
			
*/
import java.util.Scanner;
class Ex20
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter radius = ");
		int r = in.nextInt();
		
		double surface = 4*3.14*r*r;
		double volume = ((4*3.14*r*r*r)/3);
		
		System.out.println("Surface area of Sphere = "+surface);
		System.out.println("Volume of Sphere = "+volume);
	}
}
