package oop1;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Vade oraný";

		Product product1 = new Product();
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnitPrice(7500);
		product1.setDiscount(4);
		product1.setUnitInStock(3);
		product1.setImageUrl("bilmemne.jpg");

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrice(6500);
		product2.setDiscount(5);
		product2.setUnitInStock(2);
		product2.setImageUrl("bilmemne.jpg");

		Product product3 = new Product();
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrice(4500);
		product3.setDiscount(3);
		product3.setUnitInStock(1);
		product3.setImageUrl("bilmemne.jpg");

		Product[] products = { product1, product2, product3 };
		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0522222222");
		individualCustomer.setCustomerNumber("113");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroð");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0532254444");
		corporateCustomer.setCustomerNumber("184");
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setTaxNumber("121111221");
		
		Customer[] customer = {individualCustomer,corporateCustomer};
	}
}
