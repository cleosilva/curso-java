package cursoJava.interfaces;

/* A interface ser� um contrato de autentica��o */
public interface PermitirAcesso {
	
	/* Apenas declara��o do m�todo */
	public boolean autenticar(String login, String senha);
	
}
