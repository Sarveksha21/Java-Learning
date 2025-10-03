// Switch case for traffic signal detection

class Switch7
{
	public static void main (String[] args)
	{
		char sign = 'g';
		switch(sign)
		{
			case 'r': System.out.println("Stop");
				  break;
			case 'g': System.out.println("Go");
				  break;
			case 'y': System.out.println("Slow Down");
				  break;
			default: System.out.println("Invalid Signal");
				  break;
		}
	}
}

			
						  