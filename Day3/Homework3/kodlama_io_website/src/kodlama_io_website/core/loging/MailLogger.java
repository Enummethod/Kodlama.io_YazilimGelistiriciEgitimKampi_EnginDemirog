package kodlama_io_website.core.loging;

public class MailLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("log kayd� maile g�nderildi :  " + log);
	}

}
