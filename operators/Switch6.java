// Printing statement inside Switch case
/*
	We can't diretly use printing statement within the switch case, either we have to use it within the case or within default
*/

class Switch6
{
	public static void main (String[] args)
	{
		int a=5;
		switch(a)
		{
			System.out.println("Inside Switch Case");
		}
	}
}