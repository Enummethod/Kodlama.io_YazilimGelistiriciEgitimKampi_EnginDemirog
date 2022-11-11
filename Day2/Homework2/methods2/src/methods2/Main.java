package methods2;

public class Main {
	public static void main(String[] args) {
		String message = "Bugün hava çok güzel.";
		String newMessage = giveCity();
		System.out.println(newMessage);
		int number = addition(12, 7, 23);
		System.out.println(number);
	}

	public static void add() {
		System.out.println("Eklendi");
	}

	public static void delete() {
		System.out.println("Silindi");
	}

	public static void update() {
		System.out.println("Güncellendi");
	}

	public static String giveCity() {
		return "Ýstanbul";
	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int addition(int... numbers) {

		int toplam = 0;

		for (int number : numbers) {
			toplam += number;
		}
		return toplam;
	}

}
