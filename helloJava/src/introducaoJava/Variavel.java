package introducaoJava;

public class Variavel {
	
	// Declarando variável global acessível a todos
	static int maiorIdadeGlobal = 30;
		
	public static void main(String[] args) {
		// Declarando variável local acessível somente ao método
		int maiorIdade = 18;
		System.out.println("Valor da variável local = " + maiorIdade);
			
		// Para executar o método deve chamá-lo dentro do main
		getVariavel();
	}
	
	public static void getVariavel() {
		System.out.println("Valor da variável global = " + maiorIdadeGlobal);
		//System.out.println(maiorIdade); // Erro não consegue acessar a variável local
	}

}
