package kodlama_io_website.core.loging;

public class FileLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("log kayd� dosyaya tutuldu : " + log);
	}

}
