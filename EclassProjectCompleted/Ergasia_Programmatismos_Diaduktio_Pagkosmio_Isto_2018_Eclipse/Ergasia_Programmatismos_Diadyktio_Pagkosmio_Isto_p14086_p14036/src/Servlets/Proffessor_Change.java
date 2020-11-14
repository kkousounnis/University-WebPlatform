package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
import Main.CreateTableProffessorLesson; 

/**
 * Servlet implementation class Proffessor_Change
 */
@WebServlet("/Proffessor_Change")
public class Proffessor_Change extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proffessor_Change() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		
 
		
		CreateTableProffessorLesson CTPL=new CreateTableProffessorLesson();
		CTPL.CreateTable_ProffessorLesson();
		
		
		
		
		
		 
		 
	    
	    
	    
	      out.print("<!DOCTYPE html>\r\n" + 
	      		"<html>\r\n" + 
	      		"<head>\r\n" + 
	      		"    <meta http-equiv=\"Content-Type\" content=\"text/html\">\r\n" + 
	      		"    <meta charset=\"UTF-8\">\r\n" + 
	      		"    <meta http-equiv=\"Content-Type\" content=\"text/html\">\r\n" + 
	      		"    <meta charset=\"UTF-8\">\r\n" + 
	      		"    <title>UniversityStyle</title>\r\n" + 
	      		"    <style>\r\n" + 
	      		"        .column {\r\n" + 
	      		"            width: 50%;\r\n" + 
	      		"            padding: 0 25px;\r\n" + 
	      		"            -webkti-box-sizing: border-box;\r\n" + 
	      		"            -moz-box-sizing: border-box;\r\n" + 
	      		"            box-sizing: border-box;\r\n" + 
	      		"            float: left;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        .field {\r\n" + 
	      		"            width: 13%;\r\n" + 
	      		"            padding: auto;\r\n" + 
	      		"            height: auto;\r\n" + 
	      		"            background-color: deepskyblue;\r\n" + 
	      		"            float: left;\r\n" + 
	      		"            height: 100%;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        .field1 {\r\n" + 
	      		"            width: auto;\r\n" + 
	      		"            border-radius: 15px;\r\n" + 
	      		"            padding: auto;\r\n" + 
	      		"            height: 75%;\r\n" + 
	      		"            background-color: white;\r\n" + 
	      		"            float: center;\r\n" + 
	      		"            position: relative;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        body {\r\n" + 
	      		"            background-color: white;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        .container {\r\n" + 
	      		"            padding: 10px;\r\n" + 
	      		"            height: 45px;\r\n" + 
	      		"            float: left;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        .title {\r\n" + 
	      		"            border-radius: 15px 50px 30px 5px;\r\n" + 
	      		"            background-color: deepskyblue;\r\n" + 
	      		"            color: white;\r\n" + 
	      		"            height: 80px;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        .userbutton {\r\n" + 
	      		"            background-color: white;\r\n" + 
	      		"            border-radius: 15px;\r\n" + 
	      		"            padding: auto;\r\n" + 
	      		"            width: 150px;\r\n" + 
	      		"            height: 100px;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        .adminbutton {\r\n" + 
	      		"            background-color: white;\r\n" + 
	      		"            border-radius: 15px;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        .refresh {\r\n" + 
	      		"            background-color: deepskyblue;\r\n" + 
	      		"            border-radius: 15px;\r\n" + 
	      		"            float: right;\r\n" + 
	      		"            width: 50px;\r\n" + 
	      		"            height: 50px;\r\n" + 
	      		"            color: white;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        ul {\r\n" + 
	      		"            list-style-type: none;\r\n" + 
	      		"            margin: 0;\r\n" + 
	      		"            padding: 0;\r\n" + 
	      		"            width: 200px;\r\n" + 
	      		"            background-color: deepskyblue;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"        li .form1 {\r\n" + 
	      		"            border-radius: 15px;\r\n" + 
	      		"            display: block;\r\n" + 
	      		"            background-color: deepskyblue;\r\n" + 
	      		"            position: relative;\r\n" + 
	      		"            color: #000;\r\n" + 
	      		"            padding: 30px 16px;\r\n" + 
	      		"            width: 75%;\r\n" + 
	      		"            text-decoration: none;\r\n" + 
	      		"        }\r\n" + 
	      		"\r\n" + 
	      		"            li .form1:hover {\r\n" + 
	      		"                border-radius: 15px;\r\n" + 
	      		"                background-color: #555;\r\n" + 
	      		"                color: white;\r\n" + 
	      		"                .dot;\r\n" + 
	      		"\r\n" + 
	      		"        {\r\n" + 
	      		"            height: 10px;\r\n" + 
	      		"            width: 10px;\r\n" + 
	      		"            background-color: black;\r\n" + 
	      		"            border-radius: 50%;\r\n" + 
	      		"            display: inline-block;\r\n" + 
	      		"        }\r\n"
	      		+ ".column {\r\n" + 
	      		"    float: left;\r\n" + 
	      		"    width: 50%;\r\n" + 
	      		"    padding: 10px;\r\n" + 
	      		"    height: 300px; /* Should be removed. Only for demonstration */\r\n" + 
	      		"}" +
	      		".column1 {\r\n" + 
	      		"    float: right;\r\n" + 
	      		"    width: 50%;\r\n" + 
	      		"    padding: 10px;\r\n" + 
	      		"    height: 300px; /* Should be removed. Only for demonstration */\r\n" + 
	      		"}" + 
	      		"    </style>\r\n" + 
	      		"</head>\r\n" + 
	      		"<body>\r\n" + 
	      		"\r\n" + 
	      		"    <div class=\"container\">\r\n" + 
	      		"        <img src=\"university_icon.png\" style=\"width:150px;float:left;\">\r\n" + 
	      		"    </div>\r\n" + 
	      		"\r\n" + 
	      		"    <div class=\"title\">\r\n" + 
	      		"        <a href=\"Secretary_menu.html\">\r\n" + 
	      		"            <img src=\"leftarrow.png\" style=\"width:50px;float:right;\">\r\n" + 
	      		"        </a>\r\n" + 
	      		"        <h2>Ηλεκτρονική Πλατφόρμα Πανεπιστημίου<br></br>Επίσημη-Ιστοσελίδα Γραμματείας </h2>\r\n" + 
	      		"\r\n" + 
	      		"\r\n" + 
	      		"\r\n" + 
	      		"    </div>\r\n" + 
	      		"    <p>&nbsp;</p>\r\n" + 
	      		"    <fieldset class=\"field1\">\r\n" + 
	      		"\r\n" + 
	      		"        <fieldset class=\"field\">\r\n" + 
	      		"\r\n" + 
	      		"\r\n" + 
	      		"            <ul>\r\n" + 
	      		"                <br></br>\r\n" + 
	      		"                <li><form action=\"Secretary_menu.html\"><button class=\"form1\" type=\"submit\">  <h2> Aρχική </h2></button></form></li>\r\n" + 
	      		"                <li><form action=\"Proffessor_Change\">   <button class=\"form1\" type=\"submit\"> <h2>Aλλαγή Καθηγητών</h2></button> </form></li>\r\n" + 
	      		"                <li><form action=\"Messages_Form\"><button class=\"form1\" type=\"submit\"> <h2>Μυνήματα</h2></button></form></li>\r\n" + 
	      		"                <li><form action=\"index\"><button class=\"form1\" type=\"submit\"> <h2>Αποσύνδεση</h2></button></form></li>\r\n" + 
	      		"            </ul>\r\n" + 
	      		"\r\n" + 
	      		"\r\n" + 
	      		"\r\n" + 
	      		"\r\n" + 
	      		"        </fieldset>\r\n" + 
	      		"        <h2>  Ηλεκτρονική Πλατφόρμα Γραμματείας!</h2>\r\n" + 
	      		"        <img src=\"secretary.png\" style=\"width:500px;position:relative;float:right;\">\r\n"
	      		+ "<fieldset>" + 
	      		"  <h2><fieldset style=\"background-color:deepskyblue;\"><u>Αναθεση-Καθηγητών</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Id_Μαθημάτων - Μαθημα</div>  Καθηγητής          </h3>"
				+				
				" <span class=\"dot\"></span> <div class=\"column\"><fieldset><form action=\"Proffessor_Change1\">"
				+ " <select name=\"id_lesson\" style=\" background-color:deepskyblue; \"  >"
				+ " <option value=\"p11-Αναλυση1\"> p11-Αναλυση1 </option>  "
				+ "<option value=\"p12-Αρχές_Προγραμματισμού\"> p12-Αρχές_Προγραμματισμού </option>"
				+ "<option value=\"p13-Εισαγωγή_Στην_Επιστήμη_Υπολογιστών\"> p13-Εισαγωγή_Στην_Επιστήμη_Υπολογιστών </option>"
				+ "<option value=\"p14-Λογική_Σχεδίαση_Ψηφιακών_Συστημάτων\"> p14-Λογική_Σχεδίαση_Ψηφιακών_Συστημάτων </option>"
				+ "<option value=\"p15-ΜΑΘΗΜΑΤΙΚΑ_ΤΩΝ_ΥΠΟΛΟΓΙΣΤΩΝ \"> p15-ΜΑΘΗΜΑΤΙΚΑ_ΤΩΝ_ΥΠΟΛΟΓΙΣΤΩΝ </option>"
				+ "<option value=\"p16-ΤΕΧΝΟΛΟΓΙΕΣ_ΔΙΑΔΙΚΤΥΟΥ\"> p16-ΤΕΧΝΟΛΟΓΙΕΣ_ΔΙΑΔΙΚΤΥΟΥ </option>"
				+ "<option value=\"p17-ΑΓΓΛΙΚΑ_1\"> p17-ΑΓΓΛΙΚΑ_1 </option>"
				+ "<option value=\"p21-ΑΝΑΛΥΣΗ_2\"> p21-ΑΝΑΛΥΣΗ_2 </option>"
				+ "<option value=\"p22-ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ_ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ\"> p22-ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ_ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ </option>"
				+ "<option value=\"p23-ΑΡΧΙΤΕΚΤΟΝΙΚΗ_ΥΠΟΛΟΓΙΣΤΩΝ\"> p23-ΑΡΧΙΤΕΚΤΟΝΙΚΗ_ΥΠΟΛΟΓΙΣΤΩΝ </option>"
				+ "<option value=\"p24-ΔΙΑΚΡΙΤΑ_ΜΑΘΗΜΑΤΙΚΑ\"> p24-ΔΙΑΚΡΙΤΑ_ΜΑΘΗΜΑΤΙΚΑ </option>"
				+ "<option value=\"p25-ΔΟΜΕΣ_ΔΕΔΟΜΕΝΩΝ\"> p22-ΔΟΜΕΣ_ΔΕΔΟΜΕΝΩΝ </option>"
				+ "<option value=\"p26-ΕΦΑΡΜΟΣΜΕΝΗ_ΑΛΓΕΒΡΑ\"> p26-ΕΦΑΡΜΟΣΜΕΝΗ_ΑΛΓΕΒΡΑ </option>"
				+ "<option value=\"p27-ΑΓΓΛΙΚΑ_2\"> p27-ΑΓΓΛΙΚΑ_2 </option>"
				+ "<option value=\"p31-ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ_ΑΝΑΠΤΥΞΗ_ΕΦΑΡΜΟΓΩΝ\"> p31-ΑΝΤΙΚΕΙΜΕΝΟΣΤΡΕΦΗΣ_ΑΝΑΠΤΥΞΗ_ΕΦΑΡΜΟΓΩΝ </option>"
				+ "<option value=\"p32-ΛΕΙΤΟΥΡΓΙΚΑ_ΣΥΣΤΗΜΑΤΑ\"> p32-ΛΕΙΤΟΥΡΓΙΚΑ_ΣΥΣΤΗΜΑΤΑ </option>"
				+ "<option value=\"p33- ΜΑΘΗΜΑΤΙΚΟΣ_ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ\"> p33- ΜΑΘΗΜΑΤΙΚΟΣ_ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ </option>"
				+ "<option value=\"p34-ΜΕΤΑΓΛΩΤΤΙΣΤΕΣ\"> p34-ΜΕΤΑΓΛΩΤΤΙΣΤΕΣ </option>"
				+ "<option value=\"p35-ΠΙΘΑΝΟΤΗΤΕΣ_ΚΑΙ_ΣΤΑΤΙΣΤΙΚΗ\"> p35-ΠΙΘΑΝΟΤΗΤΕΣ_ΚΑΙ_ΣΤΑΤΙΣΤΙΚΗ </option>"
				+ "<option value=\"p36-ΜΑΝΑΤΖΜΕΝΤ\"> p36-ΜΑΝΑΤΖΜΕΝΤ </option>"
				+ "<option value=\"p37-ΑΓΓΛΙΚΑ_3\"> p37-ΑΓΓΛΙΚΑ_3 </option>"
				+ "<option value=\"p41-ΑΛΓΟΡΙΘΜΟΙ\"> p41-ΑΛΓΟΡΙΘΜΟΙ </option>"
				+ "<option value=\"p42-ΑΡΧΕΣ_ΚΑΙ_ΕΦΑΡΜΟΓΕΣ_ΣΗΜΑΤΩΝ_ΚΑΙ_ΣΥΣΤΗΜΑΤΩΝ\"> p42-ΑΡΧΕΣ_ΚΑΙ_ΕΦΑΡΜΟΓΕΣ_ΣΗΜΑΤΩΝ_ΚΑΙ_ΣΥΣΤΗΜΑΤΩΝ </option>"
				+ "<option value=\"p43-ΒΑΣΕΙΣ_ΔΕΔΟΜΕΝΩΝ\"> p43-ΒΑΣΕΙΣ_ΔΕΔΟΜΕΝΩΝ </option>"
				+ "<option value=\"p44-ΔΙΚΤΥΑ_ΥΠΟΛΟΓΙΣΤΩΝ\"> p44-ΔΙΚΤΥΑ_ΥΠΟΛΟΓΙΣΤΩΝ </option>"
				+ "<option value=\"p45-ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ_ΣΤΟ_ΔΙΑΔΙΚΤΥΟ_ΚΑΙ_ΤΟΝ_ΠΑΓΚΟΣΜΙΟ_ΙΣΤΟ\"> p45-ΠΡΟΓΡΑΜΜΑΤΙΣΜΟΣ_ΣΤΟ_ΔΙΑΔΙΚΤΥΟ_ΚΑΙ_ΤΟΝ_ΠΑΓΚΟΣΜΙΟ_ΙΣΤΟ </option>"
				+ "<option value=\"p46-ΞΕΝΟΓΛΩΣΣΗ_ΟΡΟΛΟΓΙΑ_ΤΗΣ_ΠΛΗΡΟΦΟΡΙΚΗΣ\"> p46-ΞΕΝΟΓΛΩΣΣΗ_ΟΡΟΛΟΓΙΑ_ΤΗΣ_ΠΛΗΡΟΦΟΡΙΚΗΣ </option>"
				+ "<option value=\"p47-ΑΓΓΛΙΚΑ_4\"> p47-ΑΓΓΛΙΚΑ_4 </option>"
				+ "<option value=\"p51-ΑΛΛΗΛΕΠΙΔΡΑΣΗ_ΑΝΘΡΩΠΟΥ_ΚΑΙ_ΥΠΟΛΟΓΙΣΤΗ\"> p51-ΑΛΛΗΛΕΠΙΔΡΑΣΗ_ΑΝΘΡΩΠΟΥ_ΚΑΙ_ΥΠΟΛΟΓΙΣΤΗ </option>"
				+ "<option value=\"p52-ΑΝΑΓΝΩΡΙΣΗ_ΠΡΟΤΥΠΩΝ\"> p52-ΑΝΑΓΝΩΡΙΣΗ_ΠΡΟΤΥΠΩΝ </option>"
				+ "<option value=\"p53-ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ\"> p53-ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ </option>"
				+ "<option value=\"p54-ΚΡΥΠΤΟΓΡΑΦΙΑ\"> p54-ΚΡΥΠΤΟΓΡΑΦΙΑ </option>"
				+ "<option value=\"p55-ΠΡΟΗΓΜΕΝΑ_ΘΕΜΑΤΑ_ΕΠΙΚΟΙΝΩΝΙΩΝ\"> p55-ΠΡΟΗΓΜΕΝΑ_ΘΕΜΑΤΑ_ΕΠΙΚΟΙΝΩΝΙΩΝ </option>"
				+ "<option value=\"p56- ΠΡΟΗΓΜΕΝΗ_ΑΡΧΙΤΕΚΤΟΝΙΚΗ_ΥΠΟΛΟΓΙΣΤΩΝ\"> p56- ΠΡΟΗΓΜΕΝΗ_ΑΡΧΙΤΕΚΤΟΝΙΚΗ_ΥΠΟΛΟΓΙΣΤΩΝ </option>"
				+ "<option value=\"p57-ΑΓΓΛΙΚΑ_5\"> p57-ΑΓΓΛΙΚΑ_5 </option>"
				+ "<option value=\"p61-ΤΕΧΝΗΤΗ_ΝΟΗΜΟΣΥΝΗ_ΚΑΙ_ΕΜΠΕΙΡΑ_ΣΥΣΤΗΜΑΤΑ\"> p61-ΤΕΧΝΗΤΗ_ΝΟΗΜΟΣΥΝΗ_ΚΑΙ_ΕΜΠΕΙΡΑ_ΣΥΣΤΗΜΑΤΑ </option>"
				+ "<option value=\"p62-ΤΕΧΝΟΛΟΓΙΑ_ΛΟΓΙΣΜΙΚΟΥ\"> p62-ΤΕΧΝΟΛΟΓΙΑ_ΛΟΓΙΣΜΙΚΟΥ </option>"
				+ "<option value=\"p63-ΔΙΟΙΚΗΣΗ_ΑΣΦΑΛΕΙΑΣ_ΣΥΣΤΗΜΑΤΩΝ\"> p63-ΔΙΟΙΚΗΣΗ_ΑΣΦΑΛΕΙΑΣ_ΣΥΣΤΗΜΑΤΩΝ </option>"
				+ "<option value=\"p64-ΣΥΣΤΗΜΑΤΑ_ΥΠΟΣΤΗΡΙΞΗΣ_ΑΠΟΦΑΣΕΩΝ\"> p64-ΣΥΣΤΗΜΑΤΑ_ΥΠΟΣΤΗΡΙΞΗΣ_ΑΠΟΦΑΣΕΩΝ </option>"
				+ "<option value=\"p65-ΣΥΣΤΗΜΙΚΗ_ΑΝΑΛΥΣΗ\"> p65-ΣΥΣΤΗΜΙΚΗ_ΑΝΑΛΥΣΗ </option>"
				+ "<option value=\"p66-ΔΙΚΤΥΑ_ΥΨΗΛΩΝ_ΤΑΧΥΤΗΤΩΝ\"> p66-ΔΙΚΤΥΑ_ΥΨΗΛΩΝ_ΤΑΧΥΤΗΤΩΝ </option>"
				+ "<option value=\"p67-ΑΓΓΛΙΚΑ_6\"> p67-ΑΓΓΛΙΚΑ_6 </option>"
				+ "<option value=\"p71-ΑΠΟΘΗΚΕΣ_ΔΕΔΟΜΕΝΩΝ_ΚΑΙ_ΕΞΟΡΥΞΗ_ΓΝΩΣΗΣ\"> p71-ΑΠΟΘΗΚΕΣ_ΔΕΔΟΜΕΝΩΝ_ΚΑΙ_ΕΞΟΡΥΞΗ_ΓΝΩΣΗΣ </option>"
				+ "<option value=\"p72-ΑΣΦΑΛΕΙΑ_ΠΛΗΡΟΦΟΡΙΑΚΩΝ_ΣΥΣΤΗΜΑΤΩΝ\"> p47-ΑΓΓΛΙΚΑ_4 </option>"
				+ "<option value=\"p73-ΠΡΟΣΟΜΟΙΩΣΗ_ΣΥΣΤΗΜΑΤΩΝ\"> p73-ΠΡΟΣΟΜΟΙΩΣΗ_ΣΥΣΤΗΜΑΤΩΝ </option>"
				+ "<option value=\"p74-ΑΝΑΚΤΗΣΗ_ΠΛΗΡΟΦΟΡΙΑΣ_ΚΑΙ_ΑΝΑΖΗΤΗΣΗ_ΣΤΟΝ_ΠΑΓΚΟΣΜΙΟ_ΙΣΤΟ\"> p74-ΑΝΑΚΤΗΣΗ_ΠΛΗΡΟΦΟΡΙΑΣ_ΚΑΙ_ΑΝΑΖΗΤΗΣΗ_ΣΤΟΝ_ΠΑΓΚΟΣΜΙΟ_ΙΣΤΟ </option>"
				+ "<option value=\"p75-ΤΕΧΝΟΛΟΓΙΕΣ_ΑΝΑΠΤΥΞΗ_ΗΛΕΚΤΡΟΝΙΚΩΝ_ΠΑΙΧΝΙΔΙΩΝ\"> p75-ΤΕΧΝΟΛΟΓΙΕΣ_ΑΝΑΠΤΥΞΗ_ΗΛΕΚΤΡΟΝΙΚΩΝ_ΠΑΙΧΝΙΔΙΩΝ </option>"
				+ "<option value=\"p76-ΓΕΩΓΡΑΦΙΚΑ_ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ \"> p76-ΓΕΩΓΡΑΦΙΚΑ_ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ  </option>"
				+ "<option value=\"p77-ΑΓΓΛΙΚΑ_7\"> p77-ΑΓΓΛΙΚΑ_7 </option>"
				+ "<option value=\"p81-ΔΙΟΙΚΗΤΙΚΗ_ΠΛΗΡΟΦΟΡΙΚΗ\"> p81-ΔΙΟΙΚΗΤΙΚΗ_ΠΛΗΡΟΦΟΡΙΚΗ </option>"
				+ "<option value=\"p82-ΗΛΕΚΤΡΟΝΙΚΟ_ΕΠΙΧΕΙΡΕΙΝ_ΚΑΙ_ΚΑΙΝΟΤΟΜΙΑ\"> p82-ΗΛΕΚΤΡΟΝΙΚΟ_ΕΠΙΧΕΙΡΕΙΝ_ΚΑΙ_ΚΑΙΝΟΤΟΜΙΑ </option>"
				+ "<option value=\"p83-ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ_ΣΤΟ_ΔΙΑΔΙΚΤΥΟ\"> p83-ΠΛΗΡΟΦΟΡΙΑΚΑ_ΣΥΣΤΗΜΑΤΑ_ΣΤΟ_ΔΙΑΔΙΚΤΥΟ </option>"
				+ "<option value=\"p84- ΑΣΦΑΛΕΙΑ_ΔΙΚΤΥΩΝ\"> p84- ΑΣΦΑΛΕΙΑ_ΔΙΚΤΥΩΝ </option>"
				+ "<option value=\"p85-Συστήματα_Διασφάλισης_Ποιότητας \"> p85-Συστήματα_Διασφάλισης_Ποιότητας  </option>"
				+ "<option value=\"p86-ΨΗΦΙΑΚΕΣ_ΒΙΒΛΙΟΘΗΚΕΣ\"> p86-ΨΗΦΙΑΚΕΣ_ΒΙΒΛΙΟΘΗΚΕΣ </option>"
				+ "<option value=\"p87-ΑΓΓΛΙΚΑ_8\"> p87-ΑΓΓΛΙΚΑ_8 </option>"
				+ "</select>"
				+ " </fieldset></div>  <div class=\"column\">  <fieldset><input type=\"text\"   value=\" \" name=\"Lastname\" required><input type=\"text\"   value=\"  \" name=\"id_lesson\"></fieldset></div>  \r\n" + 
				"           \r\n" + 
				"<button style=\"width:auto;\"  > Show_Proffessor</button></form>"+
				"        <br></br>\r\n" +  
				 
				
				
				
				

				
				"</fieldset>"
				+ "</fieldset>"+
	      		  
	      		"</body>\r\n" + 
	      		"</html>");
	      
	}

}
