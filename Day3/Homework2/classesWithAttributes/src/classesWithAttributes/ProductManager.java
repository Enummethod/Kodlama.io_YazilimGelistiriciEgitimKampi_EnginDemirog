package classesWithAttributes;

public class ProductManager {
 
	public void add(Product product) {
		//JDBC kodlarý ile veritabanýna kayýt yapýlýr.
		System.out.println("Ürün eklendi " + product.getName());
	}
	
}
