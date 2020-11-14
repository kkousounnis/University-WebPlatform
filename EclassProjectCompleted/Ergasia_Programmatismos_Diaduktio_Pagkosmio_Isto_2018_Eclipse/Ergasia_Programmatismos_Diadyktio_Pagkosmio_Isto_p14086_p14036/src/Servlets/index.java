package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class index
 */
@WebServlet("/index")
public class index extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public index() {
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
		
		//delete cookies
		Cookie cookie = null;
	      Cookie[] cookies = null;
	         
	      // Get an array of Cookies associated with this domain
	      cookies = request.getCookies();

	      // Set response content type
	      response.setContentType("text/html");
	 
	      
	      
	      
	         
	     
	         
	      if( cookies != null ) {
	          

	         for (int i = 0; i < cookies.length; i++) {
	            cookie = cookies[i];

	            if( (cookie.getName( )).compareTo("username") == 0) {
	               cookie.setMaxAge(0);
	               response.addCookie(cookie);
	                
	                
	            }
	            if((cookie.getName( )).compareTo("password") == 0 ) {
		               cookie.setMaxAge(0);
		               response.addCookie(cookie);
		                
		            }
	             
	         }
	      } else {
	    	  System.out.print("No cookies found!!!"); 
	      }
	       
		
		
		out.print("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
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
				"            width:100px;\r\n" + 
				"            border-radius:15px;\r\n" + 
				"            padding:auto;\r\n" + 
				"            height:auto ;\r\n" + 
				"            background-color:deepskyblue;\r\n" + 
				"            float:right;\r\n" + 
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
				"         \r\n" + 
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
				"        <a href=\"index.html\">\r\n" + 
				"            <img src=\"leftarrow.png\" style=\"width:50px;float:right;\">\r\n" + 
				"        </a>\r\n" + 
				"        <h2>Ηλεκτρονική Πλατφόρμα Πανεπιστημίου </h2>\r\n" + 
				"        <a href=\"Teacher_Login.html\">\r\n" + 
				"            <button class=\"adminbutton\" type=\"button\" onclick=\"\">Teacher_Login</button>\r\n" + 
				"        </a>\r\n" + 
				"        <a href=\"Secretary_Login.html\">\r\n" + 
				"            <button class=\"adminbutton\" type=\"button\" onclick=\"\">Secretary_Login</button>\r\n" + 
				"        </a>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"    </div>\r\n" + 
				"    <p>&nbsp;</p>\r\n" + 
				"    <fieldset class=\"field1\">\r\n" + 
				"    <img src=\"back.jpg\"style=\"width:500px;position:relative;float:center;background-size:cover;\">     \r\n" + 
				"    <fieldset class=\"field\" >\r\n" + 
				"		<br>\r\n" + 
				"  		<br>\r\n" + 
				"  		<br>\r\n" + 
				"   		<br>\r\n" + 
				"        <a href=\"Login_User.html\">\r\n" + 
				"            <button class=\"userbutton\" type=\"button\" onclick=\"\">Login</button>\r\n" + 
				"        </a>\r\n" + 
				"        <br>\r\n" + 
				"        <br>\r\n" + 
				"        <a href=\"Signup_User.html\">\r\n" + 
				"            <button class=\"userbutton\" type=\"button\" onclick=\"\">Signup</button>\r\n" + 
				"        </a>\r\n" + 
				"        <br>\r\n" + 
				"        <br>\r\n" + 
				"        <br>\r\n" + 
				"        <br>\r\n" + 
				"\r\n" + 
				"</fieldset>\r\n" + 
				"    \r\n" + 
				"   </fieldset>\r\n" + 
				"    \r\n" + 
				"   \r\n" + 
				"    \r\n" + 
				"   <br>\r\n" + 
				"    <br>\r\n" + 
				"    \r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
