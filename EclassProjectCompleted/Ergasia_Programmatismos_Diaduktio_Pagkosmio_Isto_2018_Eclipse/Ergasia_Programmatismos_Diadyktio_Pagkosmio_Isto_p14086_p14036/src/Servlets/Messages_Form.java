package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Messages_Form
 */
@WebServlet("/Messages_Form")
public class Messages_Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Messages_Form() {
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
		
		
		 out.print("<!DOCTYPE html>\r\n" + 
		 		"<html>\r\n" + 
		 		"<head>\r\n" + 
		 		"	<meta http-equiv=\"Content-Type\" content=\"text/html\">\r\n" + 
		 		"    <meta charset=\"UTF-8\">\r\n" + 
		 		"    <title>UniversityStyle</title>\r\n" + 
		 		"    <style>\r\n" + 
		 		"         \r\n" + 
		 		"\r\n" + 
		 		"         \r\n" + 
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
		 		"            height: 70px;\r\n" + 
		 		"        }\r\n" + 
		 		"         \r\n" + 
		 		"\r\n" + 
		 		"        .refresh {\r\n" + 
		 		"            background-color: deepskyblue;\r\n" + 
		 		"            border-radius: 15px;\r\n" + 
		 		"            float: right;\r\n" + 
		 		"            width: 50px;\r\n" + 
		 		"            height: 50px;\r\n" + 
		 		"            color: white;\r\n" + 
		 		"        }\r\n" + 
		 		"        input[type=text], select, textarea {\r\n" + 
		 		"            width: 100%;\r\n" + 
		 		"            padding: 12px;\r\n" + 
		 		"            border: 1px solid #ccc;\r\n" + 
		 		"            border-radius: 4px;\r\n" + 
		 		"            box-sizing: border-box;\r\n" + 
		 		"            margin-top: 6px;\r\n" + 
		 		"            margin-bottom: 16px;\r\n" + 
		 		"            resize: vertical;\r\n" + 
		 		"        }\r\n" + 
		 		"\r\n" + 
		 		"        input[type=submit] {\r\n" + 
		 		"            background-color: deepskyblue;\r\n" + 
		 		"            color: white;\r\n" + 
		 		"            padding: 12px 20px;\r\n" + 
		 		"            border: none;\r\n" + 
		 		"            border-radius: 4px;\r\n" + 
		 		"            cursor: pointer;\r\n" + 
		 		"        }\r\n" + 
		 		"\r\n" + 
		 		"            input[type=submit]:hover {\r\n" + 
		 		"                background-color: lightskyblue;\r\n" + 
		 		"            }\r\n" + 
		 		"\r\n" + 
		 		"        .container1 {\r\n" + 
		 		"            border-radius: 5px;\r\n" + 
		 		"            background-color: #f2f2f2;\r\n" + 
		 		"            padding: 20px;\r\n" + 
		 		"            width: 50%;\r\n" + 
		 		"            display: block;\r\n" + 
		 		"            margin-left: auto;\r\n" + 
		 		"            margin-right: auto;\r\n" + 
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
		 		"        <a href=\"Secretary_menu.html\">\r\n" + 
		 		"            <img src=\"leftarrow.png\" style=\"width:50px;float:right;\">\r\n" + 
		 		"        </a>\r\n" + 
		 		"        <h2>Ηλεκτρονική Πλατφόρμα Πανεπιστημίου </h2>\r\n" + 
		 		"         \r\n" + 
		 		"        <h3>Φόρμα Επικοινωνίας</h3>\r\n" + 
		 		"\r\n" + 
		 		"        <div class=\"container1\">\r\n" + 
		 		"            <form action=\"/action_page.php\">\r\n" + 
		 		"                <label for=\"fname\"style=\"color:black\">Όνομα</label>\r\n" + 
		 		"                <input type=\"text\" id=\"fname\" name=\"firstname\" placeholder=\"Το όνομα σας..\">\r\n" + 
		 		"\r\n" + 
		 		"                <label for=\"lname\" style=\"color:black\">Επίθετο</label>\r\n" + 
		 		"                <input type=\"text\" id=\"lname\" name=\"lastname\" placeholder=\"Το επίθετο σας\">\r\n" + 
		 		"\r\n" + 
		 		"                 \r\n" + 
		 		"\r\n" + 
		 		"                <label for=\"subject\" style=\"color:black\">Θέμα</label>\r\n" + 
		 		"                <textarea id=\"subject\" name=\"subject\" placeholder=\"Παρακαλώ γράψτε κατι..\" style=\"height:200px\"></textarea>\r\n" + 
		 		"\r\n" + 
		 		"                <input type=\"submit\" value=\"Υποβολή\">\r\n" + 
		 		"            </form>\r\n" + 
		 		"        </div>\r\n" + 
		 		"\r\n" + 
		 		"    </div>\r\n" + 
		 		"    <p>&nbsp;</p>\r\n" + 
		 		"     \r\n" + 
		 		"\r\n" + 
		 		"\r\n" + 
		 		"\r\n" + 
		 		"    <br>\r\n" + 
		 		"    <br>\r\n" + 
		 		"\r\n" + 
		 		"</body>\r\n" + 
		 		"</html>");
	}

}
