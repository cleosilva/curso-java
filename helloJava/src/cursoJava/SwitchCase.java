package cursoJava;

public class SwitchCase {
	public static void main(String[] args) {
		
		String profissao = "Desenvolvedor J�nior";
		
		float salario = 5000;
		float salarioBase;
		float salarioFinal;
		float adicional;
		
		switch (profissao) {
		case "Desenvolvedor J�nior":
			salarioBase = salario;
			salarioFinal = salario *= 2.15;
			adicional = salarioFinal - salarioBase;
			break;
		case "Desenvolvedor Pleno":
			salarioBase = salario;
			salarioFinal = salario *= 1.10;
			adicional = salario - salarioBase;
			break;
		default:
			salarioBase = salario;
			salarioFinal = salario *= 1.05;
			adicional = salario - salarioBase;
		}
		
		System.out.println("Fun��o: " + profissao + "\n" + "Sal�rio base: " 
		+ salarioBase + "\n" + "Adicional no sal�rio: " + adicional + "\n" 
		+ "Sal�rio final: " + salarioFinal);
	}

}
