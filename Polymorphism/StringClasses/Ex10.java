class Ex10
{
	public static void main(String[] args)
	{
		//StringBuffer sb1= "Cyber"; --> Invalid
		StringBuffer sb1 = new StringBuffer("Technology");
		System.out.println(sb1);
	}
}

//public StringBuffer(String);

/*
	String Buffer:
	- String Buffer is part of "java.lang" package.
	- It is not possible to create StringBuffer without using new keyword.
	- Whenever we print normal class reference variable, it will print the address.
	- But when we print the StringBuffer reference variable, it will not print the address it will print the value.
	- Because toString() is overridden within the StringBuffer class & its behaviour is gone and change.
	
*/