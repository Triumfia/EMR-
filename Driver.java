package Registration.src.Driver;



//Connecting to a MySQL Database & Retrieving information from database
import java.sql.*;
//import javax.swing.*;

//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;


public class Driver 
{
   // private static final String USERNAME = "root";
	//private static final String PASSWORD = "love4444";
	//private static final String CONN = "jdbc:mysql://localhost/emr?useSSL=false";

	public static void main(String[] args)
	{
		
		try {
			
			Connection myConn= DriverManager.getConnection("jdbc:mysql://localhost/emr","root", "love4444");
			
			Statement myStmt = myConn.createStatement();
			
			ResultSet myRs = myStmt.executeQuery("select * from patients");
			
			
			while (myRs.next()) {
				System.out.println(myRs.getInt("ssn_mrn") + ", " + myRs.getString("last_name") + "," + myRs.getString("first_name"));
			}
		} 
		catch (Exception exc) {
			exc.printStackTrace();
		}
		
	}
}


