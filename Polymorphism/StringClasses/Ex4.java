class Ex4
{
	public static void main(String[] args)
	{
		//1st Approach
		String s1 = "Cyber";
		String s2 = "Success";
		String s3 = "Cyber";
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s3==s1);
/*
	Whether is performing content comparsion & reference comparing from 1st Approach?
	- It is not clear from 1st Approach whether it is performing content comparsion & reference comparing.
	
*/
		//2nd Approach		
		String str1 = new String("Cyber");
		String str2 = new String("Success");
		String str3 = new String("Cyber");
		System.out.println(str1==str2);
		System.out.println(str2==str3);8
		System.out.println(str3==str1);
	}
}
/*
	Whether is performing content comparsion & reference comparing from 2nd Approach?
	- Whenver we compare strings using "==" operator, it will always perform "Reference Comparsion".
	
*/