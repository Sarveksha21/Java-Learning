/*	
	Ex16: Area and Perimeter of Circle
	
	Write a Java program to print the area and perimeter of a circle.
	
	Test Data: 
		Radius = 7.5
	Expected Output :                                                                                              
		Perimeter of Circle = 47.12388980384689
		Area of Circle  = 176.71458676442586 
			
*/
class  Ex16
{
	public static void main(String[] args)
	{
		double r = 7.5f;
		double peri = 2*3.14159265359*r;
		double area = 3.14159265359*r*r;
		System.out.println("Perimeter of Circle = "+peri);
		System.out.println("Area of Circle = "+area);
	}
}