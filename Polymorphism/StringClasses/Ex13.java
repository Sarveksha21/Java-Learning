class Ex13
{
	public static void main(String[] args)
	{
		StringBuffer str1 = new StringBuffer("Cyber");
		StringBuffer str2 = new StringBuffer("Success");
		StringBuffer str3 = new StringBuffer("Cyber");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str1));
	}
}

//It is performing reference comparsion.

/*  Interview Question:
	the equals() will perform both content comparision & reference comparision.
	When does equals() perform content comparision & reference comparision?
	- If the "equals()" called from the 'String' class it will perform content comparision, 
	- but if it is called from the 'StringBuffer' class it will perform reference comparision.
*/

/* Interview Question:
	What is difference between equals() & "==" operator?
	- The equals() can either perform content comparision if called from 'String' class 
	  or perform reference comparision if called from 'StringBuffer' class.
	- However, "==" operator will only perform reference comparsion.
*/
	