package orientacaoObjetos.executavel;

import orientacaoObjetos.Aluno;
import orientacaoObjetos.Diretor;
import orientacaoObjetos.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Preta Maria");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Jos� Lucas");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Ana Luisa");
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Sal�rio: " + aluno.salario());
		System.out.println("Nome do secret�rio: " + secretario.getNome());
		System.out.println("Sal�rio: " + secretario.salario());
		System.out.println("Nome do Diretor: " + diretor.getNome());
		System.out.println("Sal�rio; " + diretor.salario());
		
		
	}
}
