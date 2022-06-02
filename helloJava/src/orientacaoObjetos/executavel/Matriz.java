package orientacaoObjetos.executavel;

public class Matriz {
	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0] = 80;
		notas[0][1] = 90;
		notas[0][2] = 70;
		
		notas[1][0] = 40;
		notas[1][1] = 65;
		notas[1][2] = 88;
		
		/* o valor de i é a posição da linha e o valor de j é a posição da coluna*/
		// percorre as linhas
		for (int i = 0; i < notas.length; i++) {
			
			// percorre as colunas
			for (int j = 0; j < notas[i].length; j++) {
				System.out.println("Valores da matriz: " + notas[i][j]);;
			}
		}
	}
}
