package miniProjeAsalSayi;

public class Main {
	public static void main(String[] args) {
		int number = 10;
		boolean isPrime = true;

		if (number <= 1) {
			System.out.println("Geçersiz sayý girdiniz.");

		} else {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				System.out.println(number + " sayýsý asaldýr.");
			} else {
				System.out.println(number + " sayýsý asal deðildir.");
			}
		}
	}
}
