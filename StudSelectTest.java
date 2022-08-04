import static java.sql.DriverManager.getConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class StudSelectTest {

		public static void main(String[] args) {
			
			try
			{
				System.out.println("Registering driver");
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
				System.out.println("Driver registered");
				
				System.out.println("trying to connect to the db");
				Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb");
					
				System.out.println("Connected to DB" + conn);
				
				System.out.println("trying to make a statemnet");
				Statement statement = conn.createStatement();
				System.out.println("Statement created" + statement);

				System.out.println("trying to execute the statement");
				ResultSet rs = statement.executeQuery("SELECT * FROM STUDENT");
				System.out.println("Statement executed, got the rsult");
				
				while(rs.next())
				{
					int rno = rs.getInt(1); // get the first column (int type)
					String sname = rs.getString(2);
					String dob = rs.getString(3);
					int pmarks = rs.getInt(4);
					int cmarks = rs.getInt(5);
					int mmarks = rs.getInt(6);
					int total = rs.getInt(7);
					String grade = rs.getString(8);
					System.out.println("Student roll NO        :  "+rno);
					System.out.println("Student NAME           :  "+sname);
					System.out.println("Student DOB            :  "+dob);
					System.out.println("Physics Marks          :  "+pmarks);
					System.out.println("Chemistry Marks        :  "+cmarks);
					System.out.println("Maths Marks            :  "+mmarks);
					System.out.println("Marks total            :  "+total);
					System.out.println("Student Grade          :  "+grade);
					
					System.out.println("--------------------------");
				}
				
				rs.close();
				statement.close();
				conn.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
}

