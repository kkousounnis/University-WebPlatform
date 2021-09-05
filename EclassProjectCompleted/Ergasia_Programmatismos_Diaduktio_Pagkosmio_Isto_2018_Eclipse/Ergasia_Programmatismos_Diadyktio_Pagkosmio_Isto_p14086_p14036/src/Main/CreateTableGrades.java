package Main;
import java.sql.*;
public class CreateTableGrades {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/";
	   
	   String checkifrecordexists="";
	   
	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "Password123#@!";
	   public void   CreateTableGrade() {
		   Connection conn = null;
		   Statement stmt = null;
		   
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);

		      //STEP 4: Execute a query
		      System.out.println("Creating database...");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE DATABASE IF NOT EXISTS university";
		      stmt.executeUpdate(sql);
		      System.out.println("Database created successfully...");
		      System.out.println("Create Table if it doesn't exist");
		      
		       
		      
		       sql = "create table if not exists university.grades (" + 
		       		"    username_student varchar(8)," + 
		       		"    id_Lnumber varchar(8),"
		       		+ "student_grade int,"
		       		+ "primary key(username_student,id_Lnumber)" +       		
		      		");";
		      stmt.executeUpdate(sql);
		      System.out.println("Table for grades created successfully...");
		      

		      
		    

		       
		       
		      
		     
		      
		      
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se2){
		      }// nothing we can do
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main

}
