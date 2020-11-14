package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Classes.Student;
import Main.CheckDbexists; 
import Main.CheckUsernameStudentsFromTable;
import Main.InsertIntoDatabaseValues;

/**
 * Servlet implementation class SignupUser
 */
@WebServlet("/SignupUser")
public class SignupUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupUser() {
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
		
		InsertIntoDatabaseValues InsVal=new InsertIntoDatabaseValues();
		CheckDbexists Cdb=new CheckDbexists();
		CheckUsernameStudentsFromTable CU =new CheckUsernameStudentsFromTable(); 
		
		Student s=new Student();
		
		Cdb.CheckDbCreateTable();
		
		
		s.setUsername(request.getParameter("username"));
		
		boolean checkusername=false;
	 
	 
	    checkusername=CU.CheckUsernStudentsFromTable(s.getUsername());
		 
		if(checkusername==true) {
		
			out.print("<fieldset style=\"background-color:red;padding:10%;\"> </fieldset>"+
					"Wrong Username you must type something else it already exists"
					+ "<meta http-equiv=\"refresh\" content=\"5; URL='Signup_User.html'\" />");
			checkusername=false;
		}
		
		
		
		s.setPassword(request.getParameter("psw"));
		
		
		 
		 
		
		
		s.setFirstname(request.getParameter("Firstname"));
		s.setLastname(request.getParameter("Lastname"));
		s.setAddress(request.getParameter("Address"));
		
		s.setPhonenumber(request.getParameter("phone"));
		
		
		s.setEmail(request.getParameter("email"));
		
		System.out.println(s.getPhonenumber());
		
		checkusername=InsVal.InsertUserValues(s.getUsername(), s.getPassword(), s.getFirstname(), s.getLastname(), s.getAddress(), s.getPhonenumber(), s.getEmail());
		
		if(checkusername==true) {
	    out.print("<fieldset style=\"background-color:deepskyblue;padding:10%;\"> </fieldset>"
					+ "<h2 style=\"color:green;\">Τα στοιχεία σας έχουν αποθηκευτεί επιτυχώς στην Βαση Δεδομένων μας παρακαλώ μπόρειτε να συνδεθείτε στο Site μας με το Username και το Password σας</h2>"
					+ "<meta http-equiv=\"refresh\" content=\"5; URL='index.html'\" />");
	 
		}
		 
		
		
	}

}
