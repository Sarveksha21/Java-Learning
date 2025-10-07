
class Dowhile2
{
	public static void main (String[] args)
	{
		int i=6;
		System.out.println("Start");
		do{
			System.out.println(i);
			i++;
		}
		while(i<=5);
		System.out.println("Stop");
	}
}

// Regardless, whether the condition is true or false, the statements within do while loop will atleast get executed once.