package polymorphism;

public class Main {
	public static void main(String[] args) {
   //EmailLogger logger = new EmailLogger();
    //logger.Log("log mesaj�");
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
	}

}
