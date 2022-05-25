package cursoJava;

public class Condicionais {
	public static void main(String[] args) {
		
		int nota1 = 80;
		int nota2 = 50;
		int nota3 = 80;
		int nota4 = 60;
		int media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		// Condi��o l�gica com If e Else
		if (media >= 70) {
			System.out.println("Aluno aprovado!");
		}
		else if (media > 40 && media < 70) {
			System.out.println("Aluno em recupera��o!");
		}else {
			System.out.println("Aluno reprovado!");
		}
		
		// Operadores tern�rios s�o para micro valida��es
		
		String saidaResultado = media >= 70 ? "Aluno Aprovado!" : (media > 40 && media < 70)? "Aluno em recupera��o" : "Aluno Reprovado!";
		
		System.out.println(saidaResultado);
	}
}
