class NonStaticVar3
{
	float x = 200.35f;
	public static void main (String[] args)
	{
			NonStaticVar3 var1 = new NonStaticVar3();
			System.out.println(var1.x);
			
			NonStaticVar3 var2 = new NonStaticVar3();
			System.out.println(var2.x);
	}
}

// We can create minimum one object or we can create multiple objects.	
/*
	Interview Question : In a Java program, how will you come to know that how many objects are being created.
	Answer : Based on total number "new" keyword written in code that number of objects will get created.	
*/
			