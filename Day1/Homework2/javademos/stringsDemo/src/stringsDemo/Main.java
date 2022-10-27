package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bug�n Hava �ok G�zel.";
		System.out.println(mesaj);

		System.out.println(mesaj.concat(" Ya�as�n!"));

		System.out.println(mesaj.startsWith("Bu"));
		System.out.println(mesaj.endsWith("."));

		char[] karekterler = new char[5];
		mesaj.getChars(0, 5, karekterler, 0);
		System.out.println(karekterler);

		System.out.println(mesaj.indexOf("Bu"));

		System.out.println(mesaj.lastIndexOf("e"));

	}

}
