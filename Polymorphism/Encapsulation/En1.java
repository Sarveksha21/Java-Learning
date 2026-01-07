// This program is example of "Data Hiding" example

class Demo	//this is java bin method, because it contains private variables & public methods.
{
	private int a=10;	//here, we hiding the data by making it as "private"
	public void getValue()
	{
		System.out.println("Inside Get value method");
		return a;	//a=10 
	}
	public void setValue(int a)	
	{
		System.out.println("Inside Set value method");
		this.a = a;
	}
}
class En1
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		int a = d.getValue();
		System.out.println(a);	//10
		d.setValue(100);
		a = d.setValue();
		System.out.println(a);	//100
	}
}