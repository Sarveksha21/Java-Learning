class IMS
{
	int studId;
	String studName;
	static String instituteName = "Cyber Success";
	void setStudentInfo(int studId, String studName)
	{
		this.studId = studId;
		this.studName = studName;
		System.out.println("Student Info Successfully set");
	}
	void getStudentInfo()
	{
		System.out.println("StudId = "+studId+" ; Stud Name = "+studName+" from "+instituteName);
	}
}
class Example21
{
	public static void main(String[] args)
	{
		IMS stud1 = new IMS();
		stud1.setStudentInfo(111,"Kalyani");
		stud1.getStudentInfo();
		IMS stud2 = new IMS();
		stud2.setStudentInfo(222,"Rahul");
		stud2.getStudentInfo();
	}
}