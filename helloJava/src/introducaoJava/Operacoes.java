package introducaoJava;

public class Operacoes {
	
	public static void main(String[] args) {
		// Vari�veis Primitivas
		int idade = 18; // armazena um n�mero inteiro
	    float cotacaoDolar = 5.0f; // armazena n�meros com decimais
	    double cotacaoEuro = 6.0d; // tamb�m armazena n�meros com decimais
	    char genero = 'F'; // armazena apenas uma letra. Deve-se usar aspas simples
	    byte placar = 0; // armazena n�meros inteiros
	    boolean estaCadastrado = false; // armazena valores l�gicos
		
	    // Vari�veis n�o primitivas
	    String nome = "Maria"; // n�o � tipo primitivo e deve ser com aspas duplas
	        
	    System.out.println("Nome: " + nome + " | " + "Idade: " + idade + " | "  
	    		+ "Cota��o do D�lar: " + cotacaoDolar + " | " + "Cota��o do Euro: " 
	    		+ cotacaoEuro + " | " + "G�nero: " + genero + " | " + "Placar do Jogo: " 
	    		+ placar + " | " + "Est� cadastrado na plataforma: " + estaCadastrado
	    );
	    
		// Opera��es com n�meros
		double nota1 = 90;
		double nota2 = 70;
		double nota3 = 50;
		double nota4 = 88;
		
		double mediaFinal = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A m�dia das notas � = " + mediaFinal);	
	}
}
