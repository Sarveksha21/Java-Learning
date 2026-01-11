class Ex17
{
	public static void main(String[] args)
	{ 
		String s1 = "CyberSuccess";
		System.out.println(s1.startsWith("Cy"));	//true
		System.out.println(s1.startsWith("Xyz"));	//false
		System.out.println(s1.endsWith("ss"));		//true
		System.out.println(s1.endsWith("abc"));		//false
		System.out.println(s1.contains("erSu"));	//true
		System.out.println(s1.contains("pqr"));		//false
		System.out.println(s1.isEmpty());			//false
		String s2 = "";
		System.out.println(s2.isEmpty());			//true
	}
}
//contains, isEmpty, startsWith, endsWith
//public boolean startsWith(java.lang.String);
//public boolean endsWith(java.lang.String);
//public boolean contains(java.lang.CharsSequence);
//public boolean isEmpty();