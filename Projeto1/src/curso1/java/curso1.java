package curso1.java;

public class curso1 {

	public static void main(String[] args) {
		
		int n1 = 60;
		int n2 = 60;
		int n3 = 60;
		int n4 = 60;
		int media = 0;
		
		media = (n1 + n2 + n3 + n4) / 4;
		
	/*Switch Case, operações EXATAS*/
		
	switch (media) {
	case 60:
		System.out.println("aprovado");
		break;

	default:System.out.println("Outro valor: " + media);
		break;
	}
	}
}
