
public class FunctionOverLoadingTest
{
	public static void main(String[] args)
	{
		EmpIdCard idCardObj = new EmpIdCard();
		
		idCardObj.details();
		idCardObj.details(0006574);
		idCardObj.details("John");
		idCardObj.details(0006574,118);
		idCardObj.details("john","gorge");
		idCardObj.details("John",0006574);
		idCardObj.details(0006574,"John");
	}
}

class EmpIdCard
{
	void details()
	{
		System.out.println("deatils() : EmpID is issued");
	}
	void details(int idNo)
	{
		System.out.println("details(int) : Empid  is with no"+ idNo);
	}

	void details(String empName)
	{
		System.out.println("details(String) : Empid is with empName"+ empName);
	}

	void details(int empId, int trigramNo)
	{
		System.out.println("details(int,int) : Empid is with empId "+ empId + "and emp trigram no"+trigramNo);
	}
	
	void details(String name, String surname)
	{
		System.out.println("details(String,String) : Empid is with emp name "+ name + "and emp surname"+ surname);
	}
	
	void details(String name, int empNo)
	{
		System.out.println("details(String,int) : Empid is with emp name "+ name + "and emp no"+ empNo);
	}
	
	void details( int empNo,String name)
	{
		System.out.println("details(int,String) : Empid is with emp no "+ empNo + "and emp name"+ name);
	}
}