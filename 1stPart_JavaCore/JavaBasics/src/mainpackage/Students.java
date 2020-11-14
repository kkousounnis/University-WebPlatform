package mainpackage;

/**
 * @author kwnstantinos
 *edw exoume thn klash users sthn opoia exoume ta antistoixa xarakthristhka
 */
public class Students extends Users{
	private static int Rnumber=18000;//18 means the year 2018
	private int age;
	private int am;//ARI8MOS MITROOU
	
	public Students() {
		super();
		//costructor of the class Students
		Rnumber++;
 	}
	
	public int getregistretionNumber() {
		return Rnumber;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setAm(int am) {
		this.am=am;
	}
	public int getAm() {
		return am;
	}
	

	@Override
	public void setPhone(int Phone) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPhone() {
		// TODO Auto-generated method stub
		return 0;
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
	
	

}
