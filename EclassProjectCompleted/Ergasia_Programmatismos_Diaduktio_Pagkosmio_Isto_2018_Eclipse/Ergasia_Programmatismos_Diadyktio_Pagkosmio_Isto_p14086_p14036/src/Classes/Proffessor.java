package Classes;

public class Proffessor extends User {
	private String Firstname;
	private String Lastname;
	private String id_Proffessor;
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getId_Proffessor() {
		return id_Proffessor;
	}
	public void setId_Proffessor(String id_Proffessor) {
		this.id_Proffessor = id_Proffessor;
	}
	
}
