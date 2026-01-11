class Ex14
{
	public static void main(String[] args)
	{
		String str = "Tech";
		//Constructor
		StringBuffer str1 = new StringBuffer(str);
		System.out.println(str1);
		System.out.println(str1.reverse());
	}
}
/* Interview Question:
	How do we convert string to StringBuffer & StringBuffer to String?
	- With the help of constrcuctor based approach, it is possible to convert string to StringBuffer.
*/

//StringBuffer
// public StringBuffer(String)
// public syncronized StringBuffer reverse();