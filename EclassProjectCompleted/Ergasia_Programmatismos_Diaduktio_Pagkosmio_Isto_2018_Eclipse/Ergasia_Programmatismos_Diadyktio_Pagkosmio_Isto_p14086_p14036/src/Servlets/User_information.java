package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Student;
import Main.TakeUserValues;

/**
 * Servlet implementation class User_information
 */
@WebServlet("/User_information")
public class User_information extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User_information() {
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
		Student s=new Student();
		TakeUserValues tuv=new TakeUserValues();
		
		 Cookie cookie = null;
	      Cookie[] cookies = null;
	      
	      // Get an array of Cookies associated with this domain
	      cookies = request.getCookies();
	      
	      if(cookies!=null) {
	    	  for (int i=0;i<cookies.length;i++) {
	    		  cookie = cookies[i];
	    		  if(cookie.getName().equals("username"))
	    				  {
	    			  s.setUsername(cookie.getValue());
	    			  
	    		  }
	    		  if(cookie.getName().equals("password")) {
	    			  s.setPassword(cookie.getValue());
	    		  }
	              
	    	  
	    	  }
	    	  
	      
	      }
	      else {
	    	  
	    	  out.print("NO COOKIES FOUND");
	      }
		
		
		String info=tuv.UserValues(s.getUsername(), s.getPassword());
		
		String[] information=info.split(",");
		
		s.setFirstname(information[0]);
		s.setLastname(information[1]);
		s.setAddress(information[2]);
		s.setPhonenumber(information[3]);
		s.setEmail(information[4]);
		s.setId_student(information[5]);
		
		
		
	
		
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
				"            background-color: #bbb;\r\n" + 
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
				"        <a href=\"User_menu.html\">\r\n" + 
				"            <img src=\"leftarrow.png\" style=\"width:50px;float:right;\">\r\n" + 
				"        </a>\r\n" + 
				"        <h2>Ηλεκτρονική Πλατφόρμα Πανεπιστημίου </h2>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"    </div>\r\n" + 
				"    <p>&nbsp;</p>\r\n" + 
				"    <fieldset class=\"field1\">\r\n" + 
				"             \r\n" + 
				"    <fieldset class=\"field\"  > \r\n" + 
				"       \r\n" + 
				"         \r\n" + 
				"        <ul>\r\n" + 
				"        	<br></br>\r\n" + 
				"            <li><form action=\"User_menu.html\"><button class=\"form1\" type=\"submit\" >  <h2> Aρχική </h2></button></form></li>" + 
				"            <li><form action=\"User_information\">   <button class=\"form1\" type=\"submit\" > <h2>Στοιχεία Χρήστη</h2></button> </form></li>"
				+ "          <li><form action=\"Student_grades\"><button class=\"form1\" type=\"submit\" > <h2>Βαθμολογίες</h2></button></form></li>\r\n" + 
				"            <li><form action=\"Communication_User_Form.html\"><button class=\"form1\" type=\"submit\" > <h2>Φόρμα Επικοινωνίας</h2></button></form></li> \r\n" + 
				"            <li><form action=\"index\"><button class=\"form1\" type=\"submit\" > <h2>Αποσύνδεση</h2></button></form></li> " + 
				"             " + 
				"        </ul>\r\n" + 
				"\r\n" + 
				"            \r\n" + 
				"         \r\n" + 
				"\r\n" + 
				"   </fieldset>\r\n" + 
				"        <h2>Καλωσορίσατε στην Ηλεκτρονική Πλατφόρμα του Πανεπιστημίου!</h2>\r\n" + 
				"        <img src=\"back.jpg\" style=\"width:500px;position:relative;float:right;\"> \r\n" + 
				"        <h3 style=\"position: absolute; left:25% \">\r\n" + 
				"        Σε αυτήν την πλατφόρμα μπορείτε:\r\n" + 
				"            \r\n" + 
				"        <br></br>\r\n" + 
				"        <span class=\"dot\"></span>Όνομα:"+s.getFirstname()+"" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span>Έπιθετο:"+s.getLastname()+"" + 
				"            \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span>Διεύθυνση:"+s.getAddress()+"" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span>Αριθμός Τηλεφώνου:"+s.getPhonenumber()+"" +
				"        <br></br> " + 
				"	         <span class=\"dot\"></span> Ηλεκτρονική Διεύθυνση:"+s.getEmail()+" "+
				"        <br></br> " + 
				"	         <span class=\"dot\"></span> Id φοιτητή:"+s.getId_student()+" "+
				"        </h3>\r\n" + 
				"        \r\n" + 
				"    </fieldset>\r\n" + 
				"      \r\n" + 
				"   <br>\r\n" + 
				"    <br>\r\n" + 
				"    \r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
