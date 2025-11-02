class StaticMethod9
{
	// Calling method
	public static void main(String[] args)
	{
		System.out.println("Start");
		int x = 10;
		float y = 20f;
		float add = m1(x,y);
		System.out.println("Addition = "+add);
		System.out.println("Stop");
	}
	
	// Caller method
	static float m1(int x, float y)
	{
		System.out.println("Inside m1 method");
		float add = x + y;
		return add;
	}
}
		
/*
	- Whenever we are going to use a value or variable from the caller method to the called method , we go for 'pass by value'.
	- Whenever we have to access variable from called method to caller method we go for 'return by value'.
*/