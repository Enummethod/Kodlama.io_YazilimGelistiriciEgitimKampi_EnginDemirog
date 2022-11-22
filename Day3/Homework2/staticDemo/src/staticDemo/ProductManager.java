package staticDemo;

public class ProductManager {
	
	public  void  add(Product product) {
		if (ProductValidotor.isValid(product)) {
			System.out.println("Ürün Eklendi.");
		}else {
			System.out.println("Ürün bilgileri Geçersiz.");
		}
		
		
	}

}
