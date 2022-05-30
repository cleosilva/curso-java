package orientacaoObjetos.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import orientacaoObjetos.Aluno;
import orientacaoObjetos.Disciplina;

public class App {
	public static void main(String[] args) {
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		for (int qtd = 1; qtd <= 2; qtd++) {
			
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno" +qtd+"?");
		/*String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
		String nascimento = JOptionPane.showInputDialog("Data de nascimento do aluno: ");
		String rg = JOptionPane.showInputDialog("Informe o RG do aluno: ");
		String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
		String mae = JOptionPane.showInputDialog("Informe o nome da Mãe do aluno: ");
		String pai = JOptionPane.showInputDialog("Informe o nome do Pai do aluno: ");
		String matricula = JOptionPane.showInputDialog("Informe a matricula do aluno: ");
		String serie = JOptionPane.showInputDialog("Informe a série do aluno: ");
		String escola = JOptionPane.showInputDialog("Informe a escola do aluno: ");*/
		
		
		// new Aluno() é uma instância(criação) de objeto;
		// aluno1 é uma referência para o objeto aluno;
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		// Integer.valueOf retorna um inteiro
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/
		
		
		for (int pos = 1; pos <= 1; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina" + pos +":");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina" + pos + ":");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) { // Opção SIM tem retorno zero
			
			int continuarRemover = 0;
			int posicao = 1;
			
			while (continuarRemover == 0) {				
				String removerDisciplina = JOptionPane.showInputDialog("Qual disciplina 1, 2, 3 ou 4?");
				aluno1.getDisciplinas().remove(Integer.valueOf(removerDisciplina).intValue() - posicao);
				continuarRemover = JOptionPane.showConfirmDialog(null, "Deseja continuar a remover?");
			}
		}
		
		
		/*
		 * O método toString é um método da classe de objeto 
		 * em java e é herdado por todas as classes em java por padrão. 
		 * Ele fornece a representação de string de qualquer objeto em java.
		 */
	
		alunos.add(aluno1);	
	}
	
		for (int pos = 0; pos < alunos.size(); pos++) {
			Aluno aluno = alunos.get(pos);
			
			if (aluno.getNome().equalsIgnoreCase("alex")) {
				
				Aluno trocar = new Aluno();
				trocar.setNome("Aluno foi trocado");
				
				Disciplina disciplina = new Disciplina();
				disciplina.setDisciplina("matemática");
				disciplina.setNota(96);
				
				trocar.getDisciplinas().add(disciplina);
				
				alunos.set(pos, trocar);
				aluno = alunos.get(pos);
			}
			
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Média: " + aluno.getMediaNota());
			System.out.println("Resultado: " + aluno.getAlunoAprovado());
			System.out.println("------------------------------------------------------");
		}
	}
}
