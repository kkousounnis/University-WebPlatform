package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Lesson; 
import Classes.Student;
import Main.InsertGrades;

/**
 * Servlet implementation class CheckProffessorPassingGrades
 */
@WebServlet("/CheckProffessorPassingGrades")
public class CheckProffessorPassingGrades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckProffessorPassingGrades() {
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
		
		boolean id=false,id1=false,id2=false,id3=false,id4=false;
		
		
		InsertGrades IVTG=new InsertGrades();
		
		Student s=new Student();	
		Lesson l=new Lesson();
		
		
		if(request.getParameter("id_student")!="") {//ELEGXOS AN YPARXEI TO ID TOY FOITHTH
			if(request.getParameter("id_student").matches("^[p0-90-90-90-90-9]+$")==true) {
				s.setId_student(request.getParameter("id_student"));
			}else {
				s.setId_student("p0000");
			}
			
		}
		String grade="";
		grade=request.getParameter("grade");
		
		if(grade!="") {//ELEGXOS AN YPARXEI O BA8MOS
		l.setGrade(Integer.parseInt(grade));		 
		}
		
		l.setId_Lnumber(request.getParameter("id_lesson"));
		String [] id_Lesson=l.getId_Lnumber().split("-"); 
		if(s.getId_student().equals("p0000") || s.getId_student().length()!=5 ) {//ELEGXOS GIA TO AN 8A KANW EISAGWGH TVN DEDOMENWN MOU
			id=false; 
		}else {
			
			id=IVTG.InsertValuestoGrades(s.getId_student(), id_Lesson[0], l.getGrade());
			
		}
		
		
		
		if(request.getParameter("id_student1")!=""   ) {//ELEGXOS AN YPARXEI TO ID TOY FOITHTH
			if(request.getParameter("id_student1").matches("^[p0-90-90-90-90-9]+$")==true) {
				s.setId_student(request.getParameter("id_student1")); 
			}else {
				s.setId_student("p0000");
			}
			
			 
		}
		String grade1="";
		grade1=request.getParameter("grade1");
		
		if(grade1!="") {//ELEGXOS AN YPARXEI O BA8MOS
		l.setGrade(Integer.parseInt(grade1));		 
		}
		
		
		if(s.getId_student().equals("p0000") || s.getId_student().length()!=5 ) {//ELEGXOS GIA TO AN 8A KANW EISAGWGH TVN DEDOMENWN MOU
			id1=false; 
		}else {
			
			id1=IVTG.InsertValuestoGrades(s.getId_student(), id_Lesson[0], l.getGrade());
			
		}
		
		
		
		
		
		if(request.getParameter("id_student2")!="") {//ELEGXOS AN YPARXEI TO ID TOY FOITHTH
			if(request.getParameter("id_student2").matches("^[p0-90-90-90-90-9]+$")==true) {
			s.setId_student(request.getParameter("id_student2"));
			}else {
				s.setId_student("p0000");
			}
		}
		String grade2="";
		grade2=request.getParameter("grade2");
		
		if(grade2!="") {//ELEGXOS AN YPARXEI O BA8MOS
		l.setGrade(Integer.parseInt(grade2));		 
		}
		
		
		if(s.getId_student().equals("p0000") || s.getId_student().length()!=5 ) {//ELEGXOS GIA TO AN 8A KANW EISAGWGH TVN DEDOMENWN MOU
			id2=false; 
		}else {
			
			id2=IVTG.InsertValuestoGrades(s.getId_student(), id_Lesson[0], l.getGrade());
			
		}
		
		
		if(request.getParameter("id_student3")!="") {//ELEGXOS AN YPARXEI TO ID TOY FOITHTH
			if(request.getParameter("id_student3").matches("^[p0-90-90-90-90-9]+$")==true) {
			s.setId_student(request.getParameter("id_student3"));
			}else {
				s.setId_student("p0000");
			}
		}
		String grade3="";
		grade3=request.getParameter("grade3");
		
		if(grade3!="") {//ELEGXOS AN YPARXEI O BA8MOS
		l.setGrade(Integer.parseInt(grade3));		 
		}
		
		
		if(s.getId_student().equals("p0000") || s.getId_student().length()!=5 ) {//ELEGXOS GIA TO AN 8A KANW EISAGWGH TVN DEDOMENWN MOU
			id3=false; 
		}else {
			
			id3=IVTG.InsertValuestoGrades(s.getId_student(), id_Lesson[0], l.getGrade());
			
		}
		
		
		 
		
		
		
		
		
		if(id==true || id1==true || id2==true || id3==true || id4==true) {
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
		      		"        <a href=\"PGive_Grades\">\r\n" + 
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
		      		"           <ul>\r\n" + 
		      		"                <br></br>\r\n" + 
		      		"                <li><form action=\"Proffessor_menu.html\"><button class=\"form1\" type=\"submit\">  <h2> Aρχική </h2></button></form></li>\r\n" + 
		      		"                <li><form action=\"PGive_Grades\">   <button class=\"form1\" type=\"submit\"> <h2>Αναθεση Βαθμολογίας</h2></button> </form></li>        \r\n" + 
		      		"                <li><form action=\"index\"><button class=\"form1\" type=\"submit\"> <h2>Αποσύνδεση</h2></button></form></li>\r\n" + 
		      		"            </ul>" + 
		      		"\r\n" + 
		      		"\r\n" + 
		      		"\r\n" + 
		      		"\r\n" + 
		      		"        </fieldset>\r\n" + 
		      		"        <h2>  Ηλεκτρονική Πλατφόρμα Γραμματείας!</h2>\r\n" + 
		      		"        <img src=\"secretary.png\" style=\"width:500px;position:relative;float:right;\">\r\n"
		      		+ "<fieldset>" 
					+ "<h2 style=\" color:green;  \">Οι βαθμολογίες που  πέρασαν με επιτυχία είναι</h2>");
					  
					if(id==true) {
		 			out.print("<h3 style=\" color:green;  \">Πέρασε η βαθμολογία του:   "+request.getParameter("id_student")+" </h3> ");
		 			}
					if(id1==true) {
			 			out.print("<h3 style=\" color:green;  \">Πέρασε η βαθμολογία του:   "+request.getParameter("id_student1")+" </h3> ");
			 			}
					if(id2==true) {
			 			out.print("<h3 style=\" color:green;  \">Πέρασε η βαθμολογία του:   "+request.getParameter("id_student2")+" </h3> ");
			 			}
					if(id3==true) {
			 			out.print("<h3 style=\" color:green;  \">Πέρασε η βαθμολογία του:   "+request.getParameter("id_student3")+" </h3> ");
			 			}
					
					
					
					out.print("</fieldset>"
					+ "</fieldset>"+
		      		  
		      		"</body>\r\n" + 
		      		"</html>");
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
		      		"        <a href=\"PGive_Grades\">\r\n" + 
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
		      		"           <ul>\r\n" + 
		      		"                <br></br>\r\n" + 
		      		"                <li><form action=\"Proffessor_menu.html\"><button class=\"form1\" type=\"submit\">  <h2> Aρχική </h2></button></form></li>\r\n" + 
		      		"                <li><form action=\"PGive_Grades\">   <button class=\"form1\" type=\"submit\"> <h2>Αναθεση Βαθμολογίας</h2></button> </form></li>        \r\n" + 
		      		"                <li><form action=\"index\"><button class=\"form1\" type=\"submit\"> <h2>Αποσύνδεση</h2></button></form></li>\r\n" + 
		      		"            </ul>" + 
		      		"\r\n" + 
		      		"\r\n" + 
		      		"\r\n" + 
		      		"\r\n" + 
		      		"        </fieldset>\r\n" + 
		      		"        <h2>  Ηλεκτρονική Πλατφόρμα Γραμματείας!</h2>\r\n" + 
		      		"        <img src=\"secretary.png\" style=\"width:500px;position:relative;float:right;\">\r\n"
		      		+ "<fieldset>" 	 
					+ "<h2 style=\" color:red;  \"> Οι βαθμόλογίες δεν εχουν περάσει παρακαλώ προσπαθήστε ξανά</h2>"
					  
					 
					
					
					
					

					
					 
					+ "</fieldset>"+
		      		  
		      		"</body>\r\n" + 
		      		"</html>");
			
		}
	}

}
