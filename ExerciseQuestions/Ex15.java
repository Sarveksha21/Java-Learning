/*	
	Ex15: Formula Computation
	
	Write a Java program to compute a specified formula.
	
	Test Data: 
		4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
	Expected Output :                                                                                              
		2.9760461760461765
			
*/

class Ex15
{
	public static void main (String[] args)
	{
		double cal = (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		System.out.println("Expression Evaluation = "+cal);
	}
}