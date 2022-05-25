package introducaoJava;

public class Operacoes {
	
	public static void main(String[] args) {
		// Variáveis Primitivas
		int idade = 18; // armazena um número inteiro
	    float cotacaoDolar = 5.0f; // armazena números com decimais
	    double cotacaoEuro = 6.0d; // também armazena números com decimais
	    char genero = 'F'; // armazena apenas uma letra. Deve-se usar aspas simples
	    byte placar = 0; // armazena números inteiros
	    boolean estaCadastrado = false; // armazena valores lógicos
		
	    // Variáveis não primitivas
	    String nome = "Maria"; // não é tipo primitivo e deve ser com aspas duplas
	        
	    System.out.println("Nome: " + nome + " | " + "Idade: " + idade + " | "  
	    		+ "Cotação do Dólar: " + cotacaoDolar + " | " + "Cotação do Euro: " 
	    		+ cotacaoEuro + " | " + "Gênero: " + genero + " | " + "Placar do Jogo: " 
	    		+ placar + " | " + "Está cadastrado na plataforma: " + estaCadastrado
	    );
	    
		// Operações com números
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		
		double mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média das notas é = " + mediaFinal);	
	}
}
