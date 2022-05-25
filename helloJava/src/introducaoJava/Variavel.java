package introducaoJava;

public class Variavel {
	
	// Declarando vari�vel global acess�vel a todos
	static int maiorIdadeGlobal = 30;
		
	public static void main(String[] args) {
		// Declarando vari�vel local acess�vel somente ao m�todo
		int maiorIdade = 18;
		System.out.println("Valor da vari�vel local = " + maiorIdade);
			
		// Para executar o m�todo deve cham�-lo dentro do main
		getVariavel();
	}
	
	public static void getVariavel() {
		System.out.println("Valor da vari�vel global = " + maiorIdadeGlobal);
		//System.out.println(maiorIdade); // Erro n�o consegue acessar a vari�vel local
	}

}
