package cursoJava;

public class SwitchCase {
	public static void main(String[] args) {
		
		String profissao = "Desenvolvedor Júnior";
		
		float salario = 5000;
		float salarioBase;
		float salarioFinal;
		float adicional;
		
		switch (profissao) {
		case "Desenvolvedor Júnior":
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
		
		System.out.println("Função: " + profissao + "\n" + "Salário base: " 
		+ salarioBase + "\n" + "Adicional no salário: " + adicional + "\n" 
		+ "Salário final: " + salarioFinal);
	}

}
