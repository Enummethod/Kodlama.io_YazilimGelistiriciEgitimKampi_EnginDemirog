package miniProje5SayiBulma;

public class Main {
	public static void main(String[] args) {
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
		System.out.println("Aranan sayı bulundu. Sayı diznin " + counter + ". elemanıdır.");
	}
}
