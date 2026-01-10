class Ex12
{
	public static void main(String[] args)
	{
		String s1 = "Cyber";
		String s2 = "Success";
		String s3 = "Cyber";
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s1));
		
		String str1 = new String("Cyber");
		String str2 = new String("Success");
		String str3 = new String("Cyber");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
	}
}


//public boolean equals(Object);

/*
	How do we compare two strings contents?
	- we compare it will the help of "equals()" method.
	- It is a content comparision.
*/
