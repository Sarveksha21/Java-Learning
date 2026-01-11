class Ex15
{
	public static void main(String[] args)
	{
		//1st Approach - Constructor based 
		StringBuffer str1 = new StringBuffer("Demo");
		String s1 = new String(str1);
		System.out.println(s1);
		//2nd Approach - toString() method
		String s2 = str1.toString();
		System.out.println(s2);
		// System.out.println(s2.reverse());
	}
}
//String class: public String(StringBuffer);
//StringBuffer class: public String toString();