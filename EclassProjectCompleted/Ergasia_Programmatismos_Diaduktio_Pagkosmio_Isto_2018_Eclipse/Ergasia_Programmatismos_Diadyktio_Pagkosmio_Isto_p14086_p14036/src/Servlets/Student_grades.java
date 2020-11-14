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
import Main.TakeValueGradeForStudent;

/**
 * Servlet implementation class Student_grades
 */
@WebServlet("/Student_grades")
public class Student_grades extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student_grades() {
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
			s.setId_student(information[5]);
			
		TakeValueGradeForStudent TVGFS=new TakeValueGradeForStudent();
		
		String sgrade=TVGFS.TakeGrade(s.getId_student());
		String[] studentgradeinfo=sgrade.split(",");
		
		
		
		
		 
		int counterforstudentgradeinfo=studentgradeinfo.length;
		
		String[] grade_eksamino1=new String[7];
		String[] grade_eksamino2=new String[7];
		String[] grade_eksamino3=new String[7];
		String[] grade_eksamino4=new String[7];
		String[] grade_eksamino5=new String[7];
		String[] grade_eksamino6=new String[7];
		String[] grade_eksamino7=new String[7];
		String[] grade_eksamino8=new String[7];
		
		//boolean x=false;
		
		System.out.println(counterforstudentgradeinfo+"ela");
		
		if(counterforstudentgradeinfo>1) {
			//String lastlesson="";
			//lastlesson=studentgradeinfo[counterforstudentgradeinfo-1];//p11
			//String[] takenumber=lastlesson.split("p");
			//int lessonnumber=Integer.parseInt(takenumber[1]);
			//System.out.println(lessonnumber/10+"xaxxaxaax me lene giorgo"+lessonnumber);//8elw apo to p21 to2
			//int maxi=lessonnumber/10;
			//System.out.println(lessonnumber%10+"ayto einai to deytero psifio");//8elw apo to p21 to 1
			//int maxj=lessonnumber%10;
			
			 
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p11")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino1[0]=studentgradeinfo[i-1];
				}
				 
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p12")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino1[1]=studentgradeinfo[i-1];
				} 	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p13")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino1[2]=studentgradeinfo[i-1];
				} 	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p14")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino1[3]=studentgradeinfo[i-1];
				} 
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p15")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino1[4]=studentgradeinfo[i-1];
				} 	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p16")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino1[5]=studentgradeinfo[i-1];
				} 	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p17")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino1[6]=studentgradeinfo[i-1];
				} 	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p21")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino2[0]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p22")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino2[1]=studentgradeinfo[i-1];
				}	
			}  
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p23")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino2[2]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p24")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino2[3]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p25")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino2[4]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p26")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino2[5]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p27")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino2[6]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p31")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino3[0]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p32")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino3[1]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p33")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino3[2]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p34")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino3[3]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p35")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino3[4]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p36")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino3[5]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p37")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino3[6]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p41")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino4[0]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p42")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino4[1]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p43")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino4[2]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p44")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino4[3]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p45")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino4[4]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p46")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino4[5]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p47")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino4[6]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p51")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino5[0]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p52")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino5[1]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p53")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino5[2]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p54")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino5[3]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p55")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino5[4]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p56")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino5[5]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p57")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino5[6]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p61")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino6[0]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p62")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino6[1]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p63")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino6[2]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p64")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino6[3]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p65")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino6[4]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p66")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino6[5]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p67")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino6[6]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p71")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino7[0]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p72")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino7[1]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p73")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino7[2]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p74")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino7[3]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p75")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino7[4]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p76")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino7[5]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p77")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino7[6]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p81")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino8[0]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p82")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino8[1]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p83")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino8[2]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p84")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino8[3]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p85")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino8[4]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p86")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino8[5]=studentgradeinfo[i-1];
				}	
			}
			for(int i=0;i<counterforstudentgradeinfo;i++) {
				if(studentgradeinfo[i].contains("p87")) {
					System.out.println("Μαθημα:"+studentgradeinfo[i]+"βαθμός:"+studentgradeinfo[i-1]);
					grade_eksamino8[6]=studentgradeinfo[i-1];
				}	
			}
			
			
			
			
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
				"            position:fixed"+
				"            padding:auto;\r\n" + 
				"            height:auto ;\r\n" + 
				"            background-color:deepskyblue;\r\n" + 
				"            float:left;\r\n" + 
				"            height:100%;\r\n" + 
				"            \r\n" + 
				"        }\r\n"
				+ "      .field :hover{"
				+ "      color:white;              "
				+ "      }" + 
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
				"            \r\n"
				+ ".column{"
				+ "float:left;"
				+ "width:50%;"
				+ ""
				+ "}" +
				
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
				"    \r\n" + 
				"             \r\n" + 
				"    <fieldset class=\"field\"  > \r\n" + 
				"       \r\n" + 
				"         \r\n" + 
				"        <ul>\r\n" + 
				"        	<br></br>\r\n" + 
				"            <li><form action=\"User_menu.html\"><button class=\"form1\" type=\"submit\" >  <h2> Aρχική </h2></button></form></li>\r\n" + 
				"            <li><form action=\"User_information\">   <button class=\"form1\" type=\"submit\" > <h2>Στοιχεία Χρήστη</h2></button> </form></li> \r\n" + 
				"            <li><form action=\"Student_grades\"><button class=\"form1\" type=\"submit\" > <h2>Βαθμολογίες</h2></button></form></li>\r\n" + 
				"            <li><form action=\"Communication_User_Form.html\"><button class=\"form1\" type=\"submit\" > <h2>Φόρμα Επικοινωνίας</h2></button></form></li> \r\n" + 
				"            <li><form action=\"index\"><button class=\"form1\" type=\"submit\" > <h2>Αποσύνδεση</h2></button></form></li>            \r\n" + 
				"        </ul>\r\n" + 
				"\r\n" + 
				"            \r\n" + 
				"         \r\n" + 
				"\r\n" + 
				"   </fieldset >\r\n" + 
				"        <h2> Βαθμολογίες - "+s.getFirstname()+" "+s.getLastname()+"  "+s.getId_student()+" </h2>\r\n" + 
				"        <img src=\"back.jpg\" style=\"width:500px;position:relative;float:right;\"> \r\n" + 
				"  <h4 style=\"position: absolute; left:15% \">\r\n" + 
				"<fieldset>"
				+ "<h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 1</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μαθημα-Βαθμολογία </div>          </h3>"
				+				
				"         <br></br><span class=\"dot\"></span> <div class=\"column\"> Αναλυση 1: "+grade_eksamino1[0]+"   </div>    \r\n" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\"> Αρχές προγραμματισμού: "+grade_eksamino1[1]+"  </div>  \r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\"> Εισαγωγή Στην Επιστημη Υπολογιστών:   "+grade_eksamino1[2]+"  </div>     \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Λογική Σχεδίαση  Ψηφιακών Συστημάτων:  "+grade_eksamino1[3]+"  </div>   \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Μαθηματικά των Υπολογιστών:   "+grade_eksamino1[4]+"   </div>  \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Τεχνολογίες Διαδυκτίου: "+grade_eksamino1[5]+"  </div>   \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Αγγλικά 1: "+grade_eksamino1[6]+"  </div>   \r\n "
				+ "   <br></br> <h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 3</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μαθημα-Βαθμολογία</div>             </h3>"
				+				
				"          <br></br><span class=\"dot\"></span> <div class=\"column\">Αντικειμενοστραφής Ανάπτυξη Εφαρμογών: " +grade_eksamino3[0]+"</div>     \r\n" + 
				"           \r\n" +   
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Λειτουργικά Συστήματα:  " +grade_eksamino3[1]+"</div> \r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Μαθηματικός Προγραμματισμός: "+grade_eksamino3[2]+" </div>    \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Μεταγλωτιστές: "+grade_eksamino3[3]+"</div> \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Πιθανότητες και Στατιστική: "+grade_eksamino3[4]+"</div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Management: "+grade_eksamino3[5]+"</div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Αγγλικά 3:  "+grade_eksamino3[6]+"</div> \r\n "
				+ "   <br></br> <h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 5</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μαθημα-Βαθμολογία</div>             </h3>"
				+				
				"          <br></br><span class=\"dot\"></span> <div class=\"column\"> Αλληλεπίδραση Ανθρώπου και Υπολογιστή: " +grade_eksamino5[0]+"</div>  \r\n" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\"> Αναγνώριση Προτύπων:  " +grade_eksamino5[1]+"</div>\r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Πληροφορικά Συστήματα:   " +grade_eksamino5[2]+"</div>    \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Κρυπτογραφία:  " +grade_eksamino5[3]+" </div> \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Προηγμένα Θέματα Επικοινωνίων: " +grade_eksamino5[4]+" </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Προηγμένη Αρχιτεκτονική Υπολογιστών: " +grade_eksamino5[5]+" </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Αγγλικά 5 " +grade_eksamino5[6]+" </div> \r\n "
				+ "   <br></br> <h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 7</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μαθημα-Βαθμολογία</div>             </h3>"
				+				
				"         <br></br> <span class=\"dot\"></span> <div class=\"column\">Αποθήκες Δεδομένων και Εξόρυξη Γνώσης:" +grade_eksamino7[0]+"</div>     \r\n" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Ασφάλεια Πληροφοριακών Συστημάτων:" +grade_eksamino7[1]+"  </div>\r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Προσομοίωση Συστημάτων:  " +grade_eksamino7[2]+"</div>    \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Ανακτηση Πληροφορίας και Αναζήτηση στον Παγκόσμιο Ιστό:" +grade_eksamino7[3]+" </div> \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Τεχνολογία Ανάπτυξης Ηλεκτρονικών Παιχνιδιών:" +grade_eksamino7[4]+" </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">Γεωγραφικά Πληροφοριακά Συστήματα:"+grade_eksamino7[5]+" </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Αγγλικά 7:" +grade_eksamino7[6]+"</div> \r\n "
				+ "</fieldset>"
				+ 
				"</h4>\r\n" + 
				 
					" <h4 style=\"position: absolute; right:25% \">\r\n"+ 
					"<fieldset>" +
				"  <h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 2</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μαθημα-Βαθμολογία</div>             </h3>"
				+				
				"          <br></br><span class=\"dot\"></span> <div class=\"column\">Αναλυση 2 :"+grade_eksamino2[0]+"</div>  \r\n" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\"> Αντικειμενοστραφής Προγραμματισμός:"+grade_eksamino2[1]+"</div>\r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\"> Αρχιτεκτονική Υπολογιστών:"+grade_eksamino2[2]+"</div>    \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Διακριτά Μαθηματικά:"+grade_eksamino2[3]+"</div> \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Δομές Δεδομένων:"+grade_eksamino2[4]+"</div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Εφαρμοσμένη Αλγεβρα:"+grade_eksamino2[5]+"</div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Αγγλικά 2:"+grade_eksamino2[6]+"</div> \r\n "+
				"        \r\n"+
				"<br></br>"+
				"  <h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 4</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μάθημα-Βαθμολογία</div>             </h3>"
				+				
				"        <br></br><span class=\"dot\"></span> <div class=\"column\">Αλγόριθμοι:"+grade_eksamino4[0]+"</div>  \r\n" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Αρχές και Εφαρμογές Σημάτων και Συστημάτων:"+grade_eksamino4[1]+"</div>\r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Βάσεις Δεδομένων: "+grade_eksamino4[2]+"</div>    \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Δίκτυα Υπολογιστών: "+grade_eksamino4[3]+"</div> \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Προγραμματισμός Στο Διαδίκτυο και τον Παγκόσμιο Ιστό:"+grade_eksamino4[4]+" </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Ξενόγλωσση Ορολογία της Πληροφορικής:"+grade_eksamino4[5]+"  </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Αγγλικά 4:"+grade_eksamino4[6]+" </div> \r\n "+
				"        \r\n"+
				"<br></br>"+
				"  <h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 6</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μαθημα-Βαθμολογία</div>             </h3>"
				+				
				"        <br></br><span class=\"dot\"></span> <div class=\"column\">Τεχνητή Νοημοσλυνη και Εμπειρα Συστήματα:"+grade_eksamino6[0]+"</div>     \r\n" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Τεχνολογία Λογισμικού:"+grade_eksamino6[1]+"</div>\r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Διοίκηση Ασφάλειας Συστημάτων:"+grade_eksamino6[2]+"</div>    \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Συστήματα Υποστύριξης Συστημάτων:"+grade_eksamino6[3]+"</div> \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Συστημική Ανάλυση:"+grade_eksamino6[4]+"</div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\">  Δίκτυα Υψηλών Ταχυτήτων:"+grade_eksamino6[5]+"</div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Αγγλικά 6:"+grade_eksamino6[6]+"</div> \r\n "+
				"        \r\n"+
				"<br></br>"+
				"  <h2><fieldset style=\"background-color:deepskyblue;\"><u>Εξαμηνο 8</u></fieldset></h2>"
				+ "<h3><div class=\"column\">  Μαθημα- Βαθμολογία</div>            </h3>"
				+				
				"       <br></br> <span class=\"dot\"></span> <div class=\"column\">Διοικητική Πληροφορική "+grade_eksamino8[0]+"</div>  \r\n" + 
				"           \r\n" + 
				"        <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Ηλεκτρονικό Επιχειρείν και Καινοτομία"+grade_eksamino8[1]+"</div>\r\n" + 
				"            \r\n" + 
				"        <br></br> <br></br>\r\n" + 
				"            <span class=\"dot\"></span><div class=\"column\">Πληροφορίακα Συστήματα Στο Διαδίκτυο "+grade_eksamino8[2]+" </div>    \r\n" + 
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Ασφάλεια Δικτύων "+grade_eksamino8[3]+" </div> \r\n" +
				"        <br></br>  <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Συστήματα Διασφάλισης της Ποιότητας "+grade_eksamino8[4]+" </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Ψηφιακές Βιβλιοθήκες "+grade_eksamino8[5]+" </div> \r\n" +
				"        <br></br>  <br></br>\r\n" + 
				"            <span class=\"dot\"></span> <div class=\"column\"> Αγγλικά 8 "+grade_eksamino8[6]+" </div> \r\n "+
				"        \r\n"+
				"</fieldset>"
				 +
				 
				"<form action=\"Student_grades\"><button class=\"form1\" type=\"submit\" >  <h2> BacktoTop </h2></button></form>"
				+ "</h4>"+
				
				 
				"      \r\n" + 
				"   <br>\r\n" + 
				"    <br>\r\n" + 
				"    \r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
