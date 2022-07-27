

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ClgAdmission {
	public static void main(String[] args) {
		
		System.out.println("Admission process started...");
		
		BtechAdmission ad = new BtechAdmission();
		try {
			ad.previousResult();
			ad.getAdmissionToken();
		} catch (StudentDoesNotContainHscResultException e) {
			System.out.println("Problem : "+e);
		}
		
		System.out.println("Admission confirmed...");
	}
}

class StudentDoesNotContainHscResultException extends Exception
{
	StudentDoesNotContainHscResultException(String msg) {
		super(msg);
	}
}
class BtechAdmission
{
	boolean hscResult;
	
	BtechAdmission() 	{
		System.out.println("BtechAdmission process for FY has started....but is student contain HSC result.....?????");
	}

	
	void previousResult() {
		if(hscResult==false) {
			hscResult = true;
		}
		System.out.println("Student contain 12th result....");
	}
	
	void getAdmissionToken() throws StudentDoesNotContainHscResultException
	{
		if(hscResult == false ) {
			StudentDoesNotContainHscResultException hscResultNotContainEx = new StudentDoesNotContainHscResultException("Student does not contain HSC Result...... out of criteria");
			throw hscResultNotContainEx;
		}

		System.out.println("Collect token from counter no 3 .... and fill the form for futher process");
		fillForm();
		
	}
	
	void fillForm()
	{
			
				System.out.println("Go to PC no 12 and fill the online form......................");
				System.out.println("Form succesfully filled with mandatory details...");
			
			payFees();
	}
	
	void payFees()
	{
			
				System.out.println("\tPay fees at counter no 5 ....");
			
			collectAdmissionReceipt();
	}
	
	void collectAdmissionReceipt() {
		
			System.out.println("\t\tCollect admission receipt.......");
		
	}
	
	
}
