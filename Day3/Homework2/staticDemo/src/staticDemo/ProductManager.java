package staticDemo;

public class ProductManager {
	
	public  void  add(Product product) {
		if (ProductValidotor.isValid(product)) {
			System.out.println("�r�n Eklendi.");
		}else {
			System.out.println("�r�n bilgileri Ge�ersiz.");
		}
		
		
	}

}
