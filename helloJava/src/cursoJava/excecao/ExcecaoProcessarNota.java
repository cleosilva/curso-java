package cursoJava.excecao;

public class ExcecaoProcessarNota extends Exception{
	
	public ExcecaoProcessarNota(String erro) {
		super("Eita! Erro ao processar a nota." + erro);
	}
}
