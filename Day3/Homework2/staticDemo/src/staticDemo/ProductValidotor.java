package staticDemo;

public class ProductValidotor {
	
	static {
		System.out.println("Pij");
		
	}
	
	
	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
