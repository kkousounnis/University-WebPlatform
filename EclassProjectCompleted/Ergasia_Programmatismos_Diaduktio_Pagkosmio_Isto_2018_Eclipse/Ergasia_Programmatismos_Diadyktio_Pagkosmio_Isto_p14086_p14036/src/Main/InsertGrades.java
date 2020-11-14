package Main;


import java.sql.Connection;
import java.sql.DriverManager; 
import java.sql.SQLException;
import java.sql.Statement;





public class InsertGrades {

	
	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost";//at first we might dont have a database
	   static final String DB_URL1 = "jdbc:mysql://localhost/UNIVERSITY";//here is the url fro the database

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "test123";
	   
	   
	   
		public boolean InsertValuestoGrades(String id_Student,String id_lesson,int grade) {
			
			boolean x=false;
			
			Connection conn = null;
			   Statement stmt = null;
			   			 
			   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");
			      
			      
			      
			      // Open a connection with the database
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL1, USER, PASS);
			      System.out.println("Connected database successfully...");
			      
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();

			      
			      
			      System.out.println("Insert records into students");
			      stmt = conn.createStatement();
			     String  sql = "INSERT INTO  GRADES " +
			              "VALUES ('"+id_Student+"','"+id_lesson+"','"+grade+"')";
			      stmt.executeUpdate(sql);
			      System.out.println("Records inserted");
			      x=true;
			      
			   }catch(SQLException se){
				      //Handle errors for JDBC
				      se.printStackTrace();
				   }catch(Exception e){
				      //Handle errors for Class.forName
				      e.printStackTrace();
				   }
				   finally{
					      //finally block used to close resources
					      try{
					         if(stmt!=null)
					            conn.close();
					      }catch(SQLException se){
					      }// do nothing
					      try{
					         if(conn!=null)
					            conn.close();
					      }catch(SQLException se){
					         se.printStackTrace();
					      }//end finally try
					   }//end try
					   System.out.println("Goodbye!");
					return x;
			
			
		}
	
	
	
}
		
