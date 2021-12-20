package curso1.java;

public class curso1 {

	public static void main(String[] args) {
		
		int n1 = 90;
		int n2 = 80;
		int n3 = 30;
		int n4 = 80;
		double media = 0;
		
		media = (n1 + n2 + n3 + n4) / 4;
		
		/*Operações lógicas aninhadas. operações dentro de operações*/
		if (media >= 50) {
			if (media >= 70) {
				System.out.println("Aluno aprovado direto");
			}else {
				System.out.println("Aluno em recuperação");
			}
		} else {
			System.out.println("Aluno reprovado");
		}
	}
}
