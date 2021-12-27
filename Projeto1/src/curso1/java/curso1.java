package curso1.java;

public class curso1 {

	public static void main(String[] args) {

		/*
		 * int n1 = 60; int n2 = 60; int n3 = 60; int n4 = 60; int media = 0;
		 * 
		 * media = (n1 + n2 + n3 + n4) / 4;
		 */

		for (int num = 0; num <= 10; num++) {
			if (num == 2 || num == 4 || num == 7 || num == 8) {
				System.out.println("Encontrei o valor: " + num);
				continue;
			}

			System.out.println("processando laço de repetição");
		}

	}
}
