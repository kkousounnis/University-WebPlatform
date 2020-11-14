package mainpackage;

public class Main {
	
	
	public static void main(String[] args) {
		Users u1=new Students();
		
		u1.setUsername("psychosocial7");
		u1.setName("Giwrgos");
		u1.setSurname("Diwtis");
		u1.setDepartment("Departmentofinformatics");
		
		
		u1.setAge(12);
		System.out.println("Age"+u1.getAge());
		
		System.out.println("\n");
		
		Courses u1c1=new Courses();
		Grades u1c1g=new Grades();
		u1c1.setCourse("Analusi1");
		System.out.println("To ma8hma pou parakoloy8ei o foithths einai h :"+u1c1.getCourse());
		u1c1g.setGrade(9);
		
		System.out.println("\n");
		System.out.println("O ba8mos pou phre einai"+u1c1g.getGrade());
		
		
		System.out.println("\n");
		
		
		
		Users u2=new Professors();
		u2.setUsername("pappoulis13");
		u2.setName("Kwnstantinos");
		u2.setSurname("Kousounnis");
		u2.setDepartment("Departmentofinformatics");

		System.out.println(u1.getUsername());
		System.out.println(u1.getName());
		System.out.println(u1.getSurname());
		System.out.println(u1.getDepartment());
		System.out.println("Registernumber"+u1.getregistretionNumber()+"\n");
		
		System.out.println(u2.getUsername());
		System.out.println(u2.getName());
		System.out.println(u2.getSurname());
		System.out.println(u2.getDepartment());
		System.out.println("the costructor was used "+ u2.getCounter()+" times");
		System.out.println("Registernumber"+u2.getregistretionNumber());
		
		
		
		
		u2.setPhone(783675);
		System.out.println("Phone6986"+u2.getPhone());
		
		
		Users u3=new Secretaries();
		
		u3.setUsername("grammateia");
		u3.setName("Elenh");
		u3.setSurname("kontola");
		u3.setDepartment("Departmentofinformatics");
		u3.setAddress("eleni@unipi.gr");
		
		System.out.println(u3.getUsername());
		System.out.println(u3.getName());
		System.out.println(u3.getSurname());
		System.out.println(u3.getDepartment());
		System.out.println(u3.getAddress());
	}
}
