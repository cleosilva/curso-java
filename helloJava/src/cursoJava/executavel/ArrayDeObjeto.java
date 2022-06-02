package cursoJava.executavel;

import cursoJava.classes.Aluno;
import cursoJava.classes.Disciplina;

public class ArrayDeObjeto {
	public static void main(String[] args) {
		/* Trabalhando com array de notas */
		double[] notas = {9.8, 7.5, 8.6, 6};
		double[] notasNode = {10, 8.5, 7.5, 7.9};
		
		// Criando o aluno
		Aluno aluno = new Aluno();
		aluno.setNome("Preta");
		aluno.setNomeEscola("JDev Treinamento");
		
		// Criando a disciplina
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Java");
		disciplina.setNota(notas);
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Node");
		disciplina2.setNota(notasNode);
		
		aluno.getDisciplinas().add(disciplina2);
		
		Aluno[] arrayAlunos = new Aluno[1];
		
		arrayAlunos[0] = aluno;
		
		
		for (int pos = 0; pos < arrayAlunos.length; pos++) {
			System.out.println("Nome do aluno é: " + arrayAlunos[pos].getNome());
			
			for (Disciplina d: arrayAlunos[pos].getDisciplinas()) {
				System.out.println("Nome da disciplina: " + d.getDisciplina());
				
				for (int posNota = 0; posNota < d.getNota().length; posNota++) {
					System.out.println("A nota número " + posNota + " é igual = " + d.getNota()[posNota]);
				}
			}
		}
		
	}
}
