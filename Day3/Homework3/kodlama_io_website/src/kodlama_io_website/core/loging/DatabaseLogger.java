package kodlama_io_website.core.loging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("log kayd� veritaban�na tutuldu : " + log);
	}

}
