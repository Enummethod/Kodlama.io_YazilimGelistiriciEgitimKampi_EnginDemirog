package oopWithNLayeredApp.core.logging;

public class DatabeseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritaban�na logland� : " + data);
	}

}
