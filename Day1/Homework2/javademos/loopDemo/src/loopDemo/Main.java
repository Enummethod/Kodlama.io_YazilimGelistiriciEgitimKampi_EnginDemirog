package loopDemo;

public class Main {

	public static void main(String[] args) {

		// For loop - 2'nin 10 kadar olan katlarýný ekrana yazan program

		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("Döngü bitti.");

// While Loop
		int i = 2;

		while (i <= 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While döngüsü bitti.");
		
		// Do-While Döngüsü
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("Do While Döngüsü Bitti");
	}
}

