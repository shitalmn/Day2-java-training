
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudInsertTest {
	public static void main(String[] args) throws StudentAlreadyExistsException {
		
		//1. WE KNOW THE DRIVER - org.hsqldb.jdbc.JDBCDriver.class
		//2. REGISTER THIS DRIVER
		try {
			System.out.println("Registering driver...");    
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Driver registered....");
			
			System.out.println("Trying to connect to the DB");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			System.out.println("Connected to the DB : "+conn);
			
			System.out.println("trying to make a Prepared statment");
			PreparedStatement pst = conn.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?,?,?,?,?);");
			System.out.println("Prepared Statement created : "+pst);
			
			
			
			
			Scanner scan1 = new Scanner(System.in);
			System.out.println("Enter roll  number : ");
			int rno = scan1.nextInt();
			
			
			Statement st = conn.createStatement();
			ResultSet rs =st.executeQuery("SELECT * FROM STUDENT WHERE ROLLNO="+rno);
			
		if(rs.next())
		{
			
			StudentAlreadyExistsException studExitEx = new StudentAlreadyExistsException("Student already exit");
			throw studExitEx;
		}
		
		
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Enter student name   : ");
			String sname = scan2.next();
			
			Scanner scan3 = new Scanner(System.in);
			System.out.println("Enter student DOB : ");
			String sdob = scan3.next();
			Date date = Date.valueOf(sdob);
			
			Scanner scan4 = new Scanner(System.in);
			System.out.println("Enter physics marks : ");
			int pmarks = scan4.nextInt();
			
			Scanner scan5 = new Scanner(System.in);
			System.out.println("Enter chemistry marks : ");
			int cmarks = scan5.nextInt();
			
			Scanner scan6 = new Scanner(System.in);
			System.out.println("Enter maths marks : ");
			int mmarks = scan6.nextInt();
			
			
			int total = mmarks + pmarks + cmarks ;
			int avg = total/3;
			String grade;
			if(avg>80)
			{
				grade = "A";
			}
			else if(avg>60 && avg<=80)
			{
				grade = "B";
			}
			else
			{
				grade = "C";
			}
		
			pst.setInt(1, rno);//fill up the question mark with its value
			pst.setString(2, sname);
			pst.setDate(3, date);
			pst.setInt(4, pmarks);
			pst.setInt(5, cmarks);
			pst.setInt(6, mmarks);
			pst.setInt(7, total);
			pst.setString(8, grade);
			
			System.out.println("Trying to execute the prepared statement....");
			int rows = pst.executeUpdate();
			
			System.out.println("Prepred Statement executed, inserted the records :..."+rows);
				
			
			pst.close();	conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		    
	}
}
