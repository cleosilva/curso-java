package cursoJava.thread;

import javax.swing.JOptionPane;

public class AulaThread {
	public static void main(String[] args) throws InterruptedException {
		
		/* Thread processando em pararelo do envio do email*/
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		/* Thread processando em pararelo do envio de nota fiscal*/
		Thread threadNF = new Thread(thread2);
		threadNF.start();
			
		/* Código do sistema do usuário continua o fluxo de trabalho */
		System.out.println("Chegou ao fim do código de teste de Thread!");
		/* Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal, por exemplo */
		JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário.");
	}
	
	private static Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i <= 10; i++) {
				
				/* Executando com tempo de parada ou tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de e-mail.");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // Aguarda um segundo para executar o código
			}
			
		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			for (int i = 0; i <= 10; i++) {
				
				/* Executando com tempo de parada ou tempo determinado*/
				System.out.println("Executando alguma rotina, por exemplo envio de nota fiscal.");
				
				try {
					Thread.sleep(4000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} // Aguarda um segundo para executar o código
			}
	
		}
	};
}
