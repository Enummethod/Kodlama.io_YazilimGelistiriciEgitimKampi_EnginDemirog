package classesWithAttributes;

public class ProductManager {
 
	public void add(Product product) {
		//JDBC kodlar� ile veritaban�na kay�t yap�l�r.
		System.out.println("�r�n eklendi " + product.getName());
	}
	
}
