package introducaoJava;

public class OperadoresRelacionais {
	public static void main(String[] args) {
		
		/* 
		 * Os operadores relacionais s�o:
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
			System.out.println("Os n�meros s�o iguais.");
		}else if (numero1 > numero2) {
			System.out.println("O n�mero 1 � maior que o n�mero 2");
		} else {
			System.out.println("O n�mero 1 � menor que o n�mero 2");
		}

	}
}
