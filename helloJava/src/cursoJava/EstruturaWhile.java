package cursoJava;

public class EstruturaWhile {
	public static void main(String[] args) {
		// Estrutura de repeti��o while 
		
		int numero = 0;
		
		while(numero <= 10) {
			System.out.println("O n�mero atual � " + numero);
			numero++;
		}
		
		// Estrutura de repeti��o Do while
		
		int numero2 = 0;
		
		do { // primeiro executa depois verifica
			System.out.println("O n�mero atual Do while �: " + numero2);
			numero2++;
		} while (numero2 <= 10);
	}
}
