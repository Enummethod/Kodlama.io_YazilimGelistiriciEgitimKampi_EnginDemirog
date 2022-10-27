package switchDemo;

public class Main {

	//Bir öðrencinin aldýðý nota göre geçme durumunu gösteren program:
	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz Not Girdiniz.");
			break;
		 }

	  }
	}
