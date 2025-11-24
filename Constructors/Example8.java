class Emp
{
	int empId;
	String empName;
	Emp(int empId, String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}
	void getEmpInfo()
	{
		System.out.println("EmpId: "+empId+"; EmpName: "+empName);
	}
}
class Example8
{
	public static void main(String[] args)
	{
		System.out.println("Start");
		Emp emp1 = new Emp(101,"Sarveksha");
		emp1.getEmpInfo();1
		Emp emp2 = new Emp(102,"Akanksha");
		emp2.getEmpInfo();
		System.out.println("Stop");
	}
}
		
		