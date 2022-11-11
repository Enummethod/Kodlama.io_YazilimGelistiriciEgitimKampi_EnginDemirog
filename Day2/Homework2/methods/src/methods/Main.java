package methods;

public class Main {
	public static void main(String[] args) {
		findNumber();
		findNumber();
		findNumber();
		findNumber();
	}

	public static void findNumber() {
		int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
		int searchNumber = 5;
		boolean areThere = false;
		int counter = 0;

		for (int number : numbers) {
			counter = counter + 1;
			if (number == searchNumber) {
				areThere = true;
				break;
			}
		}
		if (areThere) {
			message(searchNumber + " Sayısı diznin " + counter + ". elemanıdır.");
		} else {
			message(searchNumber + " Sayısı dizinde yok...");
		}

	}

	public static void message(String message) {
		System.out.println(message);
	}

}
