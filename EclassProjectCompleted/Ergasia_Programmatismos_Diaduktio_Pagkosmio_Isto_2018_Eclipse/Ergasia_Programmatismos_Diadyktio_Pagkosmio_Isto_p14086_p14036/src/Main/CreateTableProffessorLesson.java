package Main;

import java.sql.*;

public class CreateTableProffessorLesson {
	
	
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/university";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "test123";
	   String checkifrecordexists="";
	    
	   public void  CreateTable_ProffessorLesson() {
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
		      System.out.println("Creating table proffessorLesson in given database...");
		      stmt = conn.createStatement();
		      
		      sql = "CREATE TABLE IF NOT EXISTS university.proffessorLesson " +
		                   "( id_proffessor VARCHAR(5), " + 
		              	   " id_Lnumber VARCHAR(5) " +  
		                   " )"; 

		      stmt.executeUpdate(sql);
		      System.out.println("Created table proffessorLesson succesfully");
		      
		    //STEP 4: Execute a query
		     
		     
		      
		      System.out.println("Creating statement...");
		      

		      sql = "SELECT id_proffessor   FROM university.proffessorLesson "
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
		      
		      sql = "INSERT INTO university.proffessorLesson " +
		                   "VALUES ('T01', 'p11' )";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p12' )";
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p13' )";
		      stmt.executeUpdate(sql);
	      	  sql = "INSERT INTO university.proffessorLesson " +
                  "VALUES ('T01', 'p14' )";
	      	  stmt.executeUpdate(sql);
	      	 sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p15' )";
	      	 stmt.executeUpdate(sql);
	      	 sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p16' )";
	      	 stmt.executeUpdate(sql);
	      	 sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p17' )";
	      	 stmt.executeUpdate(sql);
	      	 sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p21' )";
	      	 stmt.executeUpdate(sql);
	      	 sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p22' )";
	      	 stmt.executeUpdate(sql);
	      	 sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p23' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p24' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p25' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p26' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p27' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T03', 'p31' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T03', 'p32' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T03', 'p33' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T03', 'p34' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T03', 'p35' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T03', 'p36' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T03', 'p37' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T04', 'p41' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T04', 'p42' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T04', 'p43' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T04', 'p44' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T04', 'p45' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T04', 'p46' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T04', 'p47' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T05', 'p51' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T05', 'p52' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T05', 'p53' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T05', 'p54' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T05', 'p55' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T05', 'p56' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T05', 'p57' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T06', 'p61' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T06', 'p62' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T06', 'p63' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T06', 'p64' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T06', 'p65' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T06', 'p66' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T06', 'p67' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p71' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p72' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p73' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p74' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p75' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p76' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T01', 'p77' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p81' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p82' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p83' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p84' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p85' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p86' )";
	      	 stmt.executeUpdate(sql);
	      	sql = "INSERT INTO university.proffessorLesson " +
	                   "VALUES ('T02', 'p87' )";
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
