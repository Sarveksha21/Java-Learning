
/*	
	Ex10: Multiplication Table
	
	Write a Java program that takes a number as input and prints its multiplication table up to 10.
	
	Test Data: 
		Enter number: 8
	Expected Output :                                                                                              
		8 x 1 = 8                                                                                                     
		8 x 2 = 16                                                                                                    
		8 x 3 = 24                                                                                                    
		8 x 4 = 32                                                                                                    
		8 x 5 = 40                                                                                                    
		8 x 6 = 48                                                                                                    
		8 x 7 = 56                                                                                                    
		8 x 8 = 64                                                                                                    
		8 x 9 = 72                                                                                                    
		8 x 10 = 80 
			
*/

import java.util.Scanner;
class Ex10
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number = ");
		int num = in.nextInt();
		for(int i=1; i<=10; i++)
		{
			int cal = num*i;
			System.out.println(num+" X "+i+" = "+cal);
		}																																										
	}
}