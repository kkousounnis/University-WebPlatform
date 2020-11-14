package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Lesson;
import Classes.Proffessor; 
import Main.CreateTableProffessorLesson;
import Main.TakeFullnameProffessorForSuccesfulupdate; 
import Main.UpdateTableProffessorLesson;
 

/**
 * Servlet implementation class CheckProffessorchange
 */
@WebServlet("/CheckProffessorchange")
public class CheckProffessorchange extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckProffessorchange() {
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
		
		
		boolean x=false;
		
		Proffessor p=new Proffessor();
		Lesson l=new Lesson();
		CreateTableProffessorLesson CTPL=new CreateTableProffessorLesson();
		
		
		UpdateTableProffessorLesson UTPL=new UpdateTableProffessorLesson();
		
		
		
		
		
		
		
		
		l.setId_Lnumber(request.getParameter("id_lesson")); 
		p.setId_Proffessor(request.getParameter("id_proffessor_old"));
		String id_proffessor_new=request.getParameter("id_proffessor_new");
		
		
		
		System.out.println(p.getId_Proffessor()  );
		System.out.println(l.getId_Lnumber());
		

		
		
		String [] id_lesson=l.getId_Lnumber().split("-");
		String [] id_proffessor=p.getId_Proffessor().split("-");
		
		CTPL.CreateTable_ProffessorLesson(); 
		 
		 
		
		
		if(id_proffessor_new!="") {
			if(id_proffessor_new.matches("^[T00-6]+$")==true) {
				if(id_proffessor_new.equals("T00")==false) {
					UTPL.DeleteRow(id_lesson[0], id_proffessor[0],id_proffessor_new);
					x=true;
				}
			}
		
		}
		else {
			x=false;
		}
		
		TakeFullnameProffessorForSuccesfulupdate TFPFS=new TakeFullnameProffessorForSuccesfulupdate();
		 String fullnameprof="";
		 fullnameprof=TFPFS.TakeVal_NameProff(id_lesson[0]);
		 String fullnameproffessor[]=fullnameprof.split(",");
		  
		 
		 
		 
		 if(x==true) {
				// Create cookies for first and last names. 
				 
		 
			  out.print(" <!DOCTYPE html>\r\n" + 
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
			  		"        }\r\n" + 
			  		"    </style>\r\n" + 
			  		"</head>\r\n" + 
			  		"<body>\r\n" + 
			  		"\r\n" + 
			  		"    <div class=\"container\">\r\n" + 
			  		"        <img src=\"university_icon.png\" style=\"width:150px;float:left;\">\r\n" + 
			  		"    </div>\r\n" + 
			  		"\r\n" + 
			  		"    <div class=\"title\">\r\n" + 
			  		"        <a href=\"User_menu.html\">\r\n" + 
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
			  		"                <li><form action=\"Proffessor_Change\">   <button class=\"form1\" type=\"submit\"> <h2>Aλλαγή Καθηγητών</h2></button> </form></li>              \r\n" + 
			  		"                <li><form action=\"Messages_Form\"><button class=\"form1\" type=\"submit\"> <h2>Μυνήματα</h2></button></form></li>\r\n" + 
			  		"                <li><form action=\"index\"><button class=\"form1\" type=\"submit\"> <h2>Αποσύνδεση</h2></button></form></li>\r\n" + 
			  		"            </ul>\r\n" + 
			  		"\r\n" + 
			  		"\r\n" + 
			  		"\r\n" + 
			  		"\r\n" + 
			  		"        </fieldset>\r\n" + 
			  		"        <h2>  Ηλεκτρονική Πλατφόρμα Γραμματείας!</h2>\r\n" + 
			  		"        <img src=\"secretary.png\" style=\"width:500px;position:relative;float:right;\">\r\n" + 
			  		"        <h3 style=\"position: absolute; left:25% \">\r\n" + 
			  		"          \r\n"
			  		+ "<br></br>"
			  		+ "<br></br>"
			  		+ "<br></br>" + 			  		 
			  		"            <h1 style=\"color:green;\">Η ενημέρωση του καθηγητή στο μάθημα έγινε με επιτυχία!!!</h1>  \r\n"
			  		+ "<br></br> <fieldset>  <h3 style=\"color:green;\">Η Αλλαγή που έγινε στην βάση είναι η εξής:"
			  		+ "<br></br> To όνομα του μαθήματος που επιλέξατε και το id του: "+id_lesson[0] +" "+id_lesson[1]+" "
			  				+ "<br></br>To ονοματεπώνυμο του καθηγητή:   "+fullnameproffessor[0]+" "+fullnameproffessor[1]+""
			  						+ "<br></br>Το id του καθηγητή:   "+id_proffessor_new+" "
			  								+ "</fieldset>"
			  								+ "   <h3>" + 
			  		"\r\n" + 
			  		"             \r\n" + 
			  		"        </h3>\r\n" + 
			  		"\r\n" + 
			  		"    </fieldset>\r\n" + 
			  		"\r\n" + 
			  		"    <br>\r\n" + 
			  		"    <br>\r\n" + 
			  		"\r\n" + 
			  		"</body>\r\n" + 
			  		"</html> ");
				
			}
			else {
				
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
				 		"        }\r\n" + 
				 		"    </style>\r\n" + 
				 		"</head>\r\n" + 
				 		"<body>\r\n" + 
				 		"\r\n" + 
				 		"    <div class=\"container\">\r\n" + 
				 		"        <img src=\"university_icon.png\" style=\"width:150px;float:left;\">\r\n" + 
				 		"    </div>\r\n" + 
				 		"\r\n" + 
				 		"    <div class=\"title\">\r\n" + 
				 		"        <a href=\"User_menu.html\">\r\n" + 
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
				 		"                <li><form action=\"Proffessor_Change\">   <button class=\"form1\" type=\"submit\"> <h2>Aλλαγή Καθηγητών</h2></button> </form></li>              \r\n" + 
				 		"                <li><form action=\"Messages_Form\"><button class=\"form1\" type=\"submit\"> <h2>Μυνήματα</h2></button></form></li>\r\n" + 
				 		"                <li><form action=\"index\"><button class=\"form1\" type=\"submit\"> <h2>Αποσύνδεση</h2></button></form></li>\r\n" + 
				 		"            </ul>\r\n" + 
				 		"\r\n" + 
				 		"\r\n" + 
				 		"\r\n" + 
				 		"\r\n" + 
				 		"        </fieldset>\r\n" + 
				 		"        <h2>  Ηλεκτρονική Πλατφόρμα Γραμματείας!</h2>\r\n" + 
				 		"        <img src=\"secretary.png\" style=\"width:500px;position:relative;float:right;\">\r\n" + 
				 		"        <h3 style=\"position: absolute; left:25% \">\r\n" + 
				 		"          \r\n" + 
				 		"            <h2 style=\"color:red;\" ><br></br>Τα στοιχεια που συμπληρωσατε δεν ειναι σωστα η ενημέρωση του καθηγητή στο μαθημα δεν εγινε.Παρακαλώ προσπαθήστε ξανά </h2>\r\n" + 
				 		"\r\n" + 
				 		"             \r\n" + 
				 		"        </h3>\r\n" + 
				 		"\r\n" + 
				 		"    </fieldset>\r\n" + 
				 		"\r\n" + 
				 		"    <br>\r\n" + 
				 		"    <br>\r\n" + 
				 		"\r\n" + 
				 		"</body>\r\n" + 
				 		"</html>");
				 out.print("<meta http-equiv=\"refresh\" content=\"5; URL='Proffessor_Change'\" />");
				//ÎµÎ´Ï‰ Ï€Ï�ÎµÏ€ÎµÎ¹ Î½Î± Î¼Ï€ÎµÎ¹ Î¿ ÎµÎ»Î³Ï‡Î¿Ï‚
				
			}
		 
	}

}
