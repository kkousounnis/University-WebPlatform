package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Proffessor;
import Main.CheckDbexists;
import Main.CompareProffessorValuesLogin;
import Main.CreateTableGrades;
import Main.CreateTableLesson;
import Main.CreateTableProffessor;
import Main.CreateTableSecretary;

/**
 * Servlet implementation class Proffessor_Login_Check
 */
@WebServlet("/TeacherLoginCheck")
public class Proffessor_Login_Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Proffessor_Login_Check() {
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
		
		
		CheckDbexists Cdb=new CheckDbexists();
		CreateTableGrades CTG=new CreateTableGrades();
		CreateTableSecretary CTS=new CreateTableSecretary();
		CreateTableLesson CTL =new CreateTableLesson();
		CreateTableProffessor CTP=new CreateTableProffessor();
		CompareProffessorValuesLogin cpv=new CompareProffessorValuesLogin();
		
		Proffessor p=new Proffessor();
		
		CTS.CreateTable_Secretary();
	    CTP.CreateTable_Proffessor();
		
		
		Cdb.CheckDbCreateTable();
		p.setUsername(request.getParameter("username"));
		p.setPassword(request.getParameter("psw"));
		boolean x=false;
		
		x=cpv.CompareProffessorLogin(p.getUsername(),p.getPassword());
		
		if(x==true) {
			// Create cookies for first and last names. 
			Cookie Username =new Cookie("username",request.getParameter("username"));
			Cookie Password =new Cookie("password",request.getParameter("psw"));
			
			// Set expiry date after 24 Hrs for both the cookies.
			Username.setMaxAge(60*60*24);
			Password.setMaxAge(60*60*24);
			
			// Add both the cookies in the response header.
		      response.addCookie( Username );
		      response.addCookie( Password );
		      CTG.CreateTableGrade();
		      
		     CTL.CreateTable_Lesson();
		  System.out.println("Me lene mitso"+p.getUsername()+p.getPassword());
			out.print(""
					+ "<meta http-equiv=\"refresh\" content=\"0; URL='Proffessor_menu.html'\" />");
			
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
				 		"    	.column {\r\n" + 
				 		"  			width: 50%;\r\n" + 
				 		"  			padding: 0 25px;\r\n" + 
				 		" 			-webkti-box-sizing: border-box;\r\n" + 
				 		"  			-moz-box-sizing: border-box;\r\n" + 
				 		"  			box-sizing: border-box;\r\n" + 
				 		"  			float: left;\r\n" + 
				 		"		 }\r\n" + 
				 		"		  \r\n" + 
				 		"        .field {\r\n" + 
				 		"            width:13%;\r\n" + 
				 		"            \r\n" + 
				 		"            padding:auto;\r\n" + 
				 		"            height:auto ;\r\n" + 
				 		"            background-color:deepskyblue;\r\n" + 
				 		"            float:left;\r\n" + 
				 		"            height:100%;\r\n" + 
				 		"            \r\n" + 
				 		"        }\r\n" + 
				 		"        .field1 {\r\n" + 
				 		"        	\r\n" + 
				 		"            width:auto;\r\n" + 
				 		"            border-radius:15px;\r\n" + 
				 		"            padding:auto;\r\n" + 
				 		"            height:75% ;\r\n" + 
				 		"            background-color:white;\r\n" + 
				 		"            float:center;\r\n" + 
				 		"            position:relative;\r\n" + 
				 		"            \r\n" + 
				 		"        }\r\n" + 
				 		"        \r\n" + 
				 		"        body {\r\n" + 
				 		"            background-color:white;\r\n" + 
				 		"        }\r\n" + 
				 		"        .container {       \r\n" + 
				 		"            padding:10px; \r\n" + 
				 		"            height: 45px;\r\n" + 
				 		"            float:left;\r\n" + 
				 		"                    \r\n" + 
				 		"        }\r\n" + 
				 		"\r\n" + 
				 		"        .title {\r\n" + 
				 		"            border-radius: 15px 50px 30px 5px;\r\n" + 
				 		"            background-color: deepskyblue;\r\n" + 
				 		"            color:white;\r\n" + 
				 		"            height:70px;\r\n" + 
				 		"                        \r\n" + 
				 		"        }\r\n" + 
				 		"        .userbutton {\r\n" + 
				 		"            background-color:white;\r\n" + 
				 		"            border-radius:15px;\r\n" + 
				 		"            padding:auto;\r\n" + 
				 		"            width:150px;\r\n" + 
				 		"            height:100px;\r\n" + 
				 		"\r\n" + 
				 		"        }\r\n" + 
				 		"        .adminbutton {\r\n" + 
				 		"            background-color:white;\r\n" + 
				 		"            border-radius:15px;\r\n" + 
				 		"\r\n" + 
				 		"        }\r\n" + 
				 		"        .refresh {\r\n" + 
				 		"            background-color: deepskyblue;\r\n" + 
				 		"            border-radius: 15px;\r\n" + 
				 		"            float: right;\r\n" + 
				 		"            width: 50px;\r\n" + 
				 		"            height: 50px;\r\n" + 
				 		"            color:white;\r\n" + 
				 		"        }\r\n" + 
				 		"        ul {\r\n" + 
				 		"            list-style-type: none;\r\n" + 
				 		"            margin: 0;\r\n" + 
				 		"            padding: 0;\r\n" + 
				 		"            width: 200px;\r\n" + 
				 		"            background-color: deepskyblue;\r\n" + 
				 		"        }\r\n" + 
				 		"         \r\n" + 
				 		"        li .form1{\r\n" + 
				 		"            border-radius: 15px;\r\n" + 
				 		"        	display: block;\r\n" + 
				 		"        	background-color:deepskyblue;\r\n" + 
				 		"        	position:relative;\r\n" + 
				 		"            color: #000;\r\n" + 
				 		"            padding:30px 16px;\r\n" + 
				 		"            width:75%;\r\n" + 
				 		"            text-decoration: none;\r\n" + 
				 		"        }\r\n" + 
				 		"        li .form1:hover {\r\n" + 
				 		"                border-radius: 15px;\r\n" + 
				 		"                background-color: #555;\r\n" + 
				 		"                color: white;\r\n" + 
				 		"         \r\n" + 
				 		"        .dot {\r\n" + 
				 		"            height: 10px;\r\n" + 
				 		"            width: 10px;\r\n" + 
				 		"            background-color: black;\r\n" + 
				 		"            border-radius: 50%;\r\n" + 
				 		"            display: inline-block;\r\n" + 
				 		"        }\r\n" + 
				 		"\r\n" + 
				 		"            \r\n" + 
				 		"    </style>\r\n" + 
				 		"</head>\r\n" + 
				 		"<body>\r\n" + 
				 		"    \r\n" + 
				 		"    <div class=\"container\">\r\n" + 
				 		"        <img src=\"university_icon.png\" style=\"width:150px;float:left;\"> \r\n" + 
				 		"    </div>\r\n" + 
				 		"   \r\n" + 
				 		"    <div class=\"title\">\r\n" + 
				 	 
				 		"        <h2>Ηλεκτρονική Πλατφόρμα Πανεπιστημίου </h2>\r\n" + 
				 		"        \r\n" + 
				 		"        \r\n" + 
				 		"        \r\n" + 
				 		"    </div>\r\n" + 
				 		"    <p>&nbsp;</p>\r\n" + 
				 		"    <fieldset class=\"field1\">\r\n" + 
				 		"             \r\n" + 
				 		"        <img src=\"back.jpg\" style=\"width:500px;position:relative;float:right;\"> \r\n" + 
				 		"        <h3 style=\"position: absolute;  left:25% \">\r\n" + 
				 		" <h1 style=\" color :red; \">Εχετε  πληκτρολογήση λάθος τα στοιχεία σας </h1>   "+
				 		"        </h3>\r\n" + 
				 		"        \r\n" + 
				 		"    </fieldset>\r\n" + 
				 		"      \r\n" + 
				 		"   <br>\r\n" + 
				 		"    <br>\r\n" + 
				 		"    \r\n" + 
				 		"</body>\r\n" + 
				 		"</html>");
			 out.print("<meta http-equiv=\"refresh\" content=\"1; URL='Teacher_Login.html'\" />");
			//ÎµÎ´Ï‰ Ï€Ï�ÎµÏ€ÎµÎ¹ Î½Î± Î¼Ï€ÎµÎ¹ Î¿ ÎµÎ»Î³Ï‡Î¿Ï‚
			
		}
		
		 
	}

}
