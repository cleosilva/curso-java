package orientacaoObjetos;

import java.util.Objects;

public class Aluno {
	
		// Esses s�o os atributos do aluno
		private String nome;
		private int idade;
		private String dataNascimento;
		private String registroGeral;
		private String numeroCpf;
		private String nomeMae;
		private String nomePai;
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		
		
		private Disciplina disciplina = new Disciplina();
		
		public void setDisciplina(Disciplina disciplina) {
			this.disciplina = disciplina;
		}
		
		public Disciplina getDisciplina() {
			return disciplina;
		}
		
		/* Inserindo m�todos getters e setters
		 * SET � adicionar ou receber dados para os atributos
		 * GET � para resgatar ou obter o valor do atributo 
		*/ 
		
		// void significa que o m�todo n�o vai retornar apenas receber
		public void setNome(String nome) {
			/* this.nome faz refer�ncia ao atributo da classe,
			 nome faz refer�ncia ao par�metro do m�todo que ser� recebido */
			this.nome = nome; 
		}
		
		public String getNome() {
			// retorna o nome recebido para o atributo
			return nome;
		}

		public int getIdade() {
			return idade;
		}

		public void setIdade(int idade) {
			this.idade = idade;
		}

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
			this.dataNascimento = dataNascimento;
		}

		public String getRegistroGeral() {
			return registroGeral;
		}

		public void setRegistroGeral(String registroGeral) {
			this.registroGeral = registroGeral;
		}

		public String getNumeroCpf() {
			return numeroCpf;
		}

		public void setNumeroCpf(String numeroCpf) {
			this.numeroCpf = numeroCpf;
		}

		public String getNomeMae() {
			return nomeMae;
		}

		public void setNomeMae(String nomeMae) {
			this.nomeMae = nomeMae;
		}

		public String getNomePai() {
			return nomePai;
		}

		public void setNomePai(String nomePai) {
			this.nomePai = nomePai;
		}

		public String getDataMatricula() {
			return dataMatricula;
		}

		public void setDataMatricula(String dataMatricula) {
			this.dataMatricula = dataMatricula;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculado() {
			return serieMatriculado;
		}

		public void setSerieMatriculado(String serieMatriculado) {
			this.serieMatriculado = serieMatriculado;
		}

		// M�todo para retorna a m�dia do aluno
		public double getMediaNota() {
			return (disciplina.getNota1() + disciplina.getNota2() 
			+ disciplina.getNota3() + disciplina.getNota4()) / 4;
		}
		
		public boolean getAlunoAprovado() {
			double media = this.getMediaNota();
			if (media >= 70) {
				return true;
			} else {
				return false;
			}
		}

		
		@Override
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado + ", disciplina=" + disciplina + "]";
		}

		// Utilizando o m�todo hashCode para identificar CPF's iguais
		@Override
		public int hashCode() {
			return Objects.hash(numeroCpf);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			return Objects.equals(numeroCpf, other.numeroCpf);
		}
		
}

