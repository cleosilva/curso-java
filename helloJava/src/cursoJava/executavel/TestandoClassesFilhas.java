package cursoJava.executavel;

import cursoJava.classes.Aluno;
import cursoJava.classes.Diretor;
import cursoJava.classes.Secretario;

public class TestandoClassesFilhas {
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Preta Maria");
		
		Secretario secretario = new Secretario();
		secretario.setNome("José Lucas");
		
		Diretor diretor = new Diretor();
		diretor.setNome("Ana Luisa");
		
		System.out.println("Nome do aluno: " + aluno.getNome());
		System.out.println("Salário: " + aluno.salario());
		System.out.println("Nome do secretário: " + secretario.getNome());
		System.out.println("Salário: " + secretario.salario());
		System.out.println("Nome do Diretor: " + diretor.getNome());
		System.out.println("Salário; " + diretor.salario());
		
		
	}
}
