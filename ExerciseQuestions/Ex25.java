/*	
	Ex25: Area and Perimeter of Parallelogram
	
	Write a program to calculate the area and perimeter of a parallelogram.
	
	Test Data: 
		Enter Base of Parallelogram =10
		Enter Height of Parallelogram = 8
		Enter first adjacent side of Parallelogram = 12
		Enter second adjacent side of Parallelogram = 15
	Expected Output :                                                                                              
		Area of Parallelogram = 80.0
		Perimeter of Parallelogram = 54.0
			
*/
import java.util.Scanner;
class Ex25
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Base of Parallelogram =");
		double base = in.nextDouble();
		System.out.print("Enter Height of Parallelogram = ");
		double height = in.nextDouble();
		System.out.print("Enter first adjacent side of Parallelogram = ");
		double a = in.nextDouble();
		System.out.print("Enter second adjacent side of Parallelogram = ");
		double b = in.nextDouble();
		
		double area = base*height;
		double peri = 2*(a+b);
		
		System.out.println("Area of Parallelogram = "+area);
		System.out.println("Perimeter of Parallelogram = "+peri);
	}
}