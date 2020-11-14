package Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Classes.Grades;
import Classes.Lesson;
import Classes.Student;

public class TakeValueGradeForStudent {
	
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost";//at first we might dont have a database
	   static final String DB_URL1 = "jdbc:mysql://localhost/UNIVERSITY";//here is the url fro the database

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "test123";
	   
	   Student s=new Student();
	   Grades g=new Grades();
	   Lesson l=new Lesson();
	   
	   
	   public String TakeGrade(String username_student) {
		   String x="";
		   
		   
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
		      String  sql = "SELECT username_student,firstname,lastname,student_grade,id_Lnumber\r\n" + 
		      		" FROM university.grades,university.students\r\n" + 
		      		" where grades.username_student=students.id_student and id_student='"+username_student+"'\r\n" + 
		      		" order by id_Lnumber";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name 
		    	 s.setFirstname(rs.getString("firstname"));
		    	 s.setLastname("lastname");
		    	 g.setGrade(rs.getInt("student_grade"));  
		    	 l.setId_Lnumber(rs.getString("id_Lnumber"));
		       
		    	 x=x+","+s.getFirstname()+","+s.getLastname()+","+g.getGrade()+","+l.getId_Lnumber();	 
		      }
		      rs.close(); 
		      
		     
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
