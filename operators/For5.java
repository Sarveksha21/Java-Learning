

class For5
{
	public static void main (String[] args)
	{
		for(int i=1; ;i++)
		{
			System.out.println("Value of i = "+i);
		}
	}
}

/*
	If we don't set condition without for loop, then the compiler bydefault will set the condition as true within the loop.
	The above code will enter into infinite loop, because the condition will never become false.
*/
