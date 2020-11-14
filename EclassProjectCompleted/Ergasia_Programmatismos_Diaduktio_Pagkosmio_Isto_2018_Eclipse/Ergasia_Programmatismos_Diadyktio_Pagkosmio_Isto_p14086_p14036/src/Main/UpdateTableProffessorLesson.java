package Main;
import java.sql.*; 

import Classes.Lesson;
import Classes.Proffessor; 
public class UpdateTableProffessorLesson {

	 static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";   
	   static final String DB_URL = "jdbc:mysql://localhost/UNIVERSITY";//here is the url fro the database

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "test123";
	   
	   
	   String id_prof="";
	   String id_lesson="";
	   String id_proffessor="";
	   Lesson l =new Lesson();
	   Proffessor p=new Proffessor();
	
		public void DeleteRow(String id_lesson1,String id_proffessor_old,String id_proffessor_new) {
			
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
			      
			      System.out.println("Creating database...");
			      stmt = conn.createStatement();
			      
			      String sql = "CREATE DATABASE if not exists university";
			      stmt.executeUpdate(sql);
			      System.out.println("Database created successfully...");
			      
			      conn.close();
			      
			      //Open a connection to the new database which has the new url with mysql_users
			      System.out.println("Connecting to a selected database...");
			      conn = DriverManager.getConnection(DB_URL, USER, PASS);
			      System.out.println("Connected database successfully...");
			     
			       
			       
			       
			      //create the table users
			      System.out.println("Creating table in given database...Kanoume tipota");
			      stmt = conn.createStatement();
			       
			      sql = "SELECT * \r\n" + 
			      		"FROM university.proffessorlesson\r\n";
			      
			      
			      ResultSet rs = stmt.executeQuery(sql);
			      
			      while(rs.next()){
			         //Retrieve by column name
			         
			         id_lesson = rs.getString("id_Lnumber"); 
			         id_proffessor = rs.getString("id_proffessor"); 
			         
			         

			        
			      System.out.println(id_lesson1.contains(id_lesson)+id_lesson+id_lesson1);
			      System.out.println(id_proffessor_old.contains(id_proffessor)+id_proffessor+id_proffessor_old);
			         
			         if(id_lesson1.contains(id_lesson)==true && id_proffessor_old.contains(id_proffessor)==true) {
			        	 
			        	 p.setId_Proffessor(id_proffessor);
			        	 l.setId_Lnumber(id_lesson);
			        	 
			         }
			         
				       
			         
			         
			         
			        
			         
			      }
			      rs.close();
			    
			      System.out.println("Selected tables in given database...");
			      
			      
			      
			      System.out.println("Creating statement to update table proffessorlesson...");
			      System.out.println(p.getId_Proffessor()+l.getId_Lnumber() );
			      stmt = conn.createStatement();
			      sql = "UPDATE university.proffessorlesson " +
			                   "SET id_proffessor='"+id_proffessor_new+"' "
			                   		+ "WHERE  id_proffessor='"+p.getId_Proffessor()+"' &&  id_Lnumber='"+l.getId_Lnumber()+"'";
			      stmt.executeUpdate(sql);

			       

			      System.out.println("Table updated proffessorlesson...");
			       
			      
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
			
		}
	
	}

