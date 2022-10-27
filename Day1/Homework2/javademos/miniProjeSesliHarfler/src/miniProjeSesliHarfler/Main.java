package miniProjeSesliHarfler;

public class Main {
	public static void main(String[] args) {
		char harf = 'a';
		switch (harf) {
		case 'E', 'Ý', 'Ö', 'Ü', 'e', 'i', 'ö', 'ü': {
			System.out.println(harf + " Harfi Ýnce Seslidir...");
			break;
		}
		case 'A', 'I', 'O', 'U', 'a', 'ý', 'o', 'u': {
			System.out.println(harf + " Harfi Kalýn Seslidir...");
			break;
		}
		default:
			System.out.println(harf + " Geçersiz Giriþ Yaptýnýz.");
		}
	}
}
