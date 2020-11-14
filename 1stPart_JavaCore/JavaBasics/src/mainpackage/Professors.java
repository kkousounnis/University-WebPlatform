package mainpackage;

/**
 * @author kwnstantinos
 *
 *edw exoume thn klash users sthn opoia exoume ta antistoixa xarakthristhka
 */
public class Professors extends Users {

	@Override
	public int getregistretionNumber() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private int phone;
	public Professors () {
		super();//constructor
	}
	public void setPhone(int phone) {
		this.phone=phone;
	}
	public int getPhone() {
		return phone;
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAm(int am) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getAm() {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
