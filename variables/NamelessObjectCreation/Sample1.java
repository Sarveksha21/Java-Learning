/* Nameless Object Creation : There are two ways to create an object:
	i)Named Object Creation 
	ii) Nameless Object Creation.
*/
class Sample1
{
	int a = 100;
	public static void main(String[] args)
	{
		Sample1 s1 = new Sample1();
		System.out.println("Named Object Creation = "+s1.a);
		System.out.println("Nameless Object Creation = "+new Sample1().a);
	}
}