package miniProje4ArkadashSayilar;

public class Main {
	public static void main(String[] args) {
		int number1 = 5020;
		int number2 = 5564;
		int total1 = 0;
		int total2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				total1 += i;
			}
		}

		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				total2 += j;
			}
		}

		if (total1 == number2 && number1 == total2) {
			System.out.println(number1 + " say�s� ile " + number2 + " say�s� arkada� say�lard�r.");
		} else {
			System.out.println(number1 + " say�s� ile " + number2 + " say�s� arkada� say� de�illerdir.");
		}
	}
}
