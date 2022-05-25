package introducaoJava;

public class LogicaAninhada {
	public static void main(String[] args) {
		int idade = 18;
		boolean acessoPremium = false;
		
		// você pode realizar quantos if e else aninhados for preciso
		if (idade >= 18) {
			if (acessoPremium) {
				System.out.println("Você pode ver a lista de filmes vip.");
			} else {
				System.out.println("Você pode ver a lista padrão de filmes.");
			}
		} else {
			System.out.println("Você pode ver a lista de filmes sem restrição de idade");
		}
	}
}
