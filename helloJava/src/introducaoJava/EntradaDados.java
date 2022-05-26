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
		
		JOptionPane.showInternalMessageDialog(null, "A divisão de carros por pessoa deu: " + divisao + " carro(s)" 
				+ " e sobrou: " + resto + " carro(s)" );
	}
}
