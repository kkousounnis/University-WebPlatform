package mainpackage;

/**
 * @author kwnstantinos
 * edw exoume thn klash users sthn opoia exoume ta antistoixa xarakthristhka
 *
 */
public abstract  class Users {
	private String username;
	private String name;
	private String surname;
	private String Department;
	private static int counter;
	
	
	
	public Users()
	 {
		//Constructor of users that initializes the username ,the name,the surname ,the department  attribute 
		this.username="";
		this.name="";
		this.surname="";
		this.Department="";
		counter++;
	}
	public void setUsername(String username) {
		this.username=username;	
	}
	public String getUsername() {
		return username;
	}
	
	
	
	public void  setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	
	
	public void  setSurname(String surname) {
		this.surname=surname;
	}
	public String getSurname() {
		return surname;
	}
	
	
	public void setDepartment(String Department) {
		this.Department=Department;
	}
	public String getDepartment() {
		return Department;
	}
	public int getCounter() {
		return counter;
	}
	
	public abstract int getregistretionNumber();
	public abstract void setAge(int age);
	public abstract int getAge();
	
	public abstract void setPhone(int Phone);
	public abstract int getPhone();
	
	public abstract void setAddress(String address);
	public abstract String getAddress();
	
	public abstract void setAm(int am);
	public abstract int getAm();
	
	
}
