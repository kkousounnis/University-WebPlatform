package mainpackage;

import java.util.Scanner;
import java.util.InputMismatchException;



import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.File;



public class CreateUsers {
	
	/**
	 * @author kwnstantinos
	 *apuhkeuw se auto to arxeio ton ka8e student ksexwrista  gia na mhn xanw tous student 
	 *ka8e fora pou anoigw to programma 8a pou 8a kleinw kai 8a to anoigw to programma 8a exw swmena ta stoixeia
	 */
	public static final String Filename="StoixeiaStudent.txt";
	
	
	public static void main(String[] args)  throws IOException{
		
		
		BufferedWriter bw = null;
	    FileWriter fw = null;
	    
		Users u1=new Students();//ftiaxnoyme ena anteikimeno gia na ftiaksoume ena xrhsth Students
		
		
		Scanner user1 =new Scanner(System.in);// ftiaxnoume ena anteikimeno gia na pliktorologhsh o xrhsths sthn konsola
		
		System.out.println("Please give the username of the new Student:");
		
		u1.setUsername(user1.nextLine());//dinei o xrhsths to onoma tou Student se alfari8mitiko
		
		System.out.println("Please give the Name of the new Student: ");
		u1.setName(user1.nextLine());
		
		System.out.println("Please give the Surname of the new Student:");
		u1.setSurname(user1.nextLine());
		
		System.out.println("Please give the Department of the Student:");
		u1.setDepartment(user1.nextLine());
		
		System.out.println("Please give the Age of the Student:");
		u1.setAge(user1.nextInt());//dinei o xrhsths thn hlikia tou Student se akeraio int
		
		//dinw kai  enan ari8mo mitrwou
		
		/**
		 * @author kwnstantinos
		 *edw bazw ta exception na dinei ari8mous kai mono sthn consola
		 */
		
		
		System.out.println("Please give the Ari8mo Mitrwou of the Student:");
		try {
			u1.setAm(user1.nextInt());
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception!");
		}
		catch(InputMismatchException e) {
			System.out.println("Input Exception!");
		}
	
		
		
		//8a kanoume xrhsh kai tis klasH Grades  gia ton Student1
		
		//me antistoixo tropo bazw ta ma8hmata me thn xrhsh ths klashs Courses
		
		
		Grades u1c1g=new Grades();//ftiaxnw ena antikeimeno gia na dwsw ton ba8mo tou xrhsth
		
		
		
		System.out.println("Please give the Grade of the  Lesson that the student attends:");
		u1c1g.setGrade(user1.nextInt());//pairnw thn timh pou dinei sthn konsola o xrhsths
		
		try {
		
			File file=new File(Filename);
		
			if (!file.exists()) {
			file.createNewFile();
			}
		
			String Data=u1.getUsername()+u1.getName()+u1.getSurname()+u1.getDepartment()+u1.getAge()+"|"+u1.getAge()+"|"+u1.getAm()+"|";
		
		
		
		
			fw = new FileWriter(file.getAbsoluteFile(), true);
			bw = new BufferedWriter(fw);
			bw.newLine();	
			bw.write(Data);	
			}catch (IOException e) {

			e.printStackTrace();

			}finally{
				try {

					if (bw != null)
						bw.close();

					if (fw != null)
						fw.close();

				} catch (IOException ex) {

					ex.printStackTrace();

			}
			
		}
		 
		
		
		
		
		
		
		//Edv apla emfanizoyme sthn konsola  kai ta stoixoia poy edwse gia ton Student1
		System.out.println("Username:"+u1.getUsername());
		System.out.println("Firstname:"+u1.getName());
		System.out.println("Surname:"+u1.getSurname());
		System.out.println("The Department of the student is:"+u1.getDepartment());
		System.out.println("The age of the Student is:"+u1.getAge());
		System.out.println("The unique registration number of the student is:"+u1.getregistretionNumber());
		System.out.println("The ari8mos mitrvou is :"+u1.getAm());
		
		
		
		System.out.println("The Grade that the student took for the lesson is:"+u1c1g.getGrade());
		
		
		
		
		

		
		
		Users u2=new Professors();//ftiaxnoyme ena anteikimeno gia na ftiaksoume ena xrhsth Professors
		Scanner user2 =new Scanner(System.in);// ftiaxnoume ena anteikimeno gia na pliktorologhsh o xrhsths sthn konsola gia na ftiaksei ton professor
		
		
		
		System.out.println("Please give the username of the new Professor:");
		u2.setUsername(user2.nextLine());//dinei o xrhsths to onoma tou Student se alfari8mitiko
		
		System.out.println("Please give the Name of the new Professor: ");
		u2.setName(user2.nextLine());
		
		System.out.println("Please give the Surname of the new Professor:");
		u2.setSurname(user2.nextLine());
		
		System.out.println("Please give the Department of the Professor:");
		u2.setDepartment(user2.nextLine());
		
		System.out.println("Please give the Phone of the Professor:698");
		u2.setPhone(user2.nextInt());//dinei o xrhsths thn hlikia tou Student se akeraio int
		
		System.out.println("Username:"+u2.getUsername());
		System.out.println("Firstname:"+u2.getName());
		System.out.println("Surname:"+u2.getSurname());
		System.out.println("The Department of the professor is:"+u2.getDepartment());
		System.out.println("The phone of the professor is:698"+u2.getPhone());
		
		

		
		
		
		Users u3=new Secretaries();//ftiaxnoyme ena anteikimeno gia na ftiaksoume ena xrhsth Secretaries
		Scanner user3 =new Scanner(System.in);// ftiaxnoume ena anteikimeno gia na pliktorologhsh o xrhsths sthn konsola gia na ftiaksei ton secretaries
		
		System.out.println("Please give the username of the new Secretaries:");
		u3.setUsername(user3.nextLine());//dinei o xrhsths to onoma tou Student se alfari8mitiko
		
		System.out.println("Please give the Name of the new Secretaries: ");
		u3.setName(user3.nextLine());
		
		System.out.println("Please give the Surname of the new Secretaries:");
		u3.setSurname(user3.nextLine());
		
		System.out.println("Please give the Department of the Secretaries:");
		u3.setDepartment(user3.nextLine());
		
		System.out.println("Please give the adress of the secretaries");
		u3.setAddress(user3.nextLine());//dinei o xrhsths thn hlikia tou Student se akeraio int
		
		System.out.println("Username:"+u3.getUsername());
		System.out.println("Firstname:"+u3.getName());
		System.out.println("Surname:"+u3.getSurname());
		System.out.println("The Department of the Secretarie is:"+u3.getDepartment());
		System.out.println("The adress of the secretarie"+u3.getAddress());
		
	
		 
		
		
			
		
		
		
		
		
		
		
		user1.close();//kleinoume thn pliktrologhsh gia ton user1   
		user2.close();
		user3.close();
		 
		
			
	}
}


