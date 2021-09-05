package Main;
//the database checksifdatabase exists and it creates a table type students
//STEP 1. Import required packages
import java.sql.*;

public class CheckDbexists {
   // JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "Password123#@!";
   
   public void   CheckDbCreateTable() {
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
      
       
      
       sql = "create table if not exists university.students (\r\n" + 
       		"	username varchar(25),\r\n" + 
       		"    password varchar(25),\r\n" + 
       		"    firstname varchar(25),\r\n" + 
       		"    lastname varchar(25),\r\n" + 
       		"    address varchar(25),\r\n" + 
       		"    phonenumber varchar(25),\r\n" + 
       		"    email varchar(25),\r\n" + 
       		"    id_student varchar(5),"+
       		"    primary key(username,password)\r\n" + 
       		");";
      stmt.executeUpdate(sql);
      System.out.println("Table for users created successfully...");
      
      
      
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
}//end JDBCExample