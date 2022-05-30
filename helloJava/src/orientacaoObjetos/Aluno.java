package orientacaoObjetos;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import cursoJava.constantes.StatusAluno;

public class Aluno extends Pessoa {
	
		// Esses são os atributos do aluno
		
		private String dataMatricula;
		private String nomeEscola;
		private String serieMatriculado;
		
		// dentro do operador diamante <> coloca o nome da classe
		private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
		
		public void setDisciplina(List<Disciplina> disciplinas) {
			this.disciplinas = disciplinas;
		}
		
		public List<Disciplina> getDisciplinas(){
			return disciplinas;
		}
		
		/* Inserindo métodos getters e setters
		 * SET é adicionar ou receber dados para os atributos
		 * GET é para resgatar ou obter o valor do atributo 
		*/ 
		
		// void significa que o método não vai retornar apenas receber
		public void setNome(String nome) {
			/* this.nome faz referência ao atributo da classe,
			 nome faz referência ao parâmetro do método que será recebido */
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

		// Método para retorna a média do aluno
		public double getMediaNota() {
			double somaNotas = 0.0;
			
			for (Disciplina disciplina: disciplinas) {
				somaNotas += disciplina.getNota();
			}
			
			return somaNotas / disciplinas.size();
		}
		
		public String getAlunoAprovado() {
			double media = this.getMediaNota();
			if (media >= 50) {
				if (media >= 70) {					
					return StatusAluno.APROVADO;
				} else {
					return StatusAluno.RECUPERACAO;
				}
			} else {
				return StatusAluno.REPROVADO;
			}
		}

		
		@Override // identifica um método sobrescrito
		public String toString() {
			return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento
					+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
					+ ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
					+ ", serieMatriculado=" + serieMatriculado + " ]";
		}

		// Utilizando o método hashCode para identificar CPF's iguais
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

