package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classes.Lesson;
import Classes.Proffessor;

public class TakeAllValuesFromProffessorLessons {

	
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost";//at first we might dont have a database
	   static final String DB_URL1 = "jdbc:mysql://localhost/university";//here is the url fro the database

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "Password123#@!";
	   
	   Proffessor p=new Proffessor();
	   Lesson l=new Lesson();
	   
	   public String TakeValProffLesson() {
		   String Values="";
		   
		   Connection conn = null;
		   Statement stmt = null;
		   			 
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");
		      
		      
		      
		      // Open a connection with the database
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      
		      
		      //STEP 4: Execute a query to create the database if it doesnt exist
		      
		       
		      
		      //Open a connection to the new database which has the new url with mysql_users
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL1, USER, PASS);
		      System.out.println("Connected database successfully...");	      
    
		    	      
		      		      
		      System.out.println("Select   user records");
		      stmt = conn.createStatement();
		      String  sql = "SELECT * FROM  proffessorlesson ";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         p.setId_Proffessor(rs.getString("id_proffessor"));
		         l.setId_Lnumber(rs.getString("id_Lnumber"));
		         
		         

		         Values=Values+p.getId_Proffessor()+","+l.getId_Lnumber()+",";
		      }
		      rs.close();
		      System.out.println("Records Taken");
		      
		      
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
		
		
		
		
		
		return Values;
	   }
}
