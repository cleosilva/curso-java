package cursoJava;

public class EstruturaWhile {
	public static void main(String[] args) {
		// Estrutura de repetição while 
		
		int numero = 0;
		
		while(numero <= 10) {
			System.out.println("O número atual é " + numero);
			numero++;
		}
		
		// Estrutura de repetição Do while
		
		int numero2 = 0;
		
		do { // primeiro executa depois verifica
			System.out.println("O número atual Do while é: " + numero2);
			numero2++;
		} while (numero2 <= 10);
	}
}
