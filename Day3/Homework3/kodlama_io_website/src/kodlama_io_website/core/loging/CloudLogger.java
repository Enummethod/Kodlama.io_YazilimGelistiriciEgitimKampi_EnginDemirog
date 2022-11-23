package kodlama_io_website.core.loging;

public class CloudLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("log kaydý buluta tutuldu : " + log );
	}

}
