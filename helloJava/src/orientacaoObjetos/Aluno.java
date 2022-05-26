package orientacaoObjetos;

public class Aluno {
	
		// Esses são os atributos do aluno
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
		
		/* Inserindo métodos getters e setters
		 * SET é adicionar ou receber dados para os atributos
		 * GET é para resgatar ou obter o valor do atributo 
		*/ 
		
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
		
}

