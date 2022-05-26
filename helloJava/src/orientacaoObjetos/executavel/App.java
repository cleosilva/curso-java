package orientacaoObjetos.executavel;

import javax.swing.JOptionPane;

import orientacaoObjetos.Aluno;

public class App {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Informe o nome do aluno: ");
		String idade = JOptionPane.showInputDialog("Informe a idade do aluno: ");
		String nascimento = JOptionPane.showInputDialog("Data de nascimento do aluno: ");
		String rg = JOptionPane.showInputDialog("Informe o RG do aluno: ");
		String cpf = JOptionPane.showInputDialog("Informe o CPF do aluno: ");
		String mae = JOptionPane.showInputDialog("Informe o nome da Mãe do aluno: ");
		String pai = JOptionPane.showInputDialog("Informe o nome do Pai do aluno: ");
		String matricula = JOptionPane.showInputDialog("Informe a matricula do aluno: ");
		String serie = JOptionPane.showInputDialog("Informe a série do aluno: ");
		String escola = JOptionPane.showInputDialog("Informe a escola do aluno: ");
		String nota1 = JOptionPane.showInputDialog("Informe a primeira nota do aluno: ");
		String nota2 = JOptionPane.showInputDialog("Informe a segunda nota do aluno: ");
		String nota3 = JOptionPane.showInputDialog("Informe a terceira nota do aluno: ");
		String nota4 = JOptionPane.showInputDialog("Informe a quarta nota do aluno: ");
		
		
		// new Aluno() é uma instância(criação) de objeto;
		// aluno1 é uma referência para o objeto aluno;
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		// Integer.valueOf retorna um inteiro
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(nascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);
		// Double.parseDouble retorna um floatingDecimal
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		/*
		 * O método toString é um método da classe de objeto 
		 * em java e é herdado por todas as classes em java por padrão. 
		 * Ele fornece a representação de string de qualquer objeto em java.
		 */
		System.out.println(aluno1.toString());
		
		System.out.println("Data nascimento: " + aluno1.getDataNascimento());
		System.out.println("Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado()? "Aprovado": "Reprovado"));
	}
}
