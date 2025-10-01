// Write a java program to check a two number which one is greater as well as also check if both are same or not.

class IfElseIf1
{
	public static void main (String[] args)
	{
		int num1=20, num2=20;
		if(num1 > num2)
		{
			System.out.println("num1 is greater");
		}
		else if(num2 > num1)
		{
			System.out.println("num2 is greater");
		}
		else if(num1==num2)
		{
			System.out.println("num1 and num2 are same");
		}
		else
		{
			System.out.println("Invalid valid");
		}
	}
}
