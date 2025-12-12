/*
	class object
	{
		public string toString();
	}
	
*/
class Inherit11
{
	public static void main(String[] args)
	{
		Inherit11 ref = new Inherit11();
		System.out.println(ref);	//address ? -> toString() -> Object -> Implict call
		System.out.println(ref.toString());
	}
}

// 722c41f4 -> HashCode -> HexaDecimal
// Octal -> Base8 -> 8 -> 0-7
// Decimal -> Base10 -> 10 -> 0-9
// HexaDecimal -> Base16 -> 16 -> 0-9 & A-F
