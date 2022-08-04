
public class Hospital {
	public static void main(String[] args) {
		
		
		Patient pObj = new Patient();
		pObj.setPatientDetails(34, "george", 5900);
		pObj.updateBill(450);
		pObj.getpatientDetails();
	}
}


class Patient
{
	int patientId;
	String patientName;
	int bill;
	
	void setPatientDetails(int x,String y,int z)
	{
		patientId =x;
	     patientName = y;
	     bill = z;
		System.out.println("patient id   "+patientId);
		System.out.println("patient name     "+patientName);
		System.out.println("bill    "+ bill);
	}
	
	int updateBill(int amt)
	{
		
		return bill + amt;
	}
	
	void getpatientDetails()
	{
		System.out.println("patient id   "+patientId);
		System.out.println("patient name     "+patientName);
		System.out.println("bill    "+ bill);
	}
	
}