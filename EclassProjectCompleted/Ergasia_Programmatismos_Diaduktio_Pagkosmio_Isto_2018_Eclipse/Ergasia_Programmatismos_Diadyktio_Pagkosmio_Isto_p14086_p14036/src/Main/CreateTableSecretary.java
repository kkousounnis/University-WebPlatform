package Main;
import java.sql.*;
public class CreateTableSecretary {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/university";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "Password123#@!";
	   
	   String username_secretary="";
	   
	   public void   CreateTable_Secretary() {
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
		       
		      System.out.println("Create Table Secretary if it doesn't exist");
		      
		       
		      
		       sql = "create table if not exists university.Secretary (" + 
		       		"	username varchar(25)," + 
		       		"    password varchar(25)," + 		       		  
		       		"    email varchar(25)," + 
		   			"    primary key(username,password)" + 
		       		");";
		      stmt.executeUpdate(sql);
		      System.out.println("Table for secretary created Secretary successfully...");
		      
		      System.out.println("Inserting records  into the table secretary...");
		    
		      
		      
		      System.out.println("Creating statement...");
	 

		      sql = "SELECT username FROM university.Secretary "
		      		+ "where username='secretery18'";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		          
		         username_secretary = rs.getString("username");
		         

		         
		      }
		      rs.close();
		      
		      
		      if(username_secretary.equals("")) {
		      
		      sql = "INSERT INTO Secretary " +
		                   "VALUES ('secretery18', '123', 'secret@gmail.com')";
		      stmt.executeUpdate(sql);
		      
		       
		      
		      }
		     
		      
		      
		      
		      
		      
		      
		      
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
