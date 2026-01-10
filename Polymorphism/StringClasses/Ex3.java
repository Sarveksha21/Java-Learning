class Ex3
{
	public static void main(String[] args)
	{
		//2nd Approach
		String s1 = new String("Cyber");
		String s2 = new String("Success");
		String s3 = new String("Cyber");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

/*
	- Whenever we create string object using "new" keyword this objects will get create inside "Heap" Memory 
	  and regardless whether the object is duplicate or not different objects will get created.
*/