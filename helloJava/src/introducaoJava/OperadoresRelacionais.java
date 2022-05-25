package introducaoJava;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		/* 
		 * Os operadores relacionais são:
		 * 
		 * == (igual)
		 * != (diferente)
		 * > (maior que)
		 * < (menor que)
		 * >= (maior e igual que)
		 * <= (menor e igual que)
		 * 
		 */
		
		int numero1 = 10;
		int numero2 = 100;
		
		if (numero1 == numero2) {
			System.out.println("Os números são iguais.");
		}else if (numero1 > numero2) {
			System.out.println("O número 1 é maior que o número 2");
		} else {
			System.out.println("O número 1 é menor que o número 2");
		}

	}
}
