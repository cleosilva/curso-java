package cursoJava;

public class EstruturaFor {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			//System.out.println("O �ndice atual �: " + i);
		}
		
		for (int i = 10; i >= 0; i--) {
			//System.out.println("O �ndice descrescente �: " + i);
		}
		
		// Estrutura de repeti��o FOR com Break
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				System.out.println("Oba...encontrei o n�: " + i);
				break;
			}
		}
		
		// Estrutura de repeti��o FOR com continue
		for (int i = 0; i <= 10; i++) {
			if (i == 5) { // pula o n�mero 5 e continua a itera��o
				continue;
			}
			System.out.println(i);
		}
	}
}
