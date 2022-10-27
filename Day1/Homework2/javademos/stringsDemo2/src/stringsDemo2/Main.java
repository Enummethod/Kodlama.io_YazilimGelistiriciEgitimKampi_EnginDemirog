package stringsDemo2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "  Bugün Hava Çok Güzel.  ";
		System.out.println(mesaj);

		String yeniMesaj = mesaj.replace(' ', '_');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2, 13));

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());

		System.out.println(mesaj.trim());
	}

}
