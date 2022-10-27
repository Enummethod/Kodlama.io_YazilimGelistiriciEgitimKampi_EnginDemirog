package intro;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

		String ortaMetin = "Ýlginizi Çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println(ortaMetin);

		int vade = 12;

		double dolarDun = 18.14;
		double dolarBugun = 18.10;

		boolean dolarDustuMu = false;

		String okYonu = "down.svg";

		if (dolarBugun < dolarDun) {
			okYonu = "down.svg";

		} else if (dolarDustuMu) {
			okYonu = "up.svg";
		} else {

			okYonu = "equl.svg";
		}

		System.out.println(okYonu);

		// Array
		String[] krediler = { "Hýzlý Kredi", "Maaþýný Halkbanktan", "Mutlu Emekli" };
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}

	}
}