package Main;
import java.sql.*;
public class InsertIntoDatabaseValues {

	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost";//at first we might dont have a database
	   static final String DB_URL1 = "jdbc:mysql://localhost/university";//here is the url fro the database

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "Password123#@!";
	   
	   
	   boolean x;
	   String student_id="";
	   String[] student_id1=new String[6];
	   int number=0001;
		public boolean InsertUserValues(String u,String p,String f,String l,String a,String ph,String em) {
			
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

			      String sql = "SELECT  id_student FROM university.students order by id_student";
			      ResultSet rs = stmt.executeQuery(sql);
			      //STEP 5: Extract data from result set
			      while(rs.next()){
			         //Retrieve by column name
			          
			         student_id = rs.getString("id_student");

			         
			      }
			      rs.close();
			      
			      if(student_id=="") {
			    	  student_id="p"+"0"+"0"+"0"+number;
			      }
			      else {
			    	 student_id1=student_id.split("p");
			    	  
			    	 number=Integer.parseInt(student_id1[1]);
			    	 number=number+1;
			    	 
			    	 if(number<=9) {
			    		 student_id="p"+"0"+"0"+"0"+number;
			    	 }
			    	 if(number>=10) {
			    		 student_id="p"+"0"+"0"+number;
			    	 }
			    	 if(number>=100) {
			    		 student_id="p"+"0"+number;
			    	 }
			    	 if(number>=1000) {
			    		 student_id="p"+number;
			    	 }
			    	
			      }
			      
			      
			     
			      //STEP 4: Execute a query to create the database if it doesnt exist
			       
 
			      System.out.println("Creating statement...");
			      String checkifusernameexists="";
			      String checkifpasswordexists="";
			      
			      stmt = conn.createStatement();
			      
			       sql = "SELECT username,password   FROM university.students "
			      		+ "where  username='"+u+"'  ";
			     ResultSet rs1 = stmt.executeQuery(sql);
			      //STEP 5: Extract data from result set
			      while(rs1.next()){
			          
			    	  checkifusernameexists = rs1.getString("username");
			          checkifpasswordexists=rs1.getString("password");

			         //Display values
			          
			         
			      }
			      rs1.close();
			      
			      
			      
			      
			     System.out.print(checkifusernameexists);
			     System.out.print(checkifpasswordexists);
			    
			      if(checkifusernameexists.equals(u)  ) {
			    	  x=false;
			    	 System.out.println("The records weren't inserted because either password or username already exists"); 
			      }else {
			      System.out.println("Insert records into students");
			      stmt = conn.createStatement();
			      sql = "INSERT INTO  students " +
			              "VALUES ('"+u+"','"+p+"','"+f+"','"+l+"','"+a+"','"+ph+"','"+em+"','"+student_id+"')";
			      stmt.executeUpdate(sql);
			      System.out.println("Records inserted");
			      x=true;
			      }
			      
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

