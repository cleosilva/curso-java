package orientacaoObjetos.executavel;

import javax.swing.JOptionPane;

import orientacaoObjetos.Aluno;
import orientacaoObjetos.Disciplina;

public class Arrays {
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
		
		System.out.println("Aluno: " + aluno.getNome() + " - Escola: " + aluno.getNomeEscola());
		
		for (Disciplina d : aluno.getDisciplinas()) {
			
			System.out.println("Disciplina: " + d.getDisciplina());
			System.out.println("As notas da disciplina são: ");
			
			// variável auxiliar
			double notaMax = 0.0;
			double notaMinima = 0.0;
			
			for (int i = 0; i < d.getNota().length; i++) {
				System.out.println("Nota " + (i+1) + " é igual = " + d.getNota()[i]);
				
				/* Descobrindo a maior nota */
				if (i == 0) {
					notaMax = d.getNota()[i];
				} else {
					if (d.getNota()[i] > notaMax) {
						notaMax = d.getNota()[i];
					}
				}
				/* Descobrindo a menor nota */
				if (i == 0) {
					notaMinima = d.getNota()[i];
				} else {
					if (d.getNota()[i] < notaMinima) {
						notaMinima = d.getNota()[i];
					}
				}
			}
			System.out.println("A maior nota da disciplina " + d.getDisciplina() + " e de valor: " + notaMax);
			System.out.println("A menor nota da disciplina " + d.getDisciplina() + " e de valor: " + notaMinima);
		}
		
	}
}
