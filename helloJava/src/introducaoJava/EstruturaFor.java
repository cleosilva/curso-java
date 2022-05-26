package introducaoJava;

public class EstruturaFor {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			//System.out.println("O índice atual é: " + i);
		}
		
		for (int i = 10; i >= 0; i--) {
			//System.out.println("O índice descrescente é: " + i);
		}
		
		// Estrutura de repetição FOR com Break
		for (int i = 0; i <= 10; i++) {
			if (i == 5) {
				//System.out.println("Oba...encontrei o nº: " + i);
				break;
			}
		}
		
		// Estrutura de repetição FOR com continue
		for (int i = 0; i <= 10; i++) {
			if (i == 3 || i == 5 || i == 7 ) { // pula o número 5 e continua a iteração
				System.out.println("Obaaa, encontrei o " +i);
				continue;
			}
			System.out.println(i);
		}
		}
}
