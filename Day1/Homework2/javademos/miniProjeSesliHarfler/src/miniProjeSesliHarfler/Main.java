package miniProjeSesliHarfler;

public class Main {
	public static void main(String[] args) {
		char harf = 'a';
		switch (harf) {
		case 'E', '�', '�', '�', 'e', 'i', '�', '�': {
			System.out.println(harf + " Harfi �nce Seslidir...");
			break;
		}
		case 'A', 'I', 'O', 'U', 'a', '�', 'o', 'u': {
			System.out.println(harf + " Harfi Kal�n Seslidir...");
			break;
		}
		default:
			System.out.println(harf + " Ge�ersiz Giri� Yapt�n�z.");
		}
	}
}
