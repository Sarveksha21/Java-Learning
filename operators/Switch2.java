/*
	If the switch argument doesn't match with any of the case label then bydefault it will match default case
*/

class Switch2
{
	public static void main (String[] args)
	{
		int a=10;
		switch(a)
		{
			case 1: System.out.println("Inside Case One");
				break;
			case 2: System.out.println("Inside Case Two");
				break;
			case 3: System.out.println("Inside Case Three");
				break;
			default: System.out.println("Inside Case Default");
				break;
			
		}
	}
}