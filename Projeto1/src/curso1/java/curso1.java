package curso1.java;

import javax.swing.JOptionPane;

public class curso1 {

	public static void main(String[] args) {

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");

		/* Transformar string em double */
		double carroNum = Double.parseDouble(carros);
		double pessoaNum = Double.parseDouble(pessoas);

		/* Calcula a divisao e depois converte para inteiro */
		int cada = (int) (carroNum / pessoaNum);

		double resto = carroNum % pessoaNum;

		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Cada pessoa ficará com " + cada);
			
		}
		resposta = JOptionPane.showConfirmDialog(null, "Deseja saber quanto sobrou?");
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "Sobrou " + resto);
		}

		/*
		 * System.out.println("Cada pessoa ficará com " + cada + " e restará " + resto);
		 */

	}
}
