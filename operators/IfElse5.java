class IfElse5
{
	public static void main(String[] args)
	{
		int age=17;
		char gender='f';
		if((gender=='m' && age>=21) || (gender=='f' && age>=18))
		{
			System.out.println("Eligible for Marriage");
		}
		else
		{
			System.out.println("Not Eligible for Marriage");
		}
	}
}