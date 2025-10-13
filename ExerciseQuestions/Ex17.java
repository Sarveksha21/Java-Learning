/*	
	Ex17: Area and Perimeter of Ellipse
	
	Write a Java program to print the area and perimeter of a ellipse.
	
	Test Data: 
		a = 10
		b = 5
	Expected Output :                                                                                              
		Area of Ellipse  = 157.0
		Perimeter of Ellipse = 49.647759264643554
			
*/
class  Ex17
{
	public static void main(String[] args)
	{
		double a = 10;									// minor length of ellipse
		double b = 5;									// major length of ellipse
		
		double area = 3.14*a*b;
		double peri = 2*3.14*Math.sqrt(((a*a)+(b*b))/2);
			
		System.out.println("Area of Ellipse = "+area);
		System.out.println("Perimeter of Ellipse = "+peri);
	}
}