package orientacaoObjetos.executavel;

import orientacaoObjetos.Aluno;

public class App {
	public static void main(String[] args) {
		
		// new Aluno() � uma inst�ncia(cria��o) de objeto;
		// aluno1 � uma refer�ncia para o objeto aluno;
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Preta Maria");
		aluno1.setIdade(40);
		aluno1.setDataNascimento("19/06/1981");
		
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data nascimento: " + aluno1.getDataNascimento());
	}
}
