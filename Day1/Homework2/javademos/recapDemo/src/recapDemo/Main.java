package recapDemo;

public class Main {

	public static void main(String[] args) {
		// 3 say� i�inden en b�y���n� ekrana yazd�ran program:
		int sayi1 = 20;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi2;

		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		}
		if (enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		System.out.println("En B�y�k Say� : " + enBuyuk);
	}
}
