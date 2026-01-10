class Ex2
{
	public static void main(String[] args)
	{
		//1st Approach
		String s1 = "Cyber";
		String s2 = "Success";
		String s3 = "Cyber";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

//Primitive are meant to store data whereas Reference variables are meant to store address
//Primitive belongs to datatype whereas Reference variables are belongs to classstype 
//Reference variables are part of non-primitive 

/*
	what is difference between creating an object with & without new keyword.
	- If we are creating object without new keyword then those objects are part of "Heap" area & within "Heap" area, 
	it is also part of "String" call
	-While creating object within "string" constant pool it will check, is there any object there is exsiting, 
	if it is existing it will not allow to create a new object, if it is object is not exi
	sting, it only will create the object within that
	-Inside "string" constant pool, duplicate objects are not allowed, 
	if we try to create duplicate object will call the existing object but it will not create a new object.
*/

/*  Points of the Example:
	- Whenever we create objects of string, without "new" keyword those objects will always get create inside the "string" constant pool
	- Whenver objects have been craeted inside "string" constant pool, it will first check whether, the same object isn existing or not,
	- if it is not existing only then it will create an object, if it is existing it will not create any object but will make the reference 
	to point to the existing object.
*/