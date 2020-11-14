package Main;

import java.sql.*;

public class CreateTableProffessor {
	
	
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/university";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "test123";
	   
	   String checkifrecordexists="";
	   public void  CreateTable_Proffessor() {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      
		      
		      System.out.println("Creating database...");
		      stmt = conn.createStatement();
		      
		      String sql = "CREATE DATABASE IF NOT EXISTS UNIVERSITY";
		      stmt.executeUpdate(sql);
		      System.out.println("Database created successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating table proffessor in given database...");
		      stmt = conn.createStatement();
		      
		      sql = "CREATE TABLE IF NOT EXISTS university.proffessor " +
		                   "( id_proffessor VARCHAR(5), " + 
		              	   " password VARCHAR(25), "
		              	   + "firstname varchar(25),"
		              	   + "lastname varchar(25),"
		              	   + "PRIMARY KEY(id_proffessor)" + 
		                   " )"; 

		      stmt.executeUpdate(sql);
		      System.out.println("Created table proffessor succesfully");
		      
		    //STEP 4: Execute a query
		     
		     
		      
		      System.out.println("Creating statement...");
		      

		      sql = "SELECT id_proffessor   FROM university.proffessor "
		      		+ "where  id_proffessor='T01'";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		          
		    	  checkifrecordexists = rs.getString("id_proffessor");
		          

		         //Display values
		          
		         
		      }
		      rs.close();
		      System.out.println(checkifrecordexists);
		      if(checkifrecordexists.equals("")) {
		      
		      sql = "INSERT INTO university.proffessor " +
		                   "VALUES ('T01', '123', 'Ελενη','Παπαδοπούλου')";
		      stmt.executeUpdate(sql);
		      
		      sql = "INSERT INTO university.proffessor " +
	                   "VALUES ('T02', '123', 'Γεωργιος','Δημτροκάλης')";
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.proffessor " +
	                   "VALUES ('T03', '123', 'Κωνσταντίνος','Γιαννακόπουλος')";
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.proffessor " +
	                   "VALUES ('T04', '123', 'Νίκος','Κουσουννής')";
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.proffessor " +
	                   "VALUES ('T05', '123', 'Αλέξανδρος','Γιαννόπουλος')";
	          stmt.executeUpdate(sql);

	          sql = "INSERT INTO university.proffessor " +
	                   "VALUES ('T06', '123', 'Μιχάλης','Βλαχάκης')";
	          stmt.executeUpdate(sql);
		      System.out.println("Inserted records into the table...");
		      
		     
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
		}//end main
	   

}
