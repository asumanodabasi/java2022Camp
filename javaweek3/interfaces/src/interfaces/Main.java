package interfaces;

public class Main {

	public static void main(String[] args) {
		//interaceler refereans tutuculardır 
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		
		customerManager.add();
	}

}
