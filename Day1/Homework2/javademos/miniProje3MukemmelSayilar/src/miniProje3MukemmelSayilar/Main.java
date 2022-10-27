package miniProje3MukemmelSayilar;

public class Main {
	public static void main(String[] args) {
		int number = 28;
		int total = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;
			}
		}
		if (total == number) {
			System.out.println(number + " Sayýsý mükemmel bir sayýdýr.");
		} else {
			System.out.println(number + " Sayýsý mükemmel bir sayý deðildir.");
		}
	}
}
