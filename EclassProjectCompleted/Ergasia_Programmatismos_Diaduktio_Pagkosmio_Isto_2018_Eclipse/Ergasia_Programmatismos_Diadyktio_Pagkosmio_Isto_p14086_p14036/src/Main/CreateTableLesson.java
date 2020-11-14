package Main;


import java.sql.*;
public class CreateTableLesson {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "test123";
	   String checkiftableisempty="";
	   public void   CreateTable_Lesson() {
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
		      
		      String sql = "CREATE DATABASE IF NOT EXISTS UNIVERSITY";
		      stmt.executeUpdate(sql);
		      System.out.println("Database created successfully...");
		       
		      
		      
		      System.out.println("Create table if it doesn't exist");
		      
		       
		      
		       sql = "create table if not exists university.Lesson (" + 
		       		"    id_Lnumber varchar(8),"//p11 το πρωτο ψηφίο συμβολίζει το εξάμηνο και το δευτερο ψηφίο συμβολίζει τον αριθμό του μαθηματος 1-6		       		
		       		+ "LessonName varchar(70),"//τον βαθμό του μαθήματος
		       		+ "primary key(id_Lnumber)" +       		
		      		");";
		      stmt.executeUpdate(sql);
		      System.out.println("Table for Lesson created successfully...");
		      
		      
		      
		      System.out.println("Creating statement...");
		      

		      sql = "SELECT id_Lnumber   FROM university.Lesson";
		      ResultSet rs = stmt.executeQuery(sql);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		          
		         checkiftableisempty = rs.getString("id_Lnumber");
		          

		         //Display values
		          
		         
		      }
		      rs.close();
		     
		      if(checkiftableisempty.equals("")) {
		      
		    //STEP 4: Execute a query
		      System.out.println("Inserting records into the table...");
		     
		      
		      sql = "INSERT INTO university.Lesson " +
		                   "VALUES ( 'p11', 'Αναλυση1')";
		      				
		      stmt.executeUpdate(sql);
		      sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p12', 'Αρχές_Προγραμματισμού')";
	      				
	         
	          stmt.executeUpdate(sql);
		      sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p13', 'Εισαγωγή_Στην_Επιστήμη_Υπολογιστών')";
	      				
	          stmt.executeUpdate(sql);
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p14', 'Λογική_Σχεδίαση_Ψηφιακών_Συστημάτων')";
	      				
	          stmt.executeUpdate(sql);
	          
	           
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p15', 'ΜΑΘΗΜΑΤΙΚΑ_ΤΩΝ_ΥΠΟΛΟΓΙΣΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p16', 'ΤΕΧΝΟΛΟΓΙΕΣ_ΔΙΑΔΙΚΤΥΟΥ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p17', 'ΑΓΓΛΙΚΑ_1')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p21', 'ΑΝΑΛΥΣΗ_2')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p22', 'ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ_ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p23', 'ΑΡΧΙΤΕΚΤΟΝΙΚΗ_ΥΠΟΛΟΓΙΣΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p24', 'ΔΙΑΚΡΙΤΑ_ΜΑΘΗΜΑΤΙΚΑ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p25', 'ΔΟΜΕΣ_ΔΕΔΟΜΕΝΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p26', 'ΕΦΑΡΜΟΣΜΕΝΗ_ΑΛΓΕΒΡΑ')";
	      				
	          stmt.executeUpdate(sql);
		      
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p27', ' ΑΓΓΛΙΚΑ_2')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p31', 'ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ_ΑΝΑΠΤΥΞΗ_ΕΦΑΡΜΟΓΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p32', 'ΛΕΙΤΟΥΡΓΙΚΑ_ΣΥΣΤΗΜΑΤΑ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p33', ' ΜΑΘΗΜΑΤΙΚΟΣ_ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p34', 'ΜΕΤΑΓΛΩΤΤΙΣΤΕΣ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p35', 'ΠΙΘΑΝΟΤΗΤΕΣ_ΚΑΙ_ΣΤΑΤΙΣΤΙΚΗ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p36', 'ΜΑΝΑΤΖΜΕΝΤ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p37', 'ΑΓΓΛΙΚΑ_3')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p41', 'ΑΛΓΟΡΙΘΜΟΙ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p42', 'ΑΡΧΕΣ_ΚΑΙ_ΕΦΑΡΜΟΓΕΣ_ΣΗΜΑΤΩΝ_ΚΑΙ_ΣΥΣΤΗΜΑΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p43', 'ΒΑΣΕΙΣ_ΔΕΔΟΜΕΝΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p44', 'ΔΙΚΤΥΑ_ΥΠΟΛΟΓΙΣΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p45', 'ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ_ΣΤΟ_ΔΙΑΔΙΚΤΥΟ_ΚΑΙ_ΤΟΝ_ΠΑΓΚΟΣΜΙΟ_ΙΣΤΟ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p46', 'ΞΕΝΟΓΛΩΣΣΗ_ΟΡΟΛΟΓΙΑ_ΤΗΣ_ΠΛΗΡΟΦΟΡΙΚΗΣ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p47', 'ΑΓΓΛΙΚΑ_4')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p51', 'ΑΛΛΗΛΕΠΙΔΡΑΣΗ_ΑΝΘΡΩΠΟΥ_ΚΑΙ_ΥΠΟΛΟΓΙΣΤΗ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p52', 'ΑΝΑΓΝΩΡΙΣΗ_ΠΡΟΤΥΠΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p53', 'ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p54', 'ΚΡΥΠΤΟΓΡΑΦΙΑ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p55', 'ΠΡΟΗΓΜΕΝΑ_ΘΕΜΑΤΑ_ΕΠΙΚΟΙΝΩΝΙΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p56', ' ΠΡΟΗΓΜΕΝΗ_ΑΡΧΙΤΕΚΤΟΝΙΚΗ_ΥΠΟΛΟΓΙΣΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p57', 'ΑΓΓΛΙΚΑ_5')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p61', 'ΤΕΧΝΗΤΗ_ΝΟΗΜΟΣΥΝΗ_ΚΑΙ_ΕΜΠΕΙΡΑ_ΣΥΣΤΗΜΑΤΑ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p62', 'ΤΕΧΝΟΛΟΓΙΑ_ΛΟΓΙΣΜΙΚΟΥ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p63', 'ΔΙΟΙΚΗΣΗ_ΑΣΦΑΛΕΙΑΣ_ΣΥΣΤΗΜΑΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p64', 'ΣΥΣΤΗΜΑΤΑ_ΥΠΟΣΤΗΡΙΞΗΣ_ΑΠΟΦΑΣΕΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p65', 'ΣΥΣΤΗΜΙΚΗ_ΑΝΑΛΥΣΗ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p66', 'ΔΙΚΤΥΑ_ΥΨΗΛΩΝ_ΤΑΧΥΤΗΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p67', 'ΑΓΓΛΙΚΑ_6')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p71', 'ΑΠΟΘΗΚΕΣ_ΔΕΔΟΜΕΝΩΝ_ΚΑΙ_ΕΞΟΡΥΞΗ_ΓΝΩΣΗΣ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p72', 'ΑΣΦΑΛΕΙΑ_ΠΛΗΡΟΦΟΡΙΑΚΩΝ_ΣΥΣΤΗΜΑΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p73', 'ΠΡΟΣΟΜΟΙΩΣΗ_ΣΥΣΤΗΜΑΤΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p74', 'ΑΝΑΚΤΗΣΗ_ΠΛΗΡΟΦΟΡΙΑΣ_ΚΑΙ_ΑΝΑΖΗΤΗΣΗ_ΣΤΟΝ_ΠΑΓΚΟΣΜΙΟ_ΙΣΤΟ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p75', 'ΤΕΧΝΟΛΟΓΙΕΣ_ΑΝΑΠΤΥΞΗ_ΗΛΕΚΤΡΟΝΙΚΩΝ_ΠΑΙΧΝΙΔΙΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p76', 'ΓΕΩΓΡΑΦΙΚΑ_ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p77', 'ΑΓΓΛΙΚΑ_7')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p81', 'ΔΙΟΙΚΗΤΙΚΗ_ΠΛΗΡΟΦΟΡΙΚΗ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p82', 'ΗΛΕΚΤΡΟΝΙΚΟ_ΕΠΙΧΕΙΡΕΙΝ_ΚΑΙ_ΚΑΙΝΟΤΟΜΙΑ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p83', 'ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ_ΣΤΟ_ΔΙΑΔΙΚΤΥΟ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p84', ' ΑΣΦΑΛΕΙΑ_ΔΙΚΤΥΩΝ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p85', 'Συστήματα_Διασφάλισης_Ποιότητας ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p86', 'ΨΗΦΙΑΚΕΣ_ΒΙΒΛΙΟΘΗΚΕΣ')";
	      				
	          stmt.executeUpdate(sql);
	          
	          sql = "INSERT INTO university.Lesson " +
	                   "VALUES ( 'p87', 'ΑΓΓΛΙΚΑ_8')";
	      				
	          stmt.executeUpdate(sql);
	          
	          
	          
	          
	          
		      System.out.println("Inserted records into the table Lessons...");
		      
		      
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
