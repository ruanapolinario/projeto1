package curso1.java;

import javax.swing.JOptionPane;

public class curso1 {

	public static void main(String[] args) {

		String n1 = JOptionPane.showInputDialog("Informe a nota 1 do aluno:");
		String n2 = JOptionPane.showInputDialog("Informe a nota 2 do aluno:");
		String n3 = JOptionPane.showInputDialog("Informe a nota 3 do aluno:");
		String n4 = JOptionPane.showInputDialog("Informe a nota 4 do aluno:");

		double dNota1 = Double.parseDouble(n1);
		double dNota2 = Double.parseDouble(n2);
		double dNota3 = Double.parseDouble(n3);
		double dNota4 = Double.parseDouble(n4);

		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;

		/*
		 * media para aprovação = 70 media para reprovação = 50
		 */

		if (media >= 50) {
			if (media >= 70) {
				JOptionPane.showMessageDialog(null, "Aluno aprovado com media: " + media);
			} else {
				JOptionPane.showMessageDialog(null, "Aluno em recuperação com media: " + media);

			}
		}else {
			JOptionPane.showMessageDialog(null, "Aluno reprovado com media: " + media);
		}

		
	}
}
