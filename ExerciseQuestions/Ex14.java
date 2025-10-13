/*	
	Ex14: Expression Evaluation
	
	Write a Java program to compute the specified expressions and print the output.
	
	Test Data: 
		((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
	Expected Output :                                                                                              
		2.138888888888889
			
*/

class Ex14
{
	public static void main (String[] args)
	{
		double cal = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println("Expression Evaluation = "+cal);
	}
}