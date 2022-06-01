package cursoJava.interfaces;

/* A interface será um contrato de autenticação */
public interface PermitirAcesso {
	
	/* Apenas declaração do método */
	public boolean autenticar(String login, String senha);
	
}
