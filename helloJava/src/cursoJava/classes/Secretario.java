package cursoJava.classes;

import cursoJava.interfaces.PermitirAcesso;

public class Secretario extends Pessoa implements PermitirAcesso {
	private String registro;
	private String nivelCargo;
	private String experiencia;

	
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		double salario = 3000;
		double bonificacao = salario * 0.20;
		double novoSalario = salario + bonificacao;
		return novoSalario;
	}
	/**/
	@Override
	public boolean autenticar(String login, String senha) {	
		return login.equals("admin") && senha.equals("admin");
	}
	
}
