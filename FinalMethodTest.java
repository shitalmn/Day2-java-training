
public class FinalMethodTest {
	public static void main(String[] args) {
		Emp e1 = new Emp("Julie",7000);
		e1.empCredentials();
		Manager m1 = new Manager("John",40000,"Akhilesh",9000);
		CEO c1 = new CEO("Julie",7000,"John",40000,"Rajiv",67000);
	}
}

class Emp
{
	String eName ;
	int eSalary;
	final String eDesignation="Developer";

	public Emp(String eName, int eSalary) {
		super();
		this.eName = eName;
		this.eSalary = eSalary;
	}

	final void empCredentials()
	{
		String trigram = "DER4";
		System.out.println("Emp trigram"+trigram);
	}
	
}
class Manager extends Emp
{
	String mName ;
	int mSalary;
	final String mDesignation="Manager";
	public Manager(String eName, int eSalary, String mName, int mSalary) {
		super(eName, eSalary);
		this.mName = mName;
		this.mSalary = mSalary;
	}
	
	
}
final class CEO extends Manager
{
	String cName ;
	int cSalary;
	final String cDesignation="CEO";
	public CEO(String eName, int eSalary, String mName, int mSalary, String cName, int cSalary) {
		super(eName, eSalary, mName, mSalary);
		this.cName = cName;
		this.cSalary = cSalary;
	}
	
}
