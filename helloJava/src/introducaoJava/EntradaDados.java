package introducaoJava;

import javax.swing.JOptionPane;

public class EntradaDados {
	public static void main(String[] args) {
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros: ");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas: ");
		
		int carrosNumero = Integer.parseInt(carros);
		int pessoasNumero = Integer.parseInt(pessoas);
		
		int divisao = (carrosNumero / pessoasNumero);
		
		int resto = carrosNumero % pessoasNumero;
		
		int resposta = JOptionPane.showConfirmDialog( null,"Deseja ver o resultado da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, "A divis�o de carros por pessoa deu: " + divisao);
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divis�o?");
		
		if (resposta == 0) {
			JOptionPane.showMessageDialog(null, " o resto da divis�o �: " + resto);
		}
	}
}
