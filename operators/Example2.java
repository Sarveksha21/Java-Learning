// Write a program to swap two numbers using third variable.

class Example2
{
		public static void main (String[] args)
		{	
			// Swap two variables using third variable
			int a = 10, b=20, temp;
			System.out.println("The value of a before  = "+a);
			System.out.println("The value of b before  = "+b);
			temp = a;
			a = b;
			b = temp;
			System.out.println("The value of a after  = "+a);
			System.out.println("The value of b after  = "+b);			
			
		}	
}