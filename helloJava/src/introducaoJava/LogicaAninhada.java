package introducaoJava;

public class LogicaAninhada {
	public static void main(String[] args) {
		int idade = 18;
		boolean acessoPremium = false;
		
		// voc� pode realizar quantos if e else aninhados for preciso
		if (idade >= 18) {
			if (acessoPremium) {
				System.out.println("Voc� pode ver a lista de filmes vip.");
			} else {
				System.out.println("Voc� pode ver a lista padr�o de filmes.");
			}
		} else {
			System.out.println("Voc� pode ver a lista de filmes sem restri��o de idade");
		}
	}
}
