// Write a program to swap two variable without using third variable.

class Example3
{
		public static void main (String[] args)
		{	
			// Swap two variables without using third variable
			int a = 30, b=50;
			System.out.println("The value of a before  = "+a);
			System.out.println("The value of b before  = "+b);
			//b = b - a;
			//a = a + b;
			a = a + b;
			b = a - b;
			a = a - b;
			System.out.println("The value of a after  = "+a);
			System.out.println("The value of b after  = "+b);						
		}	
}