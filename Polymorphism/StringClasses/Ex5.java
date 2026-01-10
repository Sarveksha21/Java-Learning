/*
	class object
	{
			public String toString();	-> Address
	}
*/

class Cyber
{
	public String toString()//here, we overriding toString() from "object" class to "Cyber" class
	{
		return "CyberSuccess";	
	}			
}

class Ex5
{
	public static void main(String[] args)
	{
		Ex5 ref1 = new Ex5();
		System.out.println(ref1);	//object -> toString() -> Address
		Cyber ref2 = new Cyber();	//without overriding ->toString() -> Object -> Address
		System.out.println(ref2);	//with overriding -> Cyber -> toString() -> value(CyberSuccess)
		String str1 = new String("Success");
		System.out.println(str1);	//toString() -> String -> value
	}
}

/*
	- Whenver we print a normal class reference variable it will print the address but whenever we print the string class refernce variable, 
	it will not print the address, it will print the value.
*/

// we overriding toString() from "object" class to "Cyber" class, then it will return "value" otherwise it will always return "address".
/* 
	Whenver we print a normal class reference variable internally it will call the "toString()" of object class, whenever object class
	"toString()" called it will always print the address but whenever we printing the reference variable of "Cyber" class the "toString()"
	method is overidden, so whene          ver we printing the reference variable of "Cyber" internally it will still call the "toString()" method
	but know that "toString()" method will not come from the object class but come from the "Cyber" class, because it is overridden,
	hence "toString()" method of "Cyber" class is called & its behaviour will gone & change, hence it will not print the address,
	it will print the "value".
*/

/* whenver we print the normal class reference variable it will print the address, but when we print the string class reference variable it will print the value?
   because whenever we print reference variable of normal class it will evoke or call toString() from the object class hence it will print the address
   however, whenver we print string class reference variable it will also call toString() method not from the object class but from the string class
   because the toString() m=is overriding within the string class & hence the behaviour is changed 
   hence the toString() method of string class doesn't print the address it will print the value
*/