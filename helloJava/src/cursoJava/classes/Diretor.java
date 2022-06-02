package cursoJava.classes;

/* A classe Diretor herda atributos da classe Pessoa */
public class Diretor extends Pessoa{
	private String registroEducacao;
	private int tempoDirecao;
	private String titulacao;
	
	
	public String getRegistroEducacao() {
		return registroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		this.registroEducacao = registroEducacao;
	}
	public int getTempoDirecao() {
		return tempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		this.tempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 6500.70;
	}
	
	
}
