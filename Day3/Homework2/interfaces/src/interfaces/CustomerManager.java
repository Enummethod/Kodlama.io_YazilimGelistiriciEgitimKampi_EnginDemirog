package interfaces;

public class CustomerManager {

	ICustomerDal cutomerdalDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.cutomerdalDal = customerDal;
	}
	public  void  add() {
		// i� kodlar� yaz�l�r
		cutomerdalDal.add();
		
	}
}
