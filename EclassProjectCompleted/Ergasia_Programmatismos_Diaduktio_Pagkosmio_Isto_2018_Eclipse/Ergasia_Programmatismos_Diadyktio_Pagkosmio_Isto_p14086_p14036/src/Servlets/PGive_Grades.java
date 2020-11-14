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
import Main.TakeValueslessonsProffessorhas;

/**
 * Servlet implementation class PGive_Grades
 */
@WebServlet("/PGive_Grades")
public class PGive_Grades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PGive_Grades() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				response.setContentType("text/html");
				response.setCharacterEncoding("UTF-8");
				PrintWriter out = response.getWriter();
				
				TakeValueslessonsProffessorhas TVLPH=new TakeValueslessonsProffessorhas();
				
				Proffessor p=new Proffessor();
				 
				
				 Cookie cookie = null;
			      Cookie[] cookies = null;
			      
			      // Get an array of Cookies associated with this domain
			      cookies = request.getCookies();
			      
			      if(cookies!=null) {
			    	  for (int i=0;i<cookies.length;i++) {
			    		  cookie = cookies[i];
			    		  if(cookie.getName().equals("username"))
			    				  {
			    			  p.setUsername(cookie.getValue());
			    			  
			    		  }
			    		  if(cookie.getName().equals("password")) {
			    			  p.setPassword(cookie.getValue());
			    		  }
			              
			    	  
			    	  }
			    	  
			      
			      }
			      else {
			    	  
			    	  out.print("NO COOKIES FOUND");
			      }
				
				
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
				      		"        <a href=\"Proffessor_menu.html\">\r\n" + 
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
				      		"  <h2><fieldset style=\"background-color:deepskyblue;\"><u>Καλωςορίσατε "+p.getUsername()+" </u></fieldset></h2>"
							+ "<h3><div class=\"column\">  Id_Μαθημάτων - Μαθημα</div>  ---          </h3>"
							+				
							" <span class=\"dot\"></span> <div class=\"column\"><fieldset><form action=\"PGive_Grades1\">"
							+ " <select name=\"id_lesson\" style=\" background-color:deepskyblue; \"  >");
							
				 			System.out.println(p.getId_Proffessor()+"megala logia min mou peis");
				 			String AlllessonsProffessorhas="";
				 			AlllessonsProffessorhas=TVLPH.TakeValProffLesson(p.getUsername());
				 			
				 			System.out.println("bGAZEI :"+AlllessonsProffessorhas+p.getUsername()+p.getPassword()+"den me lene den me lene");
				 			
							 
							String lessonproffessorhas[]=AlllessonsProffessorhas.split(",");
						 
				 			
							
							//prospa8isame na to baloume se ena loop alla kollage to eclipse opote ballame sthn seira ta ma8hmata
							 
						if( lessonproffessorhas.length>0 ){
						   out.print( " <option value=\"  "+lessonproffessorhas[0] +"   \"> "+ lessonproffessorhas[0]+" </option> ");
						   }
						if( lessonproffessorhas.length>1 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[1] +"   \"> "+ lessonproffessorhas[1]+" </option> ");
							   }
						if( lessonproffessorhas.length>2 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[2] +"   \"> "+ lessonproffessorhas[2]+" </option> ");
							   }
						if( lessonproffessorhas.length>3 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[3] +"   \"> "+ lessonproffessorhas[3]+" </option> ");
							   }
						if( lessonproffessorhas.length>4 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[4] +"   \"> "+ lessonproffessorhas[4]+" </option> ");
							   }
						if( lessonproffessorhas.length>5 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[5] +"   \"> "+ lessonproffessorhas[5]+" </option> ");
							   }
						if( lessonproffessorhas.length>6 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[6] +"   \"> "+ lessonproffessorhas[6]+" </option> ");
							   }
						if( lessonproffessorhas.length>7 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[7] +"   \"> "+ lessonproffessorhas[7]+" </option> ");
							   }
						if( lessonproffessorhas.length>8 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[8] +"   \"> "+ lessonproffessorhas[8]+" </option> ");
							   }
						if( lessonproffessorhas.length>9 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[9] +"   \"> "+ lessonproffessorhas[9]+" </option> ");
							   }
						if( lessonproffessorhas.length>10 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[10] +"   \"> "+ lessonproffessorhas[10]+" </option> ");
							   }
						if( lessonproffessorhas.length>11 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[11] +"   \"> "+ lessonproffessorhas[11]+" </option> ");
							   }
						if( lessonproffessorhas.length>12 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[12] +"   \"> "+ lessonproffessorhas[12]+" </option> ");
							   }
						if( lessonproffessorhas.length>13 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[13] +"   \"> "+ lessonproffessorhas[13]+" </option> ");
							   }
						if( lessonproffessorhas.length>14 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[14] +"   \"> "+ lessonproffessorhas[14]+" </option> ");
							   }
						if( lessonproffessorhas.length>15 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[15] +"   \"> "+ lessonproffessorhas[15]+" </option> ");
							   }
						if( lessonproffessorhas.length>16 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[16] +"   \"> "+ lessonproffessorhas[16]+" </option> ");
							   }
						if( lessonproffessorhas.length>17 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[17] +"   \"> "+ lessonproffessorhas[17]+" </option> ");
							   }
						if( lessonproffessorhas.length>18 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[18] +"   \"> "+ lessonproffessorhas[18]+" </option> ");
							   }
						if( lessonproffessorhas.length>19 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[19] +"   \"> "+ lessonproffessorhas[19]+" </option> ");
							   }
						if( lessonproffessorhas.length>20 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[20] +"   \"> "+ lessonproffessorhas[20]+" </option> ");
							   }
						if( lessonproffessorhas.length>21 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[21] +"   \"> "+ lessonproffessorhas[21]+" </option> ");
							   }
						if( lessonproffessorhas.length>22 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[22] +"   \"> "+ lessonproffessorhas[22]+" </option> ");
							   }
						if( lessonproffessorhas.length>23 ){
							   out.print( " <option value=\"  "+lessonproffessorhas[23] +"   \"> "+ lessonproffessorhas[23]+" </option> ");
							   }
						   
							
							 
							 
							 
							
							 out.print( "</select>"
							+ "           \r\n" + 
							"<button style=\"width:auto;\"  > Give_Grades </button></form>"+
							"        <br></br>\r\n" +  
							 
							
							
							
							

							
							"</fieldset>"
							+ "</fieldset>"+
				      		  
				      		"</body>\r\n" + 
				      		"</html>");
				
	}

}
