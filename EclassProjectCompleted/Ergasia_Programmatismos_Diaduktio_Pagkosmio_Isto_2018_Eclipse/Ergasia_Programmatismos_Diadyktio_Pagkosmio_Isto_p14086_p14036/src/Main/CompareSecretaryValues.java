package Main;
import java.sql.*;

import Classes.Secretary;
 

public class CompareSecretaryValues {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/university";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "Password123#@!";
	   boolean x=false;
	   Secretary s=new Secretary();
	public boolean CompareSecretaryLogin(String u,String p) {
		
		Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "SELECT username,password FROM university.Secretary";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		          
		         s.setUsername( rs.getString("username"));
		         s.setPassword( rs.getString("password"));

		          
		         
		         
		         if(u.equals(s.getUsername()) & p.equals(s.getPassword())) {
				     x=true;
				     }
		     
		      }
		      
		      rs.close();
		      
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
