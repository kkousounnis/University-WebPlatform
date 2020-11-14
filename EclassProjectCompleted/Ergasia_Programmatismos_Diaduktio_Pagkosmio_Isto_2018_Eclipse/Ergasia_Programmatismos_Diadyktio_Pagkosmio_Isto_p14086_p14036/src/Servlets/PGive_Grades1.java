package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Lesson; 

/**
 * Servlet implementation class PGive_Grades1
 */
@WebServlet("/PGive_Grades1")
public class PGive_Grades1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PGive_Grades1() {
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
		
		Lesson l=new Lesson();
		
		l.setId_Lnumber(request.getParameter("id_lesson") );
		
		
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
		      		+ "<fieldset>" + 
		      		"  <h2><fieldset style=\"background-color:deepskyblue;\"><u>Δωστε βαθμολογία "+l.getId_Lnumber()+" </u></fieldset></h2>"
		      		+ " id_Μαθηματος:<form action=\"CheckProffessorPassingGrades\"><input type=\"text\"   value=\" "+l.getId_Lnumber()+" \" name=\"id_lesson\" required>"
					+ "<h3><div class=\"column\">  Id_Φοιτητή </div> Βαθμολογία-Φοιτητή         </h3>"
					+				
					" <span class=\"dot\"></span> <div class=\"column\"><fieldset>"
					+ " "
					+ ""
					+ ""
					
					+ " "
					+ "Δώστε το id:<input type=\"text\" minlength=\"5\" maxlength=\"5\" size=\"5\"  value=\"p0000\"  name=\"id_student\" >"
					+"<br></br>Δώστε το id:<input type=\"text\" minlength=\"5\" maxlength=\"5\" size=\"5\"  value=\"p0000\" name=\"id_student1\" >"
					+"<br></br>Δώστε το id:<input type=\"text\" minlength=\"5\" maxlength=\"5\" size=\"5\"  value=\"p0000\" name=\"id_student2\" >"
					+"<br></br>Δώστε το id:<input type=\"text\" minlength=\"5\" maxlength=\"5\" size=\"5\"  value=\"p0000\" name=\"id_student3\" >" 
					 
					+ " </fieldset></div>  <div class=\"column\">   <fieldset>"
					+           "Βαθμός:<input type=\"number\"   value=\"   \" name=\"grade\"  min=\"5\" max=\"10\">"
					+ "<br></br>Βαθμός:<input type=\"number\"   value=\"     \" name=\"grade1\" min=\"5\" max=\"10\" >"
					+ "<br></br>Βαθμός:<input type=\"number\"   value=\"     \" name=\"grade2\" min=\"5\" max=\"10\" >"
					+ "<br></br>Βαθμός:<input type=\"number\"   value=\"     \" name=\"grade3\" min=\"5\" max=\"10\">" 					 	
					+ "</fieldset></div>  \r\n" + 
					"           \r\n" + 
					"<button style=\"width:auto;background:deepskyblue;\"  > Pass_Grades</button></form>"+
					"        <br></br>\r\n" +  
					 
					
					
					
					

					
					"</fieldset>"
					+ "</fieldset>"+
		      		  
		      		"</body>\r\n" + 
		      		"</html>");
		
		
	}

}
